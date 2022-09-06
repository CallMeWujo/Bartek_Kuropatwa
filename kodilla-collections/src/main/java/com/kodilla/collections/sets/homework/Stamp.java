package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int stampLenght;
    private boolean stampedStamp;

    public Stamp(String stampName, int stampDimensions, boolean stampedStamp) {
        this.stampName = stampName;
        this.stampLenght = stampDimensions;
        this.stampedStamp = stampedStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public int getStampDimensions() {
        return stampLenght;
    }

    public boolean isStampedStamp() {
        return stampedStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return stampLenght == stamp.stampLenght && isStampedStamp() == stamp.isStampedStamp() && Objects.equals(getStampName(), stamp.getStampName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), stampLenght, isStampedStamp());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampLenght=" + stampLenght +
                ", stampedStamp=" + stampedStamp +
                '}';
    }
}
