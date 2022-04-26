package org.launchcode.studio7;

public interface Disc {

    int CD_SPIN_MAX_SPEED = 500;
    int CD_SPIN_MIN_SPEED = 200;
    int DVD_SPIN_MAX_SPEED = 1600;
    int DVD_SPIN_MIN_SPEED = 570;
    int FLOPPY_SPIN_MIN_SPEED = 300;
    int FLOPPY_SPIN_MAX_SPEED = 360;
    int VINYL_SPIN_MIN_SPEED = 33;
    int VINYL_SPIN_MAX_SPEED = 78;

    void spinDisc();

    void playDisc();



    default int returnCdMaxSpeed(){
        return CD_SPIN_MAX_SPEED;
    }
    default int returnDvdMaxSpeed(){
        return DVD_SPIN_MAX_SPEED;
    }
    default int returnCdMinSpeed(){
        return CD_SPIN_MIN_SPEED;
    }
    default int returnDvdMinSpeed(){
        return DVD_SPIN_MIN_SPEED;
    }
    default int returnFloppyMinSpeed() {return FLOPPY_SPIN_MIN_SPEED;}
    default int returnFloppyMaxSpeed() {return FLOPPY_SPIN_MAX_SPEED;}
    default int returnVinylMinSpeed() {return VINYL_SPIN_MIN_SPEED;}
    default int returnVinylMaxSpeed() {return VINYL_SPIN_MAX_SPEED;}

}
