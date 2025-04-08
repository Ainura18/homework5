package com.realestate.flyweight;
import java.util.ArrayList;
import java.util.List;

public class MainFlyweight {
    public static void main(String[] args) {
        List<LocationMarker> markers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            MarkerStyle hospitalStyle = MarkerStyleFactory.getStyle("hospital", "red", "bold");
            markers.add(new LocationMarker("Hospital " + i, hospitalStyle));

            MarkerStyle restaurantStyle = MarkerStyleFactory.getStyle("restaurant", "blue", "italic");
            markers.add(new LocationMarker("Restaurant " + i, restaurantStyle));

            MarkerStyle gasStyle = MarkerStyleFactory.getStyle("gas", "green", "normal");
            markers.add(new LocationMarker("GasStation " + i, gasStyle));
        }
        for (LocationMarker marker : markers) {
            marker.render();
        }
        System.out.println("\nTotal markers: " + markers.size());
        System.out.println("Unique style objects: " + MarkerStyleFactory.getStyleCount());
    }
}
