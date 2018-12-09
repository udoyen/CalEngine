package com.connectsystem.organized;

public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    int totalCheckedBags;
    int maxCarryOns = seats * 2, totalCarryOns;

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


    public void add1Passenger() {
        if(hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }

    public void add1Passenger(Passenger p) {
        add1Passenger();
    }

    public void add1Passenger(int bags, int carryOns) {
        if(hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags());
            totalCarryOns += carryOns;
        }
    }

    private Passenger bags() {
        return null;
    }

    public void setPassengers(int bags) {
        if(hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }

    }


    private boolean hasSeating() {
        return passengers < seats;
    }

    private void handleTooMany() {

    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns <= maxCarryOns;
    }
}
