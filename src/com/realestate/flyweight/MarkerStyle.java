package com.realestate.flyweight;

public class MarkerStyle {
    private final String icon;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }
    public void display(String location) {
        System.out.println("Displaying marker at " + location + " with style: [Icon: "
                + icon + ", Color: " + color + ", Label: " + labelStyle + "]");
    }
}
