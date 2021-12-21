/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author aliso
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = {3, 7, 5, 6, 1, 9};
        for (int v: vetor) {
            System.out.println(v+" ");
        }
        System.out.println("");
        int busca = Arrays.binarySearch(vetor,7);
        System.out.println("Encontrei o valor na posição " + busca);
    }
    
}
