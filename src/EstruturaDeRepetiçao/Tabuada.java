/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeRepetiçao;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Tabuada {
    
     public static void main(String[] args) {

          int n = 0;
          
       do{
           
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 10");

        n = tec.nextInt();
        
       }while(n <= 0 || n >10);
        
         System.out.println("Tabuada do "+n+":");
         System.out.println("");
       
        for (int cont = 1; cont < 11; cont++) {

            System.out.println(n + " x " + cont + " = " + cont*n);

        }
    }
    
}
