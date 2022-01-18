/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavariables;

/**
 *
 * @author pe-th
 */
public class practicaConstantes {
    static final float pi= (float) 3.14;
    
    public static void main(String[] args) {
    
        float n1 = (float) 2.5, n2 = (float) 7.2, n3 = 0;
        
        n3 = pi;
        n2 = n3 + pi;
        n1 = n2 /n1;
        n3 = n2 /n1;
        n2 = n2 - pi;
        
        
        System.out.println("el valor de n1 ="+n1);
        System.out.println("el valor de n2 ="+n2);
        System.out.println("el valor de n3 ="+n3);
        
        
}
}
