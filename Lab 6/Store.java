import java.util.ArrayList;
import java.util.Iterator;

public class Store {
 private String  name;
    private ArrayList<Customer>  customers;

    public Store(String n) {
       name = n;
       customers = new ArrayList<Customer>();
    }

    public String getName() { return name; }
    public ArrayList<Customer> getCustomers() { return customers; }

    public void addCustomer(Customer c) {
  customers.add(c);
    }

 public void recordPurchase(Customer c, float price) {

  if (c.spend(price))
   customers.add(c);

    }

    public void listCustomers() {
     for (Customer c: customers)
      System.out.println(c);
    }

 public ArrayList<Customer> getCustomersOfSex(char sex) {

 ArrayList<Customer> sexArrayList = new ArrayList<Customer>();
  for (Customer c:customers)
   {
    if (sex ==c.getSex())
    sexArrayList.add(c);
   }
   return sexArrayList;
  }

 public void removeBrokeCustomers() {

  Iterator cIterator = customers.iterator();

  while(cIterator.hasNext())
   {

    Customer c= (Customer)cIterator.next();
    if(c.getMoney()<10)

    
     cIterator.remove();
   }

 }

 public ArrayList<Customer> friendsFor(Customer match) {

  int older = match.getAge()+3;
  int younger = match.getAge()-3;

  ArrayList<Customer> friendsArrayList = new ArrayList<Customer>();
  Iterator cIterator = customers.iterator();



   for(Customer c: customers){
    if((match.getSex()== (c.getSex())) && (( (c.getAge()>=younger)&&((c.getAge()<=older)) ) ))
      friendsArrayList.add(c);
   }


  return friendsArrayList;
}
}