public class Product{
    private String id;
    private String name;
    private String supplier;
    //-------------------------------------------------------------------
    /*method for generating a short, readable Unique ID*/
    private static long idCounter = 0;
    
    public static synchronized String createID(){
    return String.valueOf(idCounter++);
    }
    //-------------------------------------------------------------------
    //parameterized constructor
    public Product(String n, String supp){
    this.id = createID();
    this.name = n;
    this.supplier = supp;
    }
    
    public String toString() {
           return "Product ID: " + id + "\nName: " + name + "\nSupplier: " + supplier;
       }
    }