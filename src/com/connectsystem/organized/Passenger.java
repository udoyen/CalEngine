package com.connectsystem.organized;

public class Passenger {

    int freeBags;
    int checkBags;
    double perBagFee;

    public Passenger() {

    }

    public Passenger(int freeBags) {
        // calls the constructor with a double parameter
        // as this call takes in a parameter of type double
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }

//    public com.connectsystem.organized.Passenger(int freeBags, int checkBags) {
//        this.freeBags = freeBags;
//        this.checkBags = checkBags;
//    }

    public Passenger(int freeBags, int checkBags) {
        this(freeBags); // calls the constructor with one parameter
        this.checkBags = checkBags;
    }

    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
