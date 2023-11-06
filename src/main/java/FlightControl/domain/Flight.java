/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

import java.util.HashMap;

/**
 *
 * @author J
 */
public class Flight {
    
    private Airplane airplane;
    private Place departure;
    private Place arrival;

    
    public Flight(Airplane airplane, Place departure, Place arrival){
        this.airplane=airplane;
        this.departure=departure;
        this.arrival=arrival;
    }
    
    public Airplane getAirplane(){
        return airplane;
    }
    
    public Place getDeparture(){
        return departure;
    }
    
    public Place getArrival(){
        return arrival;
    }
    
    public void setDeparture(Place newDeparture){
        this.departure=newDeparture;
    }
    
    public void setArrival(Place newArrival){
        this.arrival=newArrival;
    }
    
    @Override
    public String toString() {
        return this.airplane + " (" + this.departure + "-" + this.arrival + ")";
    }
}
