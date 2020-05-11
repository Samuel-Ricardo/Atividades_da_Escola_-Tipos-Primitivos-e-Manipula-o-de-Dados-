/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_19;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class QualMaior {
    
    public static void main(String[] args) {
        
         Scanner tec = new Scanner(System.in);

        System.out.println("Digite um numero");

        float num1 = Float.parseFloat(tec.next());

        System.out.println("Digite outro numero:");

        float num2 = Float.parseFloat(tec.next());

        if (num1 == num2) {

            System.out.println("Sao iguais");

        } else if(num1 > num2){
            
            System.out.println("O Primeiro numero é maior");
            
        }else{
            
            System.out.println("O Segundo numero é maior");
        }
        
    }
    
}
