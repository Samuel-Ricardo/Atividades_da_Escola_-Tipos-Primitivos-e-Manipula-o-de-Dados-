/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_15;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class SomaDosMaiores {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cont = 0;

        float num[] = new float[3];

        float maior1 = -10000000;
        float maior2 = -10000000;

        while (num.length > cont) {

            System.out.println("Digite um número");

            num[cont] = tec.nextFloat();

            if (num[cont] > maior1) {
                maior2 = maior1;
                maior1 = num[cont];
            }else if(num[cont]>maior2){
                maior2 = num[cont];
            }
     System.out.println(maior1);
            System.out.println(maior2);
            cont++;
        }

        System.out.println("A soma dos 2 maiores é é: "+ (maior1 + maior2));
   
    }
}

