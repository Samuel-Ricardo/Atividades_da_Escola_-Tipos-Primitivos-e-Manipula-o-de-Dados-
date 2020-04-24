/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_3;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class ComprarMaca {
    
      public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Quantas maças vai comprar?");
        
        int maca = tec.nextInt();
        float preco;
        
        if(maca<12){
            
            preco = 1.30f;
            
        }else{
            
            preco = 1.0f;
            
        }
        
          System.out.println("O preço é: R$"+preco*maca);
    }
    
}
