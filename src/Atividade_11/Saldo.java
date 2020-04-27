/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_11;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Saldo {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        double saldo = 0;
        double debito = 0;
        double credito = 0;
        boolean online = true;
        int escolha;
        int numConta;

        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("Digite o numero da sua conta:");
        numConta = tec.nextInt();
        System.out.println("-------------------------------------------------");

        do {

            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("Numero da conta: " + numConta);
            System.out.println("-------------------------------------------------");
            System.out.println("-------------------------------------------------");
            System.out.println("seu saldo atual: " + saldo);
            System.out.println("-------------------------------------------------");
            System.out.println("Operaçoes: ");
            System.out.println("(1)-Débito ");
            System.out.println("(2)-Crédito");
            System.out.println("-------------------------------------------------");
            escolha = tec.nextInt();

            switch (escolha) {

                case 1:

                    System.out.println("");
                    System.out.println("-------------------------------------------------");
                    System.out.println("digite o valor debitado: ");
                    debito = tec.nextDouble();
                    System.out.println("-------------------------------------------------");
                    saldo = saldo - debito;

                    break;

                case 2:

                    System.out.println("");
                    System.out.println("-------------------------------------------------");
                    System.out.println("digite o valor do credito: ");
                    credito = tec.nextDouble();
                    System.out.println("-------------------------------------------------");
                    saldo = saldo + credito;

                    break;
            }

            if (saldo <= 0) {

                System.out.println("");
                System.out.println("-------------------------------------------------");
                System.out.println("Seu saldo está negativo");

            }else{
                        
                System.out.println("");
                System.out.println("-------------------------------------------------");
                System.out.println("Seu saldo está Positivo");
                
                        }
            
                System.out.println("-------------------------------------------------");
                System.out.println("Numero da conta: " + numConta);
                System.out.println("-------------------------------------------------");
                System.out.println("seu saldo atual: " + saldo);
                System.out.println("-------------------------------------------------");
            
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
