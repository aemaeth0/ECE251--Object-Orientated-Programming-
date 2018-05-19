/*
 * Class: ECE251 Objected Orientated Programming
 * Instructor: Xiaoli Yang
 * Author: Alberto Pizano
 * Assignment: #3
 * File Name: University.java
 * Date: 03/24/18
 */

import java.util.ArrayList;
import java.util.Iterator;

public class University {

  String name;
  ArrayList<Student> students;
  ArrayList<Course> courses;
  
  public University(String name){
    this.name = name;
    students = new ArrayList<Student>();
    courses = new ArrayList<Course>();
  }
  
  public String getName() 
  { 
    return name; 
  }
  public ArrayList<Student> getStudents() 
  { 
    return students; 
  }
  public ArrayList<Course> getCourses() 
  { 
    return courses; 
  }
 
  public void offerCourse(Course c)
  {
    courses.add(c);
  }
  
  public void cancelCourse(Course c){
    
    boolean deleteCourse = false; 
    Iterator courseIterator = courses.iterator();

    if(c.getStudents().size() == 0){
      deleteCourse = true;
    }
    
    if(deleteCourse){
      while(courseIterator.hasNext()){
        if(courseIterator.next() == c)
          courseIterator.remove();
      }
    }
  }
  
  public void enrollStudentInCourse(Student s, Course c){
    
    Iterator courseIterator = courses.iterator();
    boolean isRegistered = false;
    boolean isStudent = false;
    
    Iterator checkIterator = s.getCourses().iterator();
    
    //Checks if student is enrolled in the University
    for(Student stdnt: students){
      if(stdnt == s)
        isStudent = true;
    }
    
    //Enrolls in the university
    if(isStudent == false)
      students.add(s);
    
    
    //Checks if student is already registered in course
    while(checkIterator.hasNext()){
      if(checkIterator.next() == c)
        isRegistered = true;
    }
    
    
    //Checks to see if student is already registered in course
    /*
    for(Course crse: s.getCourses()){
      if(crse == c)
        isRegistered = true;
    }
    */
    
    if(isRegistered == true){
      while(courseIterator.hasNext()){
        if(courseIterator.next() == c)
          c.addStudent(s);
      }
    }
  }
  
  public void withdrawStudentFromCourse(Student s, Course c){
    
    //Retrieves students registered in the course and creates an iterator 
    ArrayList<Student> studentsRegistered = c.getStudents();
    Iterator studentIterator = studentsRegistered.iterator();
    
    //Retrieves the student's courses and creates an iterator
    ArrayList<Course> coursesTaken = s.getCourses(); 
    Iterator takenIterator = coursesTaken.iterator();
    
    boolean isRegistered = false;
   
    //Checks if student is registered in the course
    while(takenIterator.hasNext()){
      if(takenIterator.next() == c)
        isRegistered = true;
    }
    
    //Removes the student 
    if(isRegistered){
      while(studentIterator.hasNext()){
        if(studentIterator.next() == s)
          c.removeStudent(s);
      }
    }
  }
  
  public String toString(){
    return name + ": " + courses.size() + " Courses, " + students.size() + " Students";
  }
  
  public ArrayList<Course> lowRegistrationCourses(int min){
    
    Iterator courseIterator = courses.iterator();
    ArrayList<Course> ans = new ArrayList<Course>();
    
    while(courseIterator.hasNext()){
      Course c = (Course)courseIterator.next();
      if(c.getStudents().size() <= min)
        //System.out.println(c);
        ans.add(c);
    }
  
    return ans;
  }
  
  public Course highestEnrollment(){
    
    Iterator courseIterator = courses.iterator();
    Course ans = new Course();
  
    if(courseIterator.hasNext())
      ans = (Course)courseIterator.next();
    else 
      return ans;
    
    while(courseIterator.hasNext()){
      Course c = (Course)courseIterator.next();
      if(c.getStudents().size() >= ans.getStudents().size())
        ans = c;
    }
    
    return ans;
  }
  
  public Student busiestStudent(){
    
    Iterator studentIterator = students.iterator();
    Student ans = new Student();
  
    if(studentIterator.hasNext())
      ans = (Student)studentIterator.next();
    else 
      return ans;
    
    while(studentIterator.hasNext()){
      Student s = (Student)studentIterator.next();
      if(s.getCourses().size() >= ans.getCourses().size())
        ans = s;
    }
    
    return ans;
  }
  
  
  
}