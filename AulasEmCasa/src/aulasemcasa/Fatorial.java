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
 
public class Fatorial{
 
    public static void main(String[] args) {
    int n, total=1;
 
    System.out.println("Informe um número para que calcularmos seu fatorial");
    n = new Scanner(System.in).nextInt();
 
    while (n>0){
        total = total*n;
        n--;
    }
    System.out.println("Total: "+total);
    }
 
}
