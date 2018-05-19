/*
 * Class: ECE251 Objected Orientated Programming
 * Instructor: Xiaoli Yang
 * Author: Alberto Pizano
 * Assignment: #3
 * File Name: Course.java
 * Date: 03/24/18
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Course {
  
  String title;
  String code;
  int number;
  ArrayList<Student> students;
  
  public String getTitle(){ return title; }
  public String getCode(){ return code; }
  public int getNumber(){ return number; }
  public ArrayList<Student> getStudents() { return students; }
  
  public Course(){
    title = "Oject Orientated Programming";
    code = "ECE";
    number = 251;
    students = new ArrayList<Student>();
  }
  
  public Course(String code, int number, String title){
    this.title = title;
    this.code = code;
    this.number = number;   
    students = new ArrayList<Student>();
  }
  
  public String toString(){
    return (code + " " + number + "-" + title);
  }
  
  public void addStudent(Student s){
    students.add(s);
  }
  
  public void removeStudent(Student s){
    Iterator studentIterator = students.iterator();
    
    while(studentIterator.hasNext()){
      if(studentIterator == s)
        studentIterator.remove();
    }
  }
    
  
}