package org.launchcode.studio7;

public class DVD extends BaseDisc implements Disc {


    public DVD(String discName, int yearReleased, String contents, String discType, int storageCapacity, int totalDiscData) {
        super(discName, yearReleased, contents, discType, storageCapacity, totalDiscData);
    }

    @Override
    void fastForward() {
        System.out.println("The dvd has skipped to the next chapter.");
    }


    @Override
    public void spinDisc() {
        System.out.println("The dvd is spinning.");
    }

    @Override
    public void playDisc() {
        System.out.println("The dvd is playing.");
    }

    @Override
    public void readData() {
        System.out.println("Reading dvd.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
