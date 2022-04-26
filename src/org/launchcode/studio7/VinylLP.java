package org.launchcode.studio7;

public class VinylLP extends BaseDisc implements Disc{

    public VinylLP(String discName, int yearReleased, String contents, String discType, int storageCapacity, int totalDiscData) {
        super(discName, yearReleased, contents, discType, storageCapacity, totalDiscData);
    }

    @Override
    public void spinDisc() {
        System.out.println("The record is spinning.");
    }

    @Override
    public void playDisc() {
        System.out.println("The record is playing");
    }

    @Override
    void fastForward() {
        System.out.println("Move the needle!");
    }

    @Override
    void readData() {
        System.out.println("Liner notes make the best reading!");
    }
}
