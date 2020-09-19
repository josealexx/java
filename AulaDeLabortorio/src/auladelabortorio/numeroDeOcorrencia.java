/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladelabortorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class numeroDeOcorrencia {
    
        public static void main(String[] args){
        int i=20;
            int pos=0,min=100;
        int h=0;
        
        Scanner sc = new Scanner(System.in);
        Random rc=new Random();  
        int x=rc.nextInt(1001);

        int[] array = new int [10000];
        int[] array1 = new int [100];
            
        for(int m=0;m<10000;m++){

            x=rc.nextInt(1001); 
            array[m]=x;
        
        }

        for(int m=0;m<1000;m++){
            System.out.println("----");
            System.out.println(array[m]);
            
            if(min>array[m]){
            min=array[m];
            pos=m;
            System.out.println("-");
            }
            
        }
        for(int m=0;m<10000;m++){
        
            if(array[m]==min){
                array1[i]=m;
                h++;
        
            }}
        
        
        System.out.println("o menor elemento e: " +min);
        System.out.println("esta na posiçã: " +pos);
        System.out.println("o minimo ocorre " +h+" vezes");
        System.out.println("na posição " +array1[1]);
           System.out.print("nas posições ");
            for(int m=0;m<=array1.length;m++){
                System.out.print("");
            }
    
    }
}

