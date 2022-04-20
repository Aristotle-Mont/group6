/*
   Phone class separates a string into the format:
   ### ### ###
*/
public class Phone {
   private String areaCode;
   private String numb1;
   private String numb2;
  
public Phone(){
this.areaCode = "";
this.numb1 = "";
this.numb2 = "";
}

   public Phone(String area, String n1, String n2) {
       this.areaCode = area;
       this.numb1 = n1;
       this.numb2 = n2;
}

public String toString() {
       return "Phone #: " + areaCode + "-" + numb1 + "-" + numb2;
   }
}