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
public class ArrayMaior {
    public static void main(String[] args){
        int i=0,pos=0,max=0;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos elementos terá o Array ?");
         int j=sc.nextInt();
        int[] array = new int [j];
        
        for(int m=0;m<j;m++){

            System.out.println("digite o elemento " +m);
            array[m]=sc.nextInt();

        }

        for(int m=0;m<j;m++){
            if(max<array[m]){
            max=array[m];
            pos=m;
            }    
        }
        System.out.println("o maior elemento e: " +max);
        System.out.println("esta na posiçã: " +pos);
    
    
    }
}
