package com.barbozalg.classdesign;


final public class InmutableObject{

    final private int xPosition;
    final private int yPosition;
    final private int width;
    final private int heigh;
    final private String name;

    private void check(int xPosition, int yPosition, int width, int heigh) {
        if (xPosition < 0 || xPosition > 1920 || yPosition < 0 || yPosition > 1080
            || width < 0 || 1920 - xPosition > width || heigh < 0 || 1080 - yPosition > heigh) {
            throw new IllegalArgumentException();
        }
    }

    public InmutableObject(int xPosition, int yPosition, int width, int heigh, String name) {
        check(xPosition, yPosition, width, heigh);
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.heigh = heigh;
        this.name = name;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigh() {
        return heigh;
    }

    public String getName() {
        return name;
    }

    public InmutableObject moveObject(int xPosition, int yPosition) {
        return new InmutableObject(xPosition, yPosition, this.width, this.heigh, this.name);
    }

    public InmutableObject resizeObject(int width, int heigh) {
        return new InmutableObject(this.xPosition, this.yPosition, width, heigh, this.name);
    }

    public InmutableObject changeObjectName(String name) {
        return new InmutableObject(this.xPosition, this.yPosition, this.width, this.heigh, name);
    }
}
