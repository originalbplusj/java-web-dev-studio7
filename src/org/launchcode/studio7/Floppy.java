package org.launchcode.studio7;

public class Floppy extends BaseDisc implements Disc{
    public Floppy(String discName, int yearReleased, String contents, String discType, int storageCapacity, int totalDiscData) {
        super(discName, yearReleased, contents, discType, storageCapacity, totalDiscData);
    }

    @Override
    public void spinDisc() {
        System.out.println("The floppy is spinning.");
    }

    @Override
    public void playDisc() {
        System.out.println("Would you like to play a game?");
    }

    @Override
    void fastForward() {
        System.out.println("Skip file");
    }

    @Override
    void readData() {
        System.out.println("Reading floppy disk.");
    }
}
