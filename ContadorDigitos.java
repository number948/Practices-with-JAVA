/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadordigitos;

/**
 *
 * @author pe-th
 */
public class ContadorDigitos {

    
    public static void main(String[] args) {
        int num = 0;
        
          if(num > 0){
              if(num <= 10){
                  System.out.println("Es un número de un dígito");
              }
              
              if(num > 10 && num <= 99){
                  System.out.println("Es un número de dos dígito");
              }
              
              if(num >99 && num <=999){
                  System.out.println("Es un número de tres dígitos");
              }
              
              if(num > 999){
                  System.out.println("Su número tiene más de cuatro dígitos");
              
              }
              }
          
   
          else{
              System.out.println("Ingrese un número positivo");
          }
    
    }
}