/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropar;

/**
 *
 * @author pe-th
 */
public class NumeroPar {

    
    public static void main(String[] args) {
        
        int numero = 0;
        
        if(numero >0){
            if(numero%2 == 0){
                System.out.println("el numero es par");
            }
            else{
                System.out.println("El numero es impar");
            }
        }
        else{
            System.out.println("Ingrese un numero positivo");
    }
    }
    
}
