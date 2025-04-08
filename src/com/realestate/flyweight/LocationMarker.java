package com.realestate.flyweight;

public class LocationMarker {
    private String location;
    private MarkerStyle style;

    public LocationMarker(String location, MarkerStyle style) {
        this.location = location;
        this.style = style;
    }
    public void render() {
        style.display(location);
    }
}
