/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_20;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class PagarPosto {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite o preço da gasolina:");
        float precoGasolina = Float.parseFloat(tec.next());
        System.out.println("Digite o preço de outros combustiveis");
        float precoOutros = Float.parseFloat(tec.next());
        
        System.out.println("(1)Gasolina:");
        System.out.println("+Debito - desconto de 2%");
        System.out.println("+A vísta espécie - desconto de 8%");
        System.out.println("");
        System.out.println("(2)outros Combustiveis: ");
        System.out.println("+A vísta espécie - desconto de 3%");
        
        System.out.println("escolha o que deseja comprar");
        
        switch (tec.nextInt()){
            
            case 1:
                
                System.out.println("Escolha a forma de pagamento");
                
                System.out.println("(1)Debito - desconto de 2%");
                System.out.println("(2)A vísta espécie - desconto de 8%");

                switch(tec.nextInt()){
                    
                    case 1:
                        
                         System.out.println("Digite a quantidade:");
                
                        float quantidade = Float.parseFloat(tec.next());
                        
                        float preco = quantidade*precoGasolina;
                        
                        float desconto = (preco/100)*2;
                        
                         System.out.println("voce deve pagar :"+(preco-desconto));
                         
                         System.out.println("Desconto foi de:" +desconto);
                        
                        break;
                        
                    case 2:
                        
                       System.out.println("Digite a quantidade:");
                
                        float quantidadeGasolina = Float.parseFloat(tec.next());
                        
                        float precoAVista = quantidadeGasolina*precoGasolina;
                        
                        float descontoAVista = (precoAVista/100)*8;
                        
                         System.out.println("voce deve pagar :"+(precoAVista-descontoAVista));
                        
                         System.out.println("Desconto foi de:" +descontoAVista);
                        break;
                    
                }
                
                break;
            
            case 2:
                
                System.out.println("Digite a quantidade:");
                
                float quantidade = Float.parseFloat(tec.next());
                float preco = quantidade*precoOutros;
                float desconto = (preco/100)*3;
                
                System.out.println("voce deve pagar :"+(preco-desconto));
            
                System.out.println("Desconto foi de:" +desconto);
                break;

            
        }
    }
    
}
