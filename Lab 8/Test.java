
public class Test {

 public static void main(String args[]) {

 Person people =new Person("Al", "Pizano");
 Person people2 =new Person("Alternate Universe", "Person");
 Student[] roster = new Student[3];

 System.out.println(people);
 System.out.println(people2);

 Student p1= new Student ("Son", "Goku");
 p1.setMyGpa(3.02);
 roster[0] = p1;
 Student p2= new Student ("One Punch", "Saitama");
 p2.setMyGpa(3.45);
 roster[1] = p2;
    Student p3= new Student ("Claire", "Claymore");
    p3.setMyGpa(3.85);
    roster[2] = p3;


    p1.rank_student(roster);
 System.out.println(p1);
 System.out.println(p2);
    System.out.println(p3);
    for(int i = 0; i < roster.length; i++){

     System.out.println(roster[i].getFirstName()+ ","+ roster[i].getLastName() );
       // System.out.println(roster[i].getMyStudentId() );
     System.out.println(roster[i].getMyGpa());
    }

 }


}