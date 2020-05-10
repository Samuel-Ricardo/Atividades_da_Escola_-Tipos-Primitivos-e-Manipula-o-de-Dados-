/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_14;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class MaiorDe3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cont = 0;

        float num[] = new float[3];

        float maior = -1000000;
        float menor = 10000000;

        while (num.length > cont) {

            System.out.println("Digite um número");

            num[cont] = tec.nextFloat();

            if (num[cont] < menor) {
                menor = num[cont];
            }

            if (num[cont] > maior) {
                maior = num[cont];

            }
            cont++;
        }

        System.out.println("o maior é: " + maior);
        System.out.println("o menor é: " + menor);
    }
}
