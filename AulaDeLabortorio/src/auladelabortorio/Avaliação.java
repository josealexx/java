/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladelabortorio;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Avaliação {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Random rc=new Random();  
        int x=rc.nextInt(1001);
        System.out.println("digite o seu nome");
        String nome=entrada.nextLine();
        System.out.print(nome);
        System.out.println(" bem vindo ao jogo do numero escondido");
        System.out.println("voce tem 10 tentativas para achar o numero ");
        
        int palpite, tentativa=1;
        while(tentativa<11){
            
            System.out.println(" digite o seu palpite");
            palpite=entrada.nextInt();
            
            if(palpite<x){
                System.out.println("digite um numero maior");
                System.out.print(tentativa);
                System.out.println(" tentativas");
                tentativa++;
            }
            if(palpite>x){
                System.out.println("digite um numero menor");
                System.out.print(tentativa);
                System.out.println(" tentativas");
                tentativa++;
            }
            
            if(palpite==x){
                System.out.print("parabens ");
                System.out.println(nome);
                System.out.print("\n voce com ");
                System.out.print(tentativa);
                System.out.println(" tentativas");
                tentativa=11;
                System.out.println(x);
            }
            
            
        
        }
        tentativa++;
        if(tentativa>10){
                System.out.println("game over");
                System.out.println(" tentativas");
                tentativa++;
            }
            
        
        
        
    
    }
    
}
