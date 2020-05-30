public class MainHouse {//main 

   public static void main (String [] args) {
   
     Mansion m = new Mansion();//constructor of mansion 
      
     m.setType("Mansion");
     m.setPrice("18 million");
     m.setSquareFeet(10000);
      
     System.out.println();
     System.out.println("Type of House     :" + m.getType());
     System.out.println("Price of the House:RM" + m.getPrice());
     System.out.println("Square Feet (SQ.FT)      :" + m.getSquareFeet());
     System.out.println();
     m.bedRoom(); 
     m.masterRoom(); 
     m.kitchen();  
     m.storeRoom();  
     m.washRoom();
     m.swimmingPool();
     m.gymRoom();
     m.cinema(); 
     System.out.println("---------------------------------------------------------------------------------------------------------------------------");
     
     SemiD s = new SemiD(); //constructor of semi d
    
     s.setType("Semi D");
     s.setPrice("800,000");
     s.setSquareFeet(3000);

    
     System.out.println();
     System.out.println("Type of House:" + s.getType());
     System.out.println("Price of the House:RM" + s.getPrice());
     System.out.println("Square Feet (SQ.FT)      :" + s.getSquareFeet());
     System.out.println();
     s.bedRoom(); 
     s.bedRoom("2 Bedroom on ground floor and 1 Bedroom on first floor.");
     s.masterRoom();  
     s.kitchen();  
     s.storeRoom();  
     s.washRoom();
     s.publicGarden();
     s.playGround();
     s.security();
     System.out.println("---------------------------------------------------------------------------------------------------------------------------");

     Flat f = new Flat();//constructor of flat 
     
     f.setType("Flat");
     f.setPrice("200,000");
     f.setSquareFeet(800);

     
     System.out.println();
     System.out.println("Type of House:" + f.getType());
     System.out.println("Price of the House:RM" + f.getPrice());
     System.out.println("Square Feet (SQ.FT)      :" + f.getSquareFeet());
     System.out.println();
     f.bedRoom(); 
     f.masterRoom();  
     f.kitchen();  
     f.storeRoom();  
     f.washRoom();
     f.lift();
     f.manyFloor();

     
     

           
   }//end of main
      
 }//end of class MainHouse