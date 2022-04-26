package org.launchcode.studio7;

public abstract class BaseDisc {
    private String discName;
    private int yearReleased;
    private String contents;
    private String discType;
    private int storageCapacity;
    private int totalDiscData;

    public BaseDisc(String discName, int yearReleased, String contents, String discType, int storageCapacity, int totalDiscData) {
        this.discName = discName;
        this.yearReleased = yearReleased;
        this.contents = contents;
        this.discType = discType;
        this.storageCapacity = storageCapacity;
        this.totalDiscData = totalDiscData;
    }


// getters


    public String getDiscName() {
        return discName;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getTotalDiscData() {
        return totalDiscData;
    }

    //setters

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setTotalDiscData(int totalDiscData) {
        this.totalDiscData = totalDiscData;
    }

    // methods

    public void reportDiscInformation() {
        System.out.println("Disc Name: "+ discName);
        System.out.println("Release year: " + yearReleased);
        System.out.println("Contents: " + contents);
        System.out.println("Disc Capacity: " + storageCapacity);
        System.out.println("Type: " + discType);
    }

    abstract void fastForward();

    abstract void readData();

    public int eraseData(int dataToErase) {
        totalDiscData = totalDiscData - dataToErase;
        return totalDiscData;
    }

    public int writeData(int dataToAdd) {
        totalDiscData = totalDiscData + dataToAdd;
        return totalDiscData;
    }
}
