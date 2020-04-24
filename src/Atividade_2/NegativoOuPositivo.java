/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_2;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class NegativoOuPositivo {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um numero");

        int numero = tec.nextInt();

        if (numero < 0) {

            System.out.println("è negativo");

        } else{

            System.out.println("é positivo");

        } 
    }

}
