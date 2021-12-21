/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostrinh;

/**
 *
 * @author aliso
 */
public class ComparacaoStrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Alison";
        String nome2 = "Alison";
        String nome3 = new String("Alison");
        String res;
        
        res = (nome1.equals(nome3))?"Igual":"diferentes";
        System.out.println(res);
        
    }
    
}
