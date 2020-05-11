/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_16;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class OrdenCrescente {
    
    public static void main(String[] args) {
        
     Scanner tec = new Scanner(System.in);
        int cont = 0;

        float num[] = new float[3];

        float num1 = -10000000;
        float num2 = -10000000;
        float num3 = -10000000;
        
        while (num.length > cont) {

            System.out.println("Digite um número");

            num[cont] = tec.nextFloat();

            if (num[cont] > num1 && num[cont] > num2 && num[cont] > num3){
                num3 = num2;
                num2 = num1;
                num1 = num[cont];
                System.out.println(num1+"  1");
            }else if(num[cont] > num2 && num[cont] > num3){
                num3 = num2;
                num2 = num[cont];
                System.out.println(num2+"  2");
            }else if(num[cont] > num3){
                num3 = num[cont];
                System.out.println(num3+"  3");
            }
            cont++;
        }

        System.out.println("A ordem crescente é:"+num1+", "+num2+", "+num3);
   
    }
    
}
