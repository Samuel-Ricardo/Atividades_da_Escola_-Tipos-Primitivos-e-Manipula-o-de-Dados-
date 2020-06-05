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
public class ContadorDeNumerosDiferenteDeZero {
    
      public static void main(String[] args) {

          int n = 0;
          
       do{
           
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número maior que de 0");

        n = tec.nextInt();
        
       }while(n <= 0);
        
        for (int cont = 1; cont < n + 1; cont++) {

            System.out.println(cont);

        }
    }
    
}
