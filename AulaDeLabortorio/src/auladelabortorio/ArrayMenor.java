/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladelabortorio;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pc
 */
public class ArrayMenor {
        public static void main(String[] args){
        int i=0,m=0;
            int pos=0,min=100;
        
        
        Scanner sc = new Scanner(System.in);
        Random rc=new Random();  
        int x=rc.nextInt(1001);

        int[] array = new int [1000];
            
        for(m=0;m<1000;m++){

            x=rc.nextInt(1001); 
            array[m]=x;
        
        }

        for(m=0;m<1000;m++){
            System.out.println("----");
            System.out.println(array[m]);
            
            if(min>array[m]){
            min=array[m];
            pos=m;
                System.out.println("-");
            }
            
        }
        System.out.println("o menor elemento e: " +min);
        System.out.println("esta na posiçã: " +pos);
    
        int tamanho = array.length;
        System.out.println(tamanho);
        
        Arrays.sort(array,0, tamanho);
        for(m=0;m<1000;m++){
            System.out.println("----");
            System.out.println(array[m]);
        }    
        
    
    }

        
        
        
        
        
}