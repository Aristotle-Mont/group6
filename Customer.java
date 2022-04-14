import java.util.Scanner;
/*
Customer is inherited from Account.
Account = Superclass
Customer = Subclass
Customer has one instance of ShoppingCart
can have many Orders from Account
Customer could register as a web user to be able to buy items online.
*/

public class Customer extends Account{
//Fields:
private Address address;
private Phone phone;
private String email;
//-------------------------------------------------------------------
//constructor
public Customer(){
super();
this.address = new Address();
this.phone = new Phone();
this.email = "";
}
//parameterized constructor
public Customer(Address acc_ad, Phone ph, String em){
super();
this.address = acc_ad;
this.phone = ph;
this.email = em;
}
//if customer is a WebUser; use web id for cust id
public Customer(String webID, Phone ph, String em, Address acc_ad){
super(webID, acc_ad);
this.phone = ph;
this.email = em;
}
//-------------------------------------------------------------------
//getters & setters

public String getEmail(){
return this.email;
}

public void setEmail(String em){
this.email = em;
}

public Phone getPhone(){
return this.phone;
}

public void setPhone(Phone ph){
this.phone = ph;
}
//-------------------------------------------------------------------
//Methods
//Customer could register as a web user to be able to buy items online.
public WebUser regWebUser(){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a username: ");
String user = scan.nextLine();
System.out.println("Enter a password: ");
String pw = scan.nextLine();
scan.close();
this.setId(user);
return new WebUser(user, pw);
}
public String toString() {
return "Customer " + getId() + "\nAddress: " + address + "\nPhone #: " + phone + "\nEmail: " + email + ")";
}
}