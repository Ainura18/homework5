package com.realestate.proxy;

public class ImageProxy implements Image {
    private String fileName;
    private HighResolutionImage highResImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail (fast) for: " + fileName);
    }

    @Override
    public void displayFullImage() {
        if (highResImage == null) {
            highResImage = new HighResolutionImage(fileName);
        }
        highResImage.displayFullImage();
    }
}
