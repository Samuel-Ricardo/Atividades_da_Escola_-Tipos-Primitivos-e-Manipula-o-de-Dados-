/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_9;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class JornadaDeTrabalho {
    
    public static void main(String[] args) {
        
        float bonus;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("------------------------------------------");
        System.out.println("+Digite as horas trabalhadas no mes:     +");
        float trabalhado = tec.nextFloat();
        System.out.println("+                                        +");
        System.out.println("------------------------------------------");
         
        System.out.println("");
        
        System.out.println("-------------------------------------------------");
        System.out.println("+Digite o salário normal que voce ganha no mes: +");
        float salario = tec.nextFloat();
        System.out.println("+                                               +");
        System.out.println("-------------------------------------------------");
         
        if (trabalhado/4 <= 40){
            
            System.out.println("");
            
            System.out.println("-------------------------------------------------");
            System.out.println("+ seu salário total no mes é: "+ salario);
            System.out.println("+ seu salário por hora trabalhada foi: "+salario/trabalhado);
            System.out.println("-------------------------------------------------");
            System.out.println("");
            
        }else{
            
            bonus =(salario/100)*50;
              
            salario = salario + bonus;
            
            System.out.println("");
            
            System.out.println("-------------------------------------------------");
            System.out.println("+ seu salário total no mes é: "+ salario);
            System.out.println("+ seu salário por hora trabalhada foi: "+salario/trabalhado);
            System.out.println("-------------------------------------------------");
            System.out.println("");
            
            
        }
        
    }
    
}
