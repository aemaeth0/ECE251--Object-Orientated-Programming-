import java.lang.*;
public class Person {

 private String firstName;
 private String lastName;
 private String email;

 public String getFirstName(){
  return firstName;
 }

 public String getLastName(){
  return lastName;
 }

 public void setFirstName(String aFirst){
  firstName=aFirst;
 }

 public void setLastName(String aLast){
  lastName=aLast;
 }

 public String getEmail(){
  return email;
 }

 public void setEmail(String aEmail){
  email=aEmail;
 }

 public String toString(){
  return (email+ "@gmail.com");
 }

    public Person(String aFirst, String aLast) {
     firstName=aFirst;
     lastName=aLast;
     email = aFirst.charAt(0)+aLast.substring(0,4);
    }


}