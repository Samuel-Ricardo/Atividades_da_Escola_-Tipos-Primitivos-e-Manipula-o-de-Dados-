/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_8;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class CalcularTempoDeJogoDeXadrez {
    
     public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite a hora do começo do jogo (0-24hr)");

        int comeco = tec.nextInt();

        System.out.println("Digite a hora do final do jogo (0-24hr)");
         

        int acabou = tec.nextInt();
        
        System.out.println("terminou no mesmo dia em que começou ou nao?");
        System.out.println("(1) sim");
        System.out.println("(2) nao");
        
        int mesmoDia = tec.nextInt();
        
        if (mesmoDia == 2 ){
            
            acabou = acabou+24;
        
        }
            
        int duracao = acabou-comeco;
        
        if (duracao>24) {

            System.out.println("excedeu o limite");

        } 
        
         System.out.println("Duraçao: "+duracao);
    }

    
}
