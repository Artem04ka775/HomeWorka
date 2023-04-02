package com.haltenny.homeworka.model;

public class BusExcursionChild extends BusExcursion{
    private float ticketDiscount;
    public BusExcursionChild(){

    }
    public BusExcursionChild(float ticketPrice, int numberOfTickets, float ticketDiscount){
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public float TicketPriceAll(){
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100;
    }
}
