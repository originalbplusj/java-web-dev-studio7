package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD myCd = new CD("Mix Tape", 2022, "Random music", "cd", 680, 500);

        DVD myDvd = new DVD("Home Movies", 2022, "Holiday memories", "dvd", 4700, 2000);

        VinylLP myVinyl = new VinylLP("Classic Mix", 2022, "Favorite songs", "vinyl", 400, 400);

        Floppy myFloppy = new Floppy("Term Paper", 1992, "Art History", "floppy", 300, 200);

        myCd.fastForward();
        myCd.playDisc();
        myCd.readData();
        myCd.spinDisc();
        myCd.eraseData(40);
        myCd.writeData(80);
        myCd.reportDiscInformation();

        myDvd.fastForward();
        myDvd.playDisc();
        myDvd.readData();
        myDvd.spinDisc();
        myDvd.eraseData(1200);
        myDvd.writeData(2300);
        myDvd.reportDiscInformation();

        myVinyl.fastForward();
        myVinyl.playDisc();
        myVinyl.readData();
        myVinyl.spinDisc();
        myVinyl.eraseData(20);
        myVinyl.writeData(30);
        myVinyl.reportDiscInformation();

        myFloppy.fastForward();
        myFloppy.playDisc();
        myFloppy.readData();
        myFloppy.spinDisc();
        myFloppy.eraseData(50);
        myFloppy.writeData(40);
        myFloppy.reportDiscInformation();



        System.out.println(myCd.returnCdMaxSpeed());
        System.out.println(myCd.returnCdMinSpeed());
        System.out.println(myDvd.returnDvdMaxSpeed());
        System.out.println(myDvd.returnDvdMinSpeed());
        System.out.println(myVinyl.returnVinylMaxSpeed());
        System.out.println(myVinyl.returnVinylMinSpeed());
        System.out.println(myFloppy.returnFloppyMaxSpeed());
        System.out.println(myFloppy.returnFloppyMinSpeed());

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
