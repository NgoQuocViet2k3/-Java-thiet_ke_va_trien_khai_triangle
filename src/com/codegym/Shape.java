package com.codegym;

public class Shape {
    private String color = "blue";
    private boolean filled = true;

    public Shape() {
        this.color = "blue";
        this.filled = true;
    }

    public Shape(String color,boolean filled) {
        this.color = color;
        this.filled = true;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                "filled=" + filled + '\'' +
                '}';
    }
}
