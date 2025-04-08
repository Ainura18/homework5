package com.realestate.proxy;

public class HighResolutionImage implements Image {
    private String fileName;

    public HighResolutionImage(String fileName) {
        this.fileName = fileName;
        loadFullImage();
    }

    private void loadFullImage() {
        System.out.println("Loading high-resolution image: " + fileName);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail for: " + fileName);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full high-resolution image: " + fileName);
    }
}
