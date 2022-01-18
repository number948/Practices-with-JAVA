/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciasswitch;

/**
 *
 * @author pe-th
 */
public class SentenciasSwitch {

    
    public static void main(String[] args) {
        
        char nota = '7';
        
        switch(nota){
            
            case '5':
                System.out.println("Suficiente");
                break;
            case '6':
                System.out.println("bien");
                break;
            case '7':
                System.out.println("notable");
                break;
            case '8':
                System.out.println("notable +");
                break;
            case '9':
                System.out.println("Sobreliente");
                break;
            default:
                System.out.println("Suspendido");
             
        }
                
    }
    
}
