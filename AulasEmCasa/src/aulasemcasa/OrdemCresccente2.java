/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasemcasa;

/**
 *
 * @author pc
 */

import java.util.Scanner;
public class OrdemCresccente2{
    public static void main(String[] args) {
        int n1, n2, n3;
 
        System.out.println("Digite o primeiro número : ");
        n1 = new Scanner(System.in).nextInt();
 
        System.out.println("Digite o segundo número : ");
        n2 = new Scanner(System.in).nextInt();
 
        System.out.println("Digite o terceiro número : ");
        n3 = new Scanner(System.in).nextInt();
 
        if(n1 == n2 && n2 == n3){
            System.out.println("Os números são iguais : "+n1+", "+n2+" e "+n3);
        }
        else{
            if(n1 > n2 && n1 > n3){
                if(n2 > n3){
                    System.out.println("Ordem dos números : "+n3+", "+n2+" e "+n1);
                }
                else{
                    System.out.println("Ordem dos números : "+n2+", "+n3+" e "+n1);
                }
            }
            else if(n2 > n3){
                if(n1 > n3){
                    System.out.println("Ordem dos números : "+n3+", "+n1+" e "+n2);
                }
                else{
                    System.out.println("Ordem dos números : "+n1+", "+n3+" e "+n2);
                }                
            }
            else{
                if(n1 > n2){
                    System.out.println("Ordem dos números : "+n2+", "+n1+" e "+ n3);
                }
                else{
                    System.out.println("Ordem dos números : "+n1+", "+n2+" e "+ n3);
                }
            }
        }
    }
 
}

