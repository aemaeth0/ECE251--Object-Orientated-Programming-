/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Alberto Pizano
Assignment: 2
File Name: RealEstateAgent.java
Date: 03/04/18
*/

public class RealEstateAgent{
  
  private String employeeNumber;
  private double commissionRate;
  private double totalCommissionEarned;
  private String name;
  
  public RealEstateAgent(String name, String employeeNumber, double commissionRate){
    this.name = name;
    this.employeeNumber = employeeNumber;
    this.commissionRate = commissionRate;
    totalCommissionEarned = 150.00;
  }
  
  public String getName(){
    return name;
  }
  
  public String getEmployeeNumber(){
    return employeeNumber;
  }
  
  public double getCommissionRate(){
    return commissionRate;
  }
  
  public double getTotalCommissionEarned(){
    return totalCommissionEarned;
  }
  
  public void setName(String x){
    name = x;
  }
  
  public void setEmployeeNumber(String x){
    employeeNumber = x;
  }
  
  public void setCommissionRate(double x){
    commissionRate = x;
  }
  
  public void setTotalCommissionEarned(double x){
    totalCommissionEarned = x;
  }
  
  public String toString(){
    return (name + ", employee number: " + employeeNumber);
  }
  
  public String sellHome(Buyer b, Home h){
    if(h.getAvailability()){
      h.setAvailability(false);
      addCommission(commissionRate * h.getPrice());
      
      System.out.println(h.getLocation() + ", " + h.getModel() + ", " + h.getAddress() + "Sold to " + b.getName());
      System.out.println(b.getAddress() + " by " + name + ", employee number: " + employeeNumber);
      return "";

    }
    
    return null;
  }
  
  public double addCommission(double commissionEarned){
    totalCommissionEarned += commissionEarned;
    return totalCommissionEarned;
  }
}