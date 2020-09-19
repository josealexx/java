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
public class Aprovacao {


/* Exercício 06
   A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, 
   ficou de recuperação ou foi reprovado. 
   A média de aprovação é >= 7.0; 
   a média de recuperação é >= 5.0 e < 7.0; e 
   a média do reprovado é < 5.0
*/

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, media;
        
        System.out.println("Entre com a primeira nota:");
        nota1 = new Scanner(System.in).nextDouble();
        
        System.out.println("Entre com a segunda nota:");
        nota2 = new Scanner(System.in).nextDouble();
        
        System.out.println("Entre com a terceira nota:");
        nota3 = new Scanner(System.in).nextDouble();
        
        media = (nota1+nota2+nota3)/3;
        if(media >= 7) {
            System.out.println("Aprovado com média "+media);
        }
        else if(media >=5) {
            System.out.println("Recuperação com média "+media);
        }
        else {
            System.out.println("Reprovado com média "+media);
       }
   }
}


    

