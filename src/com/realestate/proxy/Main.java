package com.realestate.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("house1.jpg");
        image.displayThumbnail();

        image.displayFullImage();

        Agent agent1 = new Agent("Ayan", true);
        Agent agent2 = new Agent("Dana", false);

        if (agent1.canUploadImage()) {
            System.out.println(agent1 + " жүктей алады");
        } else {
            System.out.println(agent1 + " жүктей алмайды");
        }

        if (agent2.canUploadImage()) {
            System.out.println(agent2 + " жүктей алады");
        } else {
            System.out.println(agent2 + " жүктей алмайды");
        }
    }
}
