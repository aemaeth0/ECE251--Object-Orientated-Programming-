/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Alberto Pizano
Assignment: 2
File Name: Home.java
Date: 03/04/18
*/

public class Home{
  
  private String location;
  private String model;
  private String address;
  private boolean availability;
  private int year;
  private int mlsNumber;
  private int noOfPotentialBuyers;
  private double price;
  
  public Home(String location, String model, String adddress, int year, int noOfPotentialBuyers,  int mlsNumber){
    this.location = location;
    this.model = model;
    this.address = address;
    availability = true;
    this.year = year;
    this.noOfPotentialBuyers = noOfPotentialBuyers;
    this.mlsNumber = mlsNumber;
  }
  
  public String getLocation(){
    return location;
  }
  
  public String getModel(){
    return model;
  }
  
  public String getAddress(){
    return address;
  }
  
  public boolean getAvailability(){
    return availability;
  }
  
  public int getYear(){
    return year;
  }
  
  public int getMLS(){
    return mlsNumber;
  }
  
  public int getNoOfPotentialBuyers(){
    return noOfPotentialBuyers;
  }
  
  public double getPrice(){
    return price;
  }
  
  public void setLocation(String x){
    location = x;
  }
  
  public void setModel(String x){
    model = x;
  }
  
  public void setAddress(String x){
    address = x;
  }
  
  public void setAvailability(boolean x){
    availability = x;
  }
  
  public void setYear(int x){
    year = x;
  }
  
  public void setMLSnumber(int x){
    mlsNumber = x;
  } 
  
  public void setNoOfPotentialBuyers(int x){
    noOfPotentialBuyers = x;
  } 
  
  public void setPrice(double x){
    price = x;
  }
  
  public String toString(){
    return (location + ", " + model + ",  " + address);
  } 
}