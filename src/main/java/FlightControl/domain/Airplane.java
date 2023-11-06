/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author J
 */
public class Airplane {
    
    private String identifier;
    private int capacity;
    
    public Airplane(String identifier, int capacity){
        this.identifier=identifier;
        this.capacity=capacity;
    }
    
    public String getIdentifier(){
        return identifier;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public void setIdentifier(String newIdetifier){
        this.identifier=newIdetifier;
    }
    
    public void setCapacity(int newCapacity){
        this.capacity=newCapacity;
    }
    
    @Override
    public String toString(){
        return this.identifier+" ("+this.capacity+" capacity)";
    }
    
}
