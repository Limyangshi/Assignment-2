public class Flat extends House { //Inheritance //subclass 
         
    public static void lift() { //method
      System.out.println("Lift      : Avaible");
      }
     
    public static void manyFloor() { //method
      System.out.println("Floor     : More than 2 floors");
      }

      //@Overriding
      public void washRoom() {
         super.washRoom(); 
         System.out.println("Wash Room NOT Avaible on Master Room");
         }
     
  }//end of class House1
     
   