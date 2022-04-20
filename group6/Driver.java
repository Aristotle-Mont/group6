public class Driver{

    public static void main(String[] args){
    whBoxTest();
    }
    
    public static void whBoxTest(){
    System.out.println("White Box Testing:\n");
    Account acc1 = new Account();
    //instantiate address for Account's parameterized constructor
    Address ad = new Address("1415 Washington St", "San Francisco", "CA", "94577");
    Account acc2 = new Account("webID", ad);
    System.out.println(acc1.toString());
    System.out.println(acc2.toString());
    acc1.setId("customID");
    System.out.println("acc1.getId(): " + acc1.getId());
    System.out.println("acc2.getId(): " + acc2.getId());
    acc1.setBillingAddress(ad);
    System.out.println("acc1.getBillingAddress(): " + acc1.getBillingAddress());
    System.out.println("acc2.getBillingAddress(): " + acc2.getBillingAddress());
    acc2.getCart();
    acc2.createOrder();
    acc2.getCart();
    acc2.getOrders();
    acc2.getOrdSize();
    acc1.closeAcc();
    System.out.println("\nacc1.toString() With Closed Account: " + acc1.toString());
    }
    }