/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;

/**
 *
 * @author HP Mini
 */
public class Address {
    
    public String Number;
    public String Street;
    public String Suburb;
    public String Postcode;
    public String State;
    
    public Address(String number, String street, String suburb, String postcode, String state){
        this.Number = number;
        this.Street = street;
        this.Postcode = postcode;
        this.Suburb = suburb;
        this.State = state;        
    }
    
    public Address(){
        this("N/A", "N/A", "N/A", "N/A", "N/A");
    }
    
    @Override
    public String toString() {
        return "Address{" + "Number=" + Number + ", Street=" + Street + ", Suburb=" + Suburb + ", Postcode=" + Postcode + ", State=" + State + '}';
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getSuburb() {
        return Suburb;
    }

    public void setSuburb(String Suburb) {
        this.Suburb = Suburb;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
}
