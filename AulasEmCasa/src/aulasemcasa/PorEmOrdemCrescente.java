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
public class PorEmOrdemCrescente{
 
    public static void main(String[] args) {
        int a, b, c, aux;
        System.out.print("Entre com 3 numeros inteiros");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();
        if(a>b){
            aux = b;
            b=a;
            a=aux;
        }
 
        if(b>c){
            aux=c;
            c=b;
            b=aux;
        }
        if(b<a){
            aux=b;
            b=a;
            a=aux;
 
        }
        System.out.print(" "+a +"<" +b +"<" +c);
    } 
}