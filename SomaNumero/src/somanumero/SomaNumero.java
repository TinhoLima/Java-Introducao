/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somanumero;

import java.util.Scanner;

/**
 *
 * @author aliso
 */
public class SomaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,s = 0;
        String resposta;
        
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Informe um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer continuar ? S/N");
            resposta = teclado.next();
            
        } while (resposta.equals("s"));
        System.out.println("A soma total dos números é de: "+s);
        
    }
    
}
