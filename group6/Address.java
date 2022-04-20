public class Address{
    private String street;
    private String city;
    private String state;
    private String zip;
    
    //Constructor
    public Address(){
    street = "";
    city = "";
    state = "";
    zip = "";
    }
    
    //Parameterized Constructor
    public Address(String ad_street, String ad_city, String ad_state, String ad_zip){
    this.street = ad_street;
    this.city = ad_city;
    this.state = ad_state;
    this.zip = ad_zip;
    }
    
    public String toString(){
    if(street == "")
    return "*No Address Found*";
    return street + ", " + city + ", " + state + ", " + zip;
    }
    }