package org.launchcode.studio7;

public class CD extends BaseDisc implements Disc {


    public CD(String discName, int yearReleased, String contents, String discType, int storageCapacity, int totalDiscData) {
        super(discName, yearReleased, contents, discType, storageCapacity, totalDiscData);
    }

    @Override
    void fastForward() {
        System.out.println("The cd has skipped to the next track.");
    }



    @Override
    public void spinDisc() {
        System.out.println("The cd is spinning.");
    }

    @Override
    public void playDisc() {
        System.out.println("The cd is playing.");
    }

    @Override
    public void readData() {
        System.out.println("Reading cd.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


}
