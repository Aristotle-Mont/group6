import java.util.Date;

/*
Account represents the whole or composite class of
Customer, Shopping Cart, and Order.
- Account owns shopping cart and orders.
- Account owns customer orders.
*/

public class Account{
//Fields:
private String id;
private Address billing_address;
private boolean is_closed;
private Date open;
private Date closed;
  
private ShoppingCart cart;
private Order[] orders;
private int oSize = 0;
//-------------------------------------------------------------------
/*method for generating a short, readable Unique ID*/
private static long idCounter = 0;

public static synchronized String createID()
{
return String.valueOf(idCounter++);
}
//-------------------------------------------------------------------
//constructor
public Account(){
this.id = createID();
this.billing_address = new Address();
this.is_closed = false;
this.open = new Date();
this.cart = new ShoppingCart();
this.orders = new Order[10];
}

//parameterized constructor
public Account(String web_login_id, Address acc_ad){
this.id = web_login_id;
this.billing_address = acc_ad;
this.is_closed = false;
this.open = new Date();
this.cart = new ShoppingCart();
this.orders = new Order[10];
}
//-------------------------------------------------------------------
//getters & setters
public String getId(){
return this.id;
}

public void setId(String i){
this.id = i;
}

public Address getBillingAddress(){
return this.billing_address;
}

public void setBillingAddress(Address ad){
this.billing_address = ad;
}

public ShoppingCart getCart(){
return this.cart;
}

public Order[] getOrders(){
return this.orders;
}

public int getOrdSize(){
return this.oSize;
}
//-------------------------------------------------------------------
//methods
//instantiate Order instance; pull in lineItems from shopping car
public Order createOrder(){
Order ord = new Order();
ord.cartToOrder(this);
orders[oSize] = ord;
oSize++;
return ord;
}
//close the account
public void closeAcc(){
closed = new Date();
is_closed = true;
}

public String toString() {
return "\nAccount ID: " + id + "\nAddress: " + billing_address + "\nOrder Size: " + oSize
+ "\nAccount Open Date: " + open + "\nAccount Close Date: " + closed + "\n---------";
   }
}
