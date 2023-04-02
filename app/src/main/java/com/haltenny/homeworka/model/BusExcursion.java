package com.haltenny.homeworka.model;

public class BusExcursion {
    private String departurePoint;
    private String arrivalPoint;
    private String departureDate;
    private String arrivalDate;
    private String travelTime;
    private int distance;
    private float ticketPrice;
    private int numberOfTickets;

    public BusExcursion(){

    }
    public BusExcursion(float ticketPrice, int numberOfTickets){
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public float ticketPriceAll(){
        return ticketPrice* numberOfTickets;
    }

    public float getTicketPrice(){
        return ticketPrice;
    }

    public void setTicketPrice(){
        this.ticketPrice = ticketPrice;
    }

    public float getNumberOfTickets(){
        return numberOfTickets;
    }

    public void setNumberOfTickets(){
        this.numberOfTickets = numberOfTickets;
    }

}


