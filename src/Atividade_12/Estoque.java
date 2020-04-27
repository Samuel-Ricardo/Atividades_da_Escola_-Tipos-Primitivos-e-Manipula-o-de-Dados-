/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_12;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Estoque {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int estoqueAtual = 0;
        int maximo = 0;
        int minimo = 0;
        boolean online = true;
        int escolha;
        float media;

        do {

            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("digite a guantidade de estoque atual: ");
            estoqueAtual = tec.nextInt();
            System.out.println("-------------------------------------------------");
            System.out.println("digite a guantidade maxima de estoque: ");
            maximo = tec.nextInt();
            System.out.println("-------------------------------------------------");
            System.out.println("digite a guantidade minina de estoque: ");
            minimo = tec.nextInt();

            media = (maximo + minimo);
            media = media / 2;

            if (estoqueAtual <= media) {

                System.out.println("");
                System.out.println("-------------------------------------------------");
                System.out.println("efetuar compra");
                System.out.println("-------------------------------------------------");

            } else {

                System.out.println("");
                System.out.println("-------------------------------------------------");
                System.out.println("nao efetuar compra");
                System.out.println("-------------------------------------------------");

            }

            System.out.println("deseja continuar?");
            System.out.println("-------------------------------------------------");
            System.out.println("(1)-Sim ");
            System.out.println("(2)-Nao ");
            System.out.println("-------------------------------------------------");
            escolha = tec.nextInt();

            if (escolha == 2) {

                online = false;

            }

        } while (online);

    }
}
