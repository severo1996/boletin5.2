package boletin5.pkg3;

import javax.swing.JOptionPane;

public class Boletin53 {

    public static void main(String[] args) {
       double radio; 
       String arealonxitude=JOptionPane.showInputDialog("Radio"); 
         radio=Double.parseDouble(arealonxitude); 
           circulo cir= new circulo(radio); 
           JOptionPane.showMessageDialog(null,"Area"+ cir.calArea()); 
           JOptionPane.showMessageDialog(null,"Lonxitude"+ cir.calLonxitude()); 
     } 

}
    

