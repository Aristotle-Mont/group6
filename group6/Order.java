/*
Each order could refer to several payments, possibly none.
Each order has current order status.
*/
import java.util.Date;

public class Order{
private String number;
private Date ordered;
private Date shipped;
private Address ship_to;
private OrderStatus status;
private double total;

private LineItem[] lineItems;
private int orderSize;
private Payment[] payment;
private int paymentSize;
//-------------------------------------------------------------------
/*method for generating a short, readable Unique ID*/
private static long idCounter = 0;

public static synchronized String createID()
{
return String.valueOf(idCounter++);
}
//-------------------------------------------------------------------
//constructor
public Order(){
this.number = createID();
this.ordered = new Date();
this.status = OrderStatus.New;
this.orderSize = 0;
this.lineItems = new LineItem[100];
this.payment = new Payment[100];
}

//-------------------------------------------------------------------
//getters & setters

   public String getNumber() {
       return this.number;
   }
  
   public OrderStatus getStatus() {
       return this.status;
   }
  
   public void setClosed() {
       this.status = OrderStatus.Closed;
   }
  
   public void setDelivered() {
       this.status = OrderStatus.Delivered;
   }
  
   public void setHold() {
       this.status = OrderStatus.Hold;
   }
  
   public void setShipped() {
       this.status = OrderStatus.Shipped;
}
//-------------------------------------------------------------------
//methods
public void addLineItem(LineItem item){
lineItems[orderSize] = item;
orderSize++;
total += item.getTotalPrice();
}

public void addPayment(Payment pay){
payment[paymentSize] = pay;
paymentSize++;
}
/*
Method for converting the current Account's shopping cart into an order.
for every item in cart, add the lineItem to our order
set cart to empty after converting to order
*/
public void cartToOrder(Account acc){
ShoppingCart cart = acc.getCart();
ship_to = acc.getBillingAddress();
for (int i = 0; i < cart.getSize(); i++){
addLineItem(cart.getLineItems()[i]);
}
cart.emptyCart();
}
}