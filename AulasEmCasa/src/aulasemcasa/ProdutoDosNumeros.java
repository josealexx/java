/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasemcasa;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ProdutoDosNumeros {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
          System.out.println("Digite Um numero");
          int numero =sc.nextInt();
          int produto=1;
          for(int x=1;x<=numero;x++){
          
          System.out.println("numeros gerados são " +x);
          produto=produto*x;
          }
           System.out.println("Oproduto dos numeros é " +produto);
        
    }
}
