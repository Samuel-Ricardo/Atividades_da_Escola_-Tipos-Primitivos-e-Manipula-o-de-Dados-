/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_10;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class SalarioDoVendedor {
    
     public static void main(String[] args) {
        
        float bonus;
        float extra;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("------------------------------------------------");
        System.out.println("+Digite o quanto voce vendeu no mes em R$:     +");
        float vendas = tec.nextFloat();
        System.out.println("+                                              +");
        System.out.println("------------------------------------------------");
         
        System.out.println("");
        
        System.out.println("-------------------------------------------------");
        System.out.println("+Digite o salário fixo que voce ganha no mes:   +");
        float salario = tec.nextFloat();
        System.out.println("+                                               +");
        System.out.println("-------------------------------------------------");
         
        if (vendas <= 1200){
            
            bonus =(vendas/100)*3;
            salario = salario + bonus;
            
            System.out.println("");
            
            System.out.println("-------------------------------------------------");
            System.out.println("+ seu salário total no mes é: "+ salario);
            System.out.println("+ seu bonus salárial foi de : "+bonus);
            System.out.println("-------------------------------------------------");
            System.out.println("");
            
        }else{
            
            bonus =(vendas/100)*5;
            extra =((vendas-1200)/100)*5; 
            salario = salario + bonus + extra;
            
            System.out.println("");
            
            System.out.println("-------------------------------------------------");
            System.out.println("+ seu salário total no mes é: "+ salario);
            System.out.println("+ seu bonus salárial foi de: "+bonus + extra);
            System.out.println("-------------------------------------------------");
            System.out.println("");
            
            
        }
        
    }
    
}
