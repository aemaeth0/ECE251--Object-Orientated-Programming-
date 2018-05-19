/*
 * Class: ECE251 Objected Orientated Programming
 * Instructor: Xiaoli Yang
 * Author: Alberto Pizano
 * Assignment: #3
 * File Name: Student.java
 * Date: 03/24/18
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
  
  String name;
  int year;
  int studentNumber;
  ArrayList<Course> courses;
  
  public String getName(){ return name; }
  public int getYear(){ return year; }
  public int getStudentNumber() { return studentNumber; }
  public ArrayList<Course> getCourses(){ return courses; }
  
    public Student(){
    name = "Ralph Smith";
    year = 2018;
    studentNumber = 100654321;
    courses = new ArrayList<Course>();
  }
  
  public Student(String studentName, int ID, int studentYear){
    name = studentName;
    studentNumber = ID;
    year = studentYear;
    courses = new ArrayList<Course>();
  }
  
  public String toString(){
    return (name + " #" + studentNumber + " (" + year +  ")");
  }
  
  public void addCourse(Course c){
    courses.add(c);
  }
  
  public void removeCourse(Course c){
    Iterator courseIterator = courses.iterator();
    
    while(courseIterator.hasNext()){
      if(courseIterator.next() == c)
        courseIterator.remove();
    }
  }
  
  public ArrayList<Student> classmatesAt(University u){
    ArrayList<Student> ans = new ArrayList<Student>();
    
    return ans;
  }
}
