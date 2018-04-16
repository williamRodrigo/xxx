/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int longitud;
        String acumulador ="";
       
        
        longitud=Integer.parseInt(JOptionPane.showInputDialog("ingrese la dimencion del vector:"));
         int numero []= new int[longitud];
        
         for(int i=0; i<numero.length; i++)
         {
             
        numero[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad: "+ (i+1)) );
   
         }
         
         for(int i=0; i<numero.length; i++)
         {
             
          JOptionPane.showMessageDialog(null, "las edades ingresadas son:\n"+numero[i]);
   
         }
         
       
     
         
         
         int menor=numero[0] ;
         int mayor= numero[0];
         
         
         for(int i=0; i<numero.length; i++)
             
         {
          if(numero[i]>mayor)
         {
         mayor = numero[i];
         
         }
         
         else if(numero[i]<menor)
         {
            
         menor = numero[i];
         }
          
         }
         
         JOptionPane.showMessageDialog(null,"el numero mayor es:"+mayor);
          JOptionPane.showMessageDialog(null,"el numero menor es:"+menor);
         
         
         
         
         
         
         
         
         
        
    }
    
}
