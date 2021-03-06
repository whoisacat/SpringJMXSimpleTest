package ru.eastwind.whoisacat.springbootjmxTest.mbeans;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@ManagedResource
@Component
public class SimpleMBean {

    private int intValue;

    private double doubleValue;

    private String stringValue;

    private Monster monster = new Monster();

    {
        monster.setLevel(10);
        monster.setHealth(100);
    }

    @ManagedAttribute
    public int getIntValue() {
        return intValue;
    }

    @ManagedAttribute
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @ManagedAttribute
    public double getDoubleValue() {
        return doubleValue;
    }

    @ManagedAttribute
    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    @ManagedAttribute
    public String getStringValue() {
        return stringValue;
    }

    @ManagedAttribute
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @ManagedAttribute
    public Monster getMonster() {
        return monster;
    }

    @ManagedAttribute
    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    @ManagedOperation
    public String writeToConsole(String str1, String str2) {
        String str3 = str1 + str2;
        System.out.println(str3);
        return str3;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(doubleValue);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + intValue;
        result = prime * result + ((monster == null) ? 0 : monster.hashCode());
        result = prime * result
                + ((stringValue == null) ? 0 : stringValue.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleMBean other = (SimpleMBean) obj;
        if (Double.doubleToLongBits(doubleValue) != Double
                .doubleToLongBits(other.doubleValue))
            return false;
        if (intValue != other.intValue)
            return false;
        if (monster == null) {
            if (other.monster != null)
                return false;
        } else if (!monster.equals(other.monster))
            return false;
        if (stringValue == null) {
            if (other.stringValue != null)
                return false;
        } else if (!stringValue.equals(other.stringValue))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SimpleMBean [intValue=" + intValue + ", doubleValue="
                + doubleValue + ", stringValue=" + stringValue + ", monster="
                + monster + "]";
    }


}
