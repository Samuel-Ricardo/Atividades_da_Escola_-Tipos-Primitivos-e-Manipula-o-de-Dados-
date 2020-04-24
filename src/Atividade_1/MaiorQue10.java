/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_1;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class MaiorQue10 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um numero");

        int numero = tec.nextInt();

        if (numero > 10) {

            System.out.println("è maior que 10");

        } else if (numero < 10) {

            System.out.println("é menor que 10");

        } else {
            System.out.println("é igua a 10");
        }

    }

}
