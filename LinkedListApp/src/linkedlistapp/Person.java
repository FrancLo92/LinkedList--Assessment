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
public class Person {
    
    private String Name;
    private String Email;
    private String TelNum;
    private Address Address;
    
       
    public Person(String name, String email, String telNum){
        this.Name = name;
        this.Email = email;
        this.TelNum = telNum;
        this.Address = new Address();    
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelNum() {
        return TelNum;
    }

    public void setTelNum(String TelNum) {
        this.TelNum = TelNum;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", Email=" + Email + ", TelNum=" + TelNum + ", Address=" + Address.toString() + '}';
    }
    
    
    
    
}
