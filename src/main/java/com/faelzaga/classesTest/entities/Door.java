package main.java.com.faelzaga.classesTest.entities;

public class Door {
    private String color;
    private double dimensionX, getDimensionY, getDimensionZ;
    private boolean isOpen;

    public Door(String color, double dimensionX, double getDimensionY, double getDimensionZ) {
        if (!checkDimensions(dimensionX, getDimensionY, getDimensionZ)) {
            throw new RuntimeException("Wrong dimension sizes");
        }
        this.color = color;
        this.dimensionX = dimensionX;
        this.getDimensionY = getDimensionY;
        this.getDimensionZ = getDimensionZ;
        isOpen = false;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
        }
    }

    public void colorIt(String color) {
        this.color = color;
    }

    public void setDimensions(double dimensionX, double getDimensionY, double getDimensionZ) {
        if (!checkDimensions(dimensionX, getDimensionY, getDimensionZ)) {
            throw new RuntimeException("Wrong dimension sizes");
        }
        this.dimensionX = dimensionX;
        this.getDimensionY = getDimensionY;
        this.getDimensionZ = getDimensionZ;
    }

    public boolean checkDimensions(double dimensionX, double getDimensionY, double getDimensionZ) {
        if (dimensionX < 0 || getDimensionY < 0  || getDimensionZ < 0) {
            return false;
        }
        return true;
    }

    public boolean getDoorOpen() {
        if (isOpen) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Door{" +
                "color='" + color + '\'' +
                ", dimensionX=" + dimensionX +
                ", getDimensionY=" + getDimensionY +
                ", getDimensionZ=" + getDimensionZ +
                ", isOpen=" + isOpen +
                '}';
    }
}
