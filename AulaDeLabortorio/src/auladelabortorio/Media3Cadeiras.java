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
public class Media3Cadeiras {
  
    
    
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner sc = new Scanner(System.in);

         System.out.println("Digite a nota de programação");
          double progr  =sc.nextDouble();
        
         System.out.println("Digite a nota de Fundamentos de bases de dados");
          double FBD =sc.nextDouble();
        
         System.out.println("Digite a nota de MicroProcesadores");
          double MP =sc.nextDouble();
        
          double media=(progr+FBD+MP)/3;

          
              if((media<5)){
              
              System.out.println("estudante pessimo com media " +media);
              }
              if((media>=5)&&(media)<10){
              
              System.out.println("estudante Mediocre com media " +media);
              }
              if((media>=10)&&(media<=15)){
              
              System.out.println("estudante bom com media " +media);
              }
              if(media>15){
              
              System.out.println("estudante excelente com media " +media);
              }
              if((media<0)&&(media>20)){
             System.out.println("media não pode ser negativa nem maior de 20 ");
              
              } 
    
          }
    }
