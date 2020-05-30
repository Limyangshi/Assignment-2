public class Mansion extends House{//Inheritance //subclass


    public static void swimmingPool() { //method
      System.out.println("Swimming Pool :Avaible");
     }
     
    public static void gymRoom() { //method
      System.out.println("Gym Room      :Avaiable");
      }
      
    public static void cinema() { //method
      System.out.println("Cinema         :Avaiable");
      }
     
    //@Overriding 
    public void masterRoom() {
      super.masterRoom();
      System.out.println("Master Room Including one balcony"); 
      }
    
    
     
  }//end of class House1
     
   