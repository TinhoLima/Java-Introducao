/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Importante a função scanner para inserir dados.
        Scanner scan = new Scanner(System.in);
        
        // Conjunto informando: Nome, Idade, Nota.
        System.out.print("Informe seu nome: ");
        String nome = scan.nextLine();
        
        System.out.print("Informe a sua idade: ");
        int idade = scan.nextInt();
        
        System.out.print("Informe sua nota: ");
        float nota = scan.nextFloat();
        
        // Resposta no terminal
        System.out.println("A nota é "+ nota);
        System.out.format("A nota de %s de idade de " +idade+ " é %.2f \n", nome, nota);
    }
    
}
