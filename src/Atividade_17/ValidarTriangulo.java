/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_17;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class ValidarTriangulo {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite o lado A");
        
        float a = Float.parseFloat(tec.next());
        
        System.out.println("Digite o lado B");
        
        float b = Float.parseFloat(tec.next());
        
        System.out.println("Digite o lado C");
        
        float c = Float.parseFloat(tec.next());
     
        if(a <= b+c && b <= a+c && c <= b+a){
            System.out.println("Pode formar um triangulo");
        }else{
            System.out.println("Nao pode formar um triangulo");
        }
    }
    
}
