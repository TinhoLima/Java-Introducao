/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataatual;

import java.time.Year;
import java.util.Date;

public class DataAtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date data = new Date();
        int year = Year.now().getValue();
        
        System.out.println("data e hora:");
        System.out.println(data.toString());
        System.out.println(year);
    }
    
}
