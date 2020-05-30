public class House { //super class 
      
       private String type;
       private String price;
       private int squareFeet;

    //Encapsulation //get and set method 
    public void setType (String newType) {
         type = newType;
         }
       
    public String getType() {
      return type;
     }
     
    public void setPrice (String newPrice) {
      price = newPrice;
      }
      
    public String getPrice() {
      return price;
      }
     
    public void setSquareFeet (int newSquareFeet) {
      squareFeet = newSquareFeet;
      }
      
     public int getSquareFeet() {
      return squareFeet;
      } 
    
    public void bedRoom() { //method
      System.out.println("BedRoom     :Avaiable");
      }
      
   public void masterRoom() { //method
      System.out.println("Master Room :Avaiable");
      }
      
   public static void kitchen() { //method
      System.out.println("Kitchen     :Avaiable");
      }
      
    public static void storeRoom() { //method
      System.out.println("Store Room  :Avaiable");
      } 
      
    public void washRoom() { //method
      System.out.println("Wash Room   : Avaiable");
      }
      
   }//end of class House