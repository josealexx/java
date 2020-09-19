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
public class EstaçãoComSemana {
    
     public static void main(String[] args) {
  // TODO code application logic here
  
        Scanner sc = new Scanner(System.in);
        int semana=0;
        System.out.println("Digite o numero da semana");
        semana =sc.nextInt();
        if((semana>=45)&&(semana<=53)){
            System.out.println("A estação é inverno");
        }
        if((semana>=1)&&(semana<=8)){
            System.out.println("A estação é inverno");
        }
        if((semana>=9)&&(semana<=20)){
            System.out.println("A estação é primavera");
        }
        if((semana>=21)&&(semana<=32)){
            System.out.println("A estação é Verão");
        }
        if((semana>=33)&&(semana<=44)){
            System.out.println("A estação é Outono");
        }
        
        if((semana<=0)||(semana>49)){
            System.out.println("O numero da semana não corresponde");
        }
        
        
        
        
    }
    
}
