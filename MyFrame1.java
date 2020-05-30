import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener {

   private Container c;
   private JFrame frame;
   private JMenuBar menubar;
   private JMenu file;
   private JMenu help;
   private JMenuItem exit;
   private JMenuItem about;
   private JLabel nameLabel;
   private JTextField nameText;
   private JLabel icLabel;
   private JTextField icText;
   private JLabel phoneLabel;
   private JTextField phoneText;
   private JLabel emailLabel;
   private JTextField emailText;
   private JLabel addressLabel;
   private JTextField addressText;
   private JButton subButton;
   private JButton resButton;
   private JLabel success;
   private JLabel welcomeLabel;
   private JLabel selectLabel;
   private JRadioButton mansionButton; 
   private JRadioButton semidButton;
   private JRadioButton flatButton;
   private ButtonGroup group;
   private JTextArea output; 
   private JLabel res;  
   private JCheckBox term;
   private JTextArea resadd; 

   
 public Frame(){
 
      //Frame
      setTitle("House-Main Menu");
      setBounds(300, 90, 900, 600); 
      setDefaultCloseOperation(EXIT_ON_CLOSE); 
      setResizable(false); 
      
      c = getContentPane(); 
      c.setLayout(null);
           
      //welcome label 
      welcomeLabel = new JLabel("Registration Form");
      welcomeLabel.setFont(new Font("Times New Roman",Font.PLAIN, 35));
      welcomeLabel.setBounds(300,2,300,100);
      c.add(welcomeLabel);
      
      //User Lable
      nameLabel = new JLabel("Name");
      nameLabel.setBounds(10,80,80,25);//x,y,weight,heigh
      c.add(nameLabel);
      
      //user Text field
      //this is the box for input word
      nameText = new JTextField(20);
      nameText.setBounds(100,80,200,25);
      c.add(nameText);
      
      //ic Lable
      icLabel = new JLabel("IC No");
      icLabel.setBounds(10,120,80,25);//x,y,weight,heigh
      c.add(icLabel);
      
      //ic Text field
      //this is the box for input word
      icText = new JTextField(20);
      icText.setBounds(100,120,200,25);
      c.add(icText);

      
      //Phone Lable
      phoneLabel = new JLabel("Phone No");
      phoneLabel.setBounds(10,160,80,25);
      c.add(phoneLabel);
      
      //Phone text field
      phoneText = new JTextField(20);
      phoneText.setBounds(100,160,200,25);
      c.add(phoneText);
      
       //email Lable
      emailLabel = new JLabel("E-mail");
      emailLabel.setBounds(10,200,80,25);
      c.add(emailLabel);
      
      //email text field
      emailText = new JTextField(20);
      emailText.setBounds(100,200,200,25);
      c.add(emailText);

      
      //address Lable
      addressLabel = new JLabel("Address");
      addressLabel.setBounds(10,240,80,25);
      c.add(addressLabel);
      
      //Phone text field
      addressText = new JTextField(20);
      addressText.setBounds(100,240,200,100);
      c.add(addressText);
      
      //submit Button
      subButton = new JButton("Submit");
      subButton.setBounds(40,470,80,30);
      subButton.addActionListener(this);//give an action after click the button 
      c.add(subButton);
      
      //reset button
      resButton = new JButton("Reset");
      resButton.setBounds(200,470,80,30);
      resButton.addActionListener(this);
      c.add(resButton);
      
            
      //select label 
      selectLabel = new JLabel("Please select category you want:");
      selectLabel.setBounds(10,340,300,25);
      c.add(selectLabel);
      
      //mansion button 
      mansionButton = new JRadioButton("Mansion");
      mansionButton.setBounds(10,380,90,25);
      mansionButton.setSelected(true); 
      c.add(mansionButton);
      
      //semid button 
      semidButton = new JRadioButton("Semi D");
      semidButton.setBounds(140,380,90,25);
      semidButton.setSelected(false);
      c.add(semidButton);

      //flat button 
      flatButton = new JRadioButton("Flat");
      flatButton.setBounds(270,380,90,25);
      flatButton.setSelected(false);
      c.add(flatButton);
      
      //button group of three category of house 
      group = new ButtonGroup(); 
      group.add(mansionButton); 
      group.add(semidButton); 
      group.add(flatButton);

      //text area
      output = new JTextArea(); 
      output.setFont(new Font("Arial", Font.PLAIN, 14)); 
      output.setBounds(450,90,390,440); 
      output.setLineWrap(true); 
      output.setEditable(false); 
      c.add(output); 
      
      //term and condition check box
      term = new JCheckBox("I Have Read And Accept All Terms And Conditions."); 
      term.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
      term.setBounds(40,430,400,25);
      c.add(term); 


      //register successful label
      res = new JLabel(""); 
      res.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
      res.setBounds(80,510,500,25); 
      c.add(res); 
      
      //accept register term and condition  
      resadd = new JTextArea(); 
      resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
      resadd.setBounds(580, 175,200,75); 
      resadd.setLineWrap(true); 
      c.add(resadd); 


                
      setVisible(true);
      
 
     }//end of class public myframe
     
     
      //override
      public void actionPerformed(ActionEvent e) {
      
         if(e.getSource() == subButton) {
         
            if(term.isSelected()) {
         
            String title = "\t" + "Registration Form" + "\n\n";
            String data = "Name:" + nameText.getText() + "\n\n";
            String data1 = "IC No:" + icText.getText() + "\n\n";
                          
            String data2 = "Phone No:" + phoneText.getText() + "\n\n";
            String data3 = "E-mail:" + emailText.getText() + "\n\n";
            String data4 = "Address:"   + addressText.getText() + "\n\n";
            String data5;
            
            //selection
             if (mansionButton.isSelected()) {
                 data5 = "Category : Mansion"
                     + "\n" + "Price of House: RM18 million" 
                     + "\n" + "Square Feet   : 10,000" 
                     + "\n" + "BedRoom     : Avaiable"
                     + "\n" + "Master Room   : Aviable" 
                     + "\n" + "Master Room Including one balcony"
                     + "\n" + "Kitchen       : Avaiable"
                     + "\n" + "Store Room    : Avaiable"
                     + "\n" + "Wash Room     : Avaiable"
                     + "\n" + "Swimming Pool : Avaiable"
                     + "\n" + "Gym Room      : Avaiable"
                     + "\n" + "Cinema        : Avaiable";

                     }
                     
            else if (semidButton.isSelected()) {
                     data5 = "Category : Semi D"
                     + "\n" + "Price of House: RM800,000" 
                     + "\n" + "Square Feet   : 3000" 
                     + "\n" + "BedRoom     : Avaiable"
                     + "\n" + "2 Bedroom on ground floor" + "1 Bedroom on first floor."
                     + "\n" + "Master Room   : Aviable" 
                     + "\n" + "Kitchen       : Avaiable"
                     + "\n" + "Store Room    : Avaiable"
                     + "\n" + "Wash Room     : Avaiable"
                     + "\n" + "Public Garden : Avaiable"
                     + "\n" + "Playground    : Avaiable"
                     + "\n" + "Security      : Avaiable";

                     }
                     
                     else {
                            data5 = "Category : Flat" 
                            + "\n" + "Price of House: RM200,000" 
                            + "\n" + "Square Feet   : 800" 
                            + "\n" + "BedRoom     : Avaiable"
                            + "\n" + "Master Room   : Aviable" 
                            + "\n" + "Kitchen       : Avaiable"
                            + "\n" + "Store Room    : Avaiable"
                            + "\n" + "Wash Room     : Avaiable"
                            + "\n" + "Wash Room NOT Avaiable on Master Room ."
                            + "\n" + "Public Garden : Avaiable"
                            + "\n" + "Lift          : Avaiable"
                            + "\n" + "Floor         : More than 2 floors";

                         }
                                    
            output.setText(title + data + data1 + data2 + data3 + data4 + data5); 
            output.setEditable(false); 
            res.setText("Registration Successfully !"); 
            
          }//end of if
          
          else { 
            output.setText(""); 
            resadd.setText(""); 
            res.setText("Please accept the"
                     + " terms & conditions.."); 
         } 

          
          }
          
       else if (e.getSource() == resButton) { 
         String def = ""; 
         nameText.setText(def); 
         icText.setText(def); 
         phoneText.setText(def); 
         emailText.setText(def);
         addressText.setText(def); 
         output.setText(def); 
         res.setText(def);
         }//end of else if

            
            
        }//end of class action perfoemed method

      }//end of class
      
      //drive code
      class Register {
      public static void main(String[] args) throws Exception 
   { 
      Frame f = new Frame(); 
   } 
} //end of class registration

 
         