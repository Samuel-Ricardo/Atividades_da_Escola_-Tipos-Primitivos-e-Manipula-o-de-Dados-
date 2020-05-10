/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_13;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class PositivoNegativoOuZero {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite um número");
        
        float num1 = tec.nextFloat();
        
        
        if(num1>0){
            
            System.out.println("O "+num1+" é positivo");
            
        }else if(num1 == 0){
            
             System.out.println("O "+num1+" é igual a 0");
            
        }else{
            
             System.out.println("O "+num1+" é negativo");
            
        }
        
    }
    
}
