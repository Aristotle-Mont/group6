/*
Each line item is related to exactly one product.
*/

public class LineItem{
    private int quantity;
    private double price;
    private Product product;
    
    //-------------------------------------------------------------------
    //parameterized constructor
    public LineItem(int q, double pr, Product prod){
    this.quantity = q;
    this.price = pr;
    this.product = prod;
    }
    //-------------------------------------------------------------------
    //getters & setters
    public double getPrice(){
    return this.price;
    }
    
    public int getQuantity(){
    return this.quantity;
    }
    
    public double getTotalPrice(){
    return this.price * this.quantity;
    }
    
    public String toString() {
    return "Product: " + product.toString() + "\nQuantity: " + quantity + "\nPrice: " + price
    + "\nTotal: " + getTotalPrice();
       }
    }