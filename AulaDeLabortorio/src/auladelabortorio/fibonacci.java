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
public class fibonacci {
    
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    System.out.println(" digite o numero que pretendes mostrar a serie");
    int n = sc.nextInt();
    
    System.out.println("\n\n" +n);
    for(int i=0;i<n;i++){
        
        if(i>=1){
            for(int j=0;j<i;j++){
                System.out.print(n);
                            }
                System.out.println(n);
                }
    
    
    
    }
    
}
}
