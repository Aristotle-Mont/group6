import java.util.Date;

/*
Account owns shopping cart
Shopping cart belongs to account.
*/

public class ShoppingCart{
private Date created;
private int cSize;
private LineItem[] lineItems;
//-------------------------------------------------------------------
//constructor
public ShoppingCart(){
this.created = new Date();
this.lineItems = new LineItem[100];
this.cSize = 0;
}
//-------------------------------------------------------------------
//getters & setters
   public LineItem[] getLineItems() {
       return this.lineItems;
   }

   public int getSize() {
       return this.cSize;
}
//-------------------------------------------------------------------
//methods
public void addLineItem(LineItem i){
this.lineItems[cSize] = i;
this.cSize++;
}

public void emptyCart(){
this.cSize = 0;
this.lineItems = new LineItem[100];
}
}

