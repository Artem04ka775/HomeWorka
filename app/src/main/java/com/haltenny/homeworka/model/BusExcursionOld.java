package com.haltenny.homeworka.model;

public class BusExcursionOld extends BusExcursion{
    private float ticketDiscount;
    public BusExcursionOld(){

    }
    public BusExcursionOld(float ticketPrice, int numberOfTickets, float ticketDiscount){
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public float TicketPriceAll(){
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100;
    }
}
