package com.connectsystem.organized;

public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;

    // Initialization block
    // before every constructor is run
    {
        isSeatAvailable = new boolean[seats]; // set the capacity of the array
        for(int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }

    public Flight() {}

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }
}
