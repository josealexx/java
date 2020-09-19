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
public class MediaeSoma {
    
  public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
          System.out.println("Digite Um numero");
          int numero =sc.nextInt();
          int soma=0,cont=0,media=0;
          
          while(numero!=20){
          soma=soma+numero;
          cont++;
          System.out.println("Digite Um numero");
          numero =sc.nextInt();
          
          }
	media=soma/cont;
        System.out.println("A media dos  numeros "+media);
        System.out.println("A soma dos numeros "+soma);


  }
  
}
