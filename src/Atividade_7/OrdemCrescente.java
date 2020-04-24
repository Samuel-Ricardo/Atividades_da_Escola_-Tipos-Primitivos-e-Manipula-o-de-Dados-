/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_7;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class OrdemCrescente {
    
     public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um numero");

        int num1 = tec.nextInt();

        System.out.println("Digite outro");

        int num2 = tec.nextInt();

        if (num1 < num2) {
            
            System.out.println(num1 +" , "+ num2);

        } else {

             System.out.println(num2 +" , "+ num1);

        }
        
    }

    
}
