/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_5;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class PodeVotar {
    
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite quando nasceu");

        int nascimento = tec.nextInt();
        int idade = 2020 - nascimento;
        
        if (idade < 16) {
            
            System.out.println("Nao pode voltar");
            System.out.println("idade: "+idade);

        } else {

            System.out.println("pode voltar");
            System.out.println("idade: "+idade);

        } 
    }

    
}
