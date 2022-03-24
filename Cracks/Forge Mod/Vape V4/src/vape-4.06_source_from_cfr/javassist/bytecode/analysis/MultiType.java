/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import java.util.HashMap;
import java.util.Map;
import javassist.CtClass;
import javassist.bytecode.analysis.Type;

public class MultiType
extends Type {
    private Map<String, CtClass> interfaces;
    private Type resolved;
    private Type potentialClass;
    private MultiType mergeSource;
    private boolean changed = false;

    public MultiType(Map<String, CtClass> map) {
        this(map, null);
    }

    public MultiType(Map<String, CtClass> map, Type type) {
        super(null);
        this.interfaces = map;
        this.potentialClass = type;
    }

    @Override
    public CtClass getCtClass() {
        if (this.resolved != null) {
            return this.resolved.getCtClass();
        }
        return Type.OBJECT.getCtClass();
    }

    @Override
    public Type getComponent() {
        return null;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean isArray() {
        return false;
    }

    @Override
    boolean popChanged() {
        boolean bl = this.changed;
        this.changed = false;
        return bl;
    }

    @Override
    public boolean isAssignableFrom(Type type) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean isAssignableTo(Type type) {
        Map<String, CtClass> map;
        if (this.resolved != null) {
            return type.isAssignableFrom(this.resolved);
        }
        if (Type.OBJECT.equals(type)) {
            return true;
        }
        if (this.potentialClass != null && !type.isAssignableFrom(this.potentialClass)) {
            this.potentialClass = null;
        }
        if ((map = this.mergeMultiAndSingle(this, type)).size() == 1 && this.potentialClass == null) {
            this.resolved = Type.get(map.values().iterator().next());
            this.propogateResolved();
            return true;
        }
        if (map.size() >= 1) {
            this.interfaces = map;
            this.propogateState();
            return true;
        }
        if (this.potentialClass != null) {
            this.resolved = this.potentialClass;
            this.propogateResolved();
            return true;
        }
        return false;
    }

    private void propogateState() {
        MultiType multiType = this.mergeSource;
        while (multiType != null) {
            multiType.interfaces = this.interfaces;
            multiType.potentialClass = this.potentialClass;
            multiType = multiType.mergeSource;
        }
    }

    private void propogateResolved() {
        MultiType multiType = this.mergeSource;
        while (multiType != null) {
            multiType.resolved = this.resolved;
            multiType = multiType.mergeSource;
        }
    }

    @Override
    public boolean isReference() {
        return true;
    }

    private Map<String, CtClass> getAllMultiInterfaces(MultiType multiType) {
        HashMap<String, CtClass> hashMap = new HashMap<String, CtClass>();
        for (CtClass ctClass : multiType.interfaces.values()) {
            hashMap.put(ctClass.getName(), ctClass);
            this.getAllInterfaces(ctClass, hashMap);
        }
        return hashMap;
    }

    private Map<String, CtClass> mergeMultiInterfaces(MultiType multiType, MultiType multiType2) {
        Map<String, CtClass> map = this.getAllMultiInterfaces(multiType);
        Map<String, CtClass> map2 = this.getAllMultiInterfaces(multiType2);
        return this.findCommonInterfaces(map, map2);
    }

    private Map<String, CtClass> mergeMultiAndSingle(MultiType multiType, Type type) {
        Map<String, CtClass> map = this.getAllMultiInterfaces(multiType);
        Map<String, CtClass> map2 = this.getAllInterfaces(type.getCtClass(), null);
        return this.findCommonInterfaces(map, map2);
    }

    private boolean inMergeSource(MultiType multiType) {
        while (multiType != null) {
            if (multiType == this) {
                return true;
            }
            multiType = multiType.mergeSource;
        }
        return false;
    }

    @Override
    public Type merge(Type type) {
        Map<String, CtClass> map;
        if (this == type) {
            return this;
        }
        if (type == UNINIT) {
            return this;
        }
        if (type == BOGUS) {
            return BOGUS;
        }
        if (type == null) {
            return this;
        }
        if (this.resolved != null) {
            return this.resolved.merge(type);
        }
        if (this.potentialClass != null && (!((Type)((Object)(map = this.potentialClass.merge(type)))).equals(this.potentialClass) || ((Type)((Object)map)).popChanged())) {
            this.potentialClass = Type.OBJECT.equals(map) ? null : map;
            this.changed = true;
        }
        if (type instanceof MultiType) {
            MultiType multiType = (MultiType)type;
            if (multiType.resolved != null) {
                map = this.mergeMultiAndSingle(this, multiType.resolved);
            } else {
                map = this.mergeMultiInterfaces(multiType, this);
                if (!this.inMergeSource(multiType)) {
                    this.mergeSource = multiType;
                }
            }
        } else {
            map = this.mergeMultiAndSingle(this, type);
        }
        if (map.size() > 1 || map.size() == 1 && this.potentialClass != null) {
            if (map.size() != this.interfaces.size()) {
                this.changed = true;
            } else if (!this.changed) {
                for (String string : map.keySet()) {
                    if (this.interfaces.containsKey(string)) continue;
                    this.changed = true;
                }
            }
            this.interfaces = map;
            this.propogateState();
            return this;
        }
        this.resolved = map.size() == 1 ? Type.get(map.values().iterator().next()) : (this.potentialClass != null ? this.potentialClass : OBJECT);
        this.propogateResolved();
        return this.resolved;
    }

    @Override
    public int hashCode() {
        if (this.resolved != null) {
            return this.resolved.hashCode();
        }
        return this.interfaces.keySet().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MultiType)) {
            return false;
        }
        MultiType multiType = (MultiType)object;
        if (this.resolved != null) {
            return this.resolved.equals(multiType.resolved);
        }
        if (multiType.resolved != null) {
            return false;
        }
        return this.interfaces.keySet().equals(multiType.interfaces.keySet());
    }

    @Override
    public String toString() {
        if (this.resolved != null) {
            return this.resolved.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        for (String string : this.interfaces.keySet()) {
            stringBuffer.append(string).append(", ");
        }
        if (this.potentialClass != null) {
            stringBuffer.append("*").append(this.potentialClass.toString());
        } else {
            stringBuffer.setLength(stringBuffer.length() - 2);
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}

