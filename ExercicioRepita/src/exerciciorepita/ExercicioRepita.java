/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author aliso
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        int par =0;
        int impar = 0;
        int cem=0;
        int media =0;
        int soma = 0;
        int resposta;
        int n;
        
        
        do {
           n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: \n (0) Interrompe "));
           total++;
           if (n%2 == 0) {
               par++;
           } else {
               impar++;
           }
           
           if (n>100) {
               cem++;
           }
           
           soma += n;
           media = soma/total;
           
        } while (n!=0);
        
        JOptionPane.showMessageDialog(null, "Resultado:\n ----------------------\n Total de Valores: "+total+
                "\n Total de Pares: "+par+"\nTotal de ímpares: "+impar+"\n Acima de 100: "+cem+
                "\n Média dos valores: "+media);
        
    
}}
