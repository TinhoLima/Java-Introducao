/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contagempernas;

import java.util.Scanner;

/**
 *
 * @author aliso
 */
public class ContagemPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        
        int pernas = teclado.nextInt();
        String tipo;
        
        System.out.print("Isso é um(a) ");
        switch(pernas) {
            case 1:
                tipo = "Saci pererê.";
                break;
            case 2:
                tipo = "Bípede.";
                break;
                
            case 3:
                tipo = "Tripé.";
                break;
            case 4:
                tipo = "Quadrúpede.";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "E.T";
        }
        
        System.out.println(tipo);
        
    }
    
}
