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
public class ContarNumeros {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número");

        int n = tec.nextInt();

        for (int cont = 1; cont < n + 1; cont++) {

            System.out.println(cont);

        }
    }
}
