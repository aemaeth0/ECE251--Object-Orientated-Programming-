/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Alberto Pizano
Assignment: 2
File Name: Buyer.java
Date: 03/04/18
*/

public class Buyer{

  private String name;
  private String address;
  private String phoneNumber;
  private int mlsNumber;
  
  public Buyer(String name, String address, String phoneNumber){
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }
  
  public Buyer(){
    name = "name unknown";
    address = "address unknown";
    phoneNumber = "phone number unknown";
  }
  
  public String getName(){
    return name;
  }
  
  public String getAddress(){
    return address;
  }
  
  public String getPhoneNumber(){
    return phoneNumber;
  }
  
  public int getMLS(){
    return mlsNumber;
  }
  
  public void setName(String x){
    name = x;
  }
  
  public void setAddress(String x){
    address = x;
  }
  
  public void setPhoneNumber(String x){
    phoneNumber = x;
  }
  
  public void setMLS(int x){
    mlsNumber = x;
  }
  
  public String toString(){
    
    return (name + ", " + address);
  }
  
  public void viewHome(Home aHome){
    aHome.setNoOfPotentialBuyers(aHome.getNoOfPotentialBuyers() + 1);
  }
}