/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs2;

/**
 *
 * @author Lenovo
 */
public class Tgs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             int umur = 22;
       String paras = "cantik";
       String kepintaran = "pintar";
       if (umur <= 23 && umur >= 20 && kepintaran == "pintar" && paras == "cantik") {
           System.out.println("Pasti Mau!");
       } else if (umur <= 23 && umur >= 20 && paras == "cantik") {
           System.out.println("OK Lah");
       } else if (umur >= 23 && paras == "cantik") {
           System.out.println("Saya pikir dulu");
       } else {
           System.out.println("No Way!");
       }
    }
    
}

   }
    

