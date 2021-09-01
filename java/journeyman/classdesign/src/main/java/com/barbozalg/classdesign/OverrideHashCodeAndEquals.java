package com.barbozalg.classdesign;


public class OverrideHashCodeAndEquals {

    public String evalEqualsMethod(ClassToBeOverridden one, ClassToBeOverridden two) {
        return "Test: values one and two are " + ((one.equals(two))? "" : "not ") + "equal";
    }

    public String evalHashCodeMethod(ClassToBeOverridden one, ClassToBeOverridden three) {
        return "Test: values one and three are " + ((one.hashCode() == three.hashCode())? "" : "not ") + "equal";
    }
}

class ClassToBeOverridden {
    private int value;

    ClassToBeOverridden(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if ((o instanceof ClassToBeOverridden) && (((ClassToBeOverridden) o).getValue() == this.value)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (value / 11);
        return result;
    }
}
