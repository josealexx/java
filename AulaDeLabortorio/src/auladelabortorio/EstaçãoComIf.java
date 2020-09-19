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
public class EstaçãoComIf {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        int semana=0;
        System.out.println("Digite o numero da semana");
        semana =sc.nextInt();
        
        if((semana>=2)&&(semana<=5)){
            System.out.println("Mes de Janeiro");
              System.out.println("A estação é inverno");
        }
        
        if((semana>=2)&&(semana<=5)){
            System.out.println("Mes de Janeiro");
              System.out.println("A estação é inverno");
        }
        if((semana>=6)&&(semana<=9)){
            System.out.println("Mes de fevereiro");
              System.out.println("A estação é inverno");
        }
        if((semana>=10)&&(semana<=13)){
            System.out.println("Mes de Março");
              System.out.println("A estação é PRIMAVEIRA");
        }
        
        if((semana>=14)&&(semana<=18)){
            System.out.println("Mes de abril");
              System.out.println("A estação é PRIMAVEIRA");
        }
        
        if((semana>=19)&&(semana<=22)){
            System.out.println("Mes de Maio");
              System.out.println("A estação é PRIMAVEIRA");
        }
        if((semana>=23)&&(semana<=26)){
            System.out.println("Mes de Junho");
              System.out.println("A estação é VERÃO");
        }
        if((semana>=27)&&(semana<=31)){
            System.out.println("Mes de Julho");
              System.out.println("A estação é VERÃO");
        }
        if((semana>=32)&&(semana<=35)){
            System.out.println("Mes de Agosto");
              System.out.println("A estação é inverno");
        }
        if((semana>=36)&&(semana<=40)){
            System.out.println("Mes de setembro");
              System.out.println("A estação é OUTONO");
        }
        
       
        if((semana>=41)&&(semana<=44)){
            System.out.println("Mes de outubro");
              System.out.println("A estação é OUTONO");
        }
        if((semana>=45)&&(semana<=48)){
            System.out.println("Mes de novembro");
              System.out.println("A estação é OUTONO");
        }
        if((semana>=49)&&(semana<=52)){
            System.out.println("Mes de dezembro");
              System.out.println("A estação é inverno");
        }
    }
    
}
