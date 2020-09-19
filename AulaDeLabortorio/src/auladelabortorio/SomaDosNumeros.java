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
public class SomaDosNumeros {

    /**programa calcula a soma de todos os valor de 1 ate 
     * o numero digitado
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
        int n,soma=0;
       
               
         System.out.println("Digite o valor n");
          n =sc.nextInt();
          
        if(n>=0){
            for(int i=0;i<=n;i++){
            
            soma=soma+i*i;        
                
            }
            System.out.println("A soma dos numeros e " +soma);
         
        }else{
         System.out.println("O n não e positivo " );
         
        }
        }
    }
    

