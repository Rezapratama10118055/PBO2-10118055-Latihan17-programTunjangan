/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan17Programtunjangan {

    public static double tunjang;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
       
       
       
       
       
        System.out.println("==========================================");
        Scanner userInput = new Scanner (System.in);
         System.out.print("Berapa gaji pokok anda perbulan?: ");  
      
         double input = userInput.nextDouble();
       
       
         System.out.println("Berapa gaji pokok anda perbulan?: "+input);  
        System.out.println("status anda?");
        String gaji = userInput.next();
        System.out.println("==========================================");
        tunjang =("menikah".equals(gaji))?0.35*input:0;
         System.out.println("gaji pokok:"+input);
          System.out.println("tunjangan:"+tunjang);
           double tolgat = tunjang + input;
           System.out.println("total gaji:"+tolgat);
    }
    
}
