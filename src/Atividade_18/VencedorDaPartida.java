/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_18;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class VencedorDaPartida {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o Time A:");

        String timeA = tec.next();

        System.out.println("Digite Quantos gols ele fez:");

        int golA = tec.nextInt();

        System.out.println("Digite o Time B:");

        String timeB = tec.next();

        System.out.println("Digite Quantos gols ele fez:");

        int golB = tec.nextInt();

        if (golA == golB) {

            System.out.println("O time " + timeA + " empatou com o "+ timeB +" por "+golA+" gols");

        } else if(golA > golB){
            
            System.out.println("O time " + timeA + " ganhou com " + golA + " gols");
            
        }else{
            
            System.out.println("O time " + timeB + " ganhou com " + golB + " gols");
        }
    }

}
