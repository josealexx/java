/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladelabortorio;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MaiorNumero {
    
    
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);

       int j,k,l,m;
       
       System.out.println("digite primeiro numero inteiro");
       j=sc.nextInt();
       
       System.out.println("digite o segundo inteiro");
       k=sc.nextInt();
       
       System.out.println("digite o terceiro inteiro");
       l=sc.nextInt();
       
       System.out.println("digite o quarto inteiro");
       m=sc.nextInt();
       
       System.out.println("os numero inseridos são:");
       System.out.println("primeiro " +j);
       System.out.println("segundo numero" +k);
       System.out.println("terceiro numero"  +l );
       System.out.println("quarto numero"  +m);
       
       if((j>k)&&(j>l)&&(j>m)){
           System.out.println("o maior numero e o primeiro: " +j);
       }
       
       if((k>j)&&(k>l)&&(k>m)){
           System.out.println("o maior numero e o segundo:" +k);
       }
       
       if((l>j)&&(l>k)&&(l>m)){
           System.out.println("o maior numero e terceiro:" +l);
       }
       
       if((m>j)&&(m>k)&&(m>l)){
           System.out.println("o maior numero e o quarto: " +m);
       }
    }
    
}
