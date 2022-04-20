/*
Webuser is inherited from Customer.
Customer is inherited from Account.
Account = Superclass
Customer = Subclass of Account
Webuser = Subclass of Customer
Customer can register to be a Webuser.
*/
public class WebUser extends Customer{
    //Fields:
    private String login_id;
    private String password;
    private UserState state;
    //-------------------------------------------------------------------
    //constructor
    public WebUser(){
    super();
    this.login_id = "";
    this.password = "";
    this.state = UserState.New;
    }
    //parameterized constructor
    public WebUser(String web_login_id, String web_password){
    super();
    this.login_id = web_login_id;
    this.password = web_password;
    this.state = UserState.New;
    }
    //-------------------------------------------------------------------
    //getters & setters
    public void setPassword(String pw){
    this.password = pw;
    }
    
    public UserState getState() {
    return this.state;
    }
      
    public void setNew(){
    this.state = UserState.New;
    }
    
       public void setActive() {
           this.state = UserState.Active;
       }
    
       public void setBlocked() {
           this.state = UserState.Blocked;
       }
    
       public void setBanned() {
           this.state = UserState.Banned;
       }
      
    public String toString(){
    return "Web User ID: " + login_id + "\nUser State: " + state;
    }
    }