//Every payment has unique id and is related to exactly one account.

import java.util.Date;
public class Payment{
private String id;
private Date paid;
private double total;
private String details;
private Account account;
//-------------------------------------------------------------------
/*method for generating a short, readable Unique ID*/
private static long idCounter = 0;

public static synchronized String createID()
{
return String.valueOf(idCounter++);
}
//-------------------------------------------------------------------
//parameterized constructor
public Payment(double tot, String det, Account acc){
this.id = createID();
this.paid = new Date();
this.total = tot;
this.details = det;
this.account = acc;
}

public String toString() {
       return "Account: " + account.toString() + "\nPayment ID: " + id + "\nPaid: " + paid + "\nTotal: " + total + "\nDetails: " + details;
   }
}