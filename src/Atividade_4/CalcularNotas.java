/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_4;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class CalcularNotas {

    public static void main(String args[]) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite a nota da 1° avaliaçao");

        double n1 = tec.nextDouble();
        
         System.out.println("Digite a nota da 2° avaliaçao");

        double n2 = tec.nextDouble();
        
        double media = (n1+n2)/2;
        
        if (media < 6) {
            
            System.out.println("Reprovado");
            System.out.println("média: "+media);

        } else {

            System.out.println("Aprovado");
            System.out.println("média: "+media);

        }

    }
}


