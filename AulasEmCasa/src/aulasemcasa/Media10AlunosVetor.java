/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasemcasa;
import java.util.*;
/**
 *
 * @author pc
 */
public class Media10AlunosVetor {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String aluno[]=new String[10];
    float[] notaProgr,notaMP,notaFBD,media;
    notaProgr=new float[10];
    notaMP=new float[10];
    notaFBD=new float[10];
    media=new float[10];
    
    float soma=0,mediageral;
    
    for(int i=1;i<=10;i++){

        System.out.print("digite a nome do aluno ");
        System.out.println(i);        
        aluno[i]=input.next();
        
        System.out.println("digite a nota de programação ");
        notaProgr[i]=input.nextFloat();
        
        System.out.println("digite a nota de microprocessadores ");
        notaMP[i]=input.nextFloat();
        
        System.out.println("digite a nota de Base de dados ");
        notaFBD[i]=input.nextFloat();
        
        media[i]=(notaFBD[i]+notaMP[i]+notaProgr[i])/3;
        soma=soma+media[i];
    
    }
    mediageral=soma/10;
    System.out.println("Lista de alunos");
        System.out.println("Nome            programação   microprocessdores  base de dados      media");    
    for(int i=1;i<=10;i++){
    
        System.out.print(i);
        System.out.print(" ");    
        System.out.println(aluno[i]+"  "+notaProgr[i]+"  " +notaMP[i]+ "  " +notaFBD[i]+ "  "+media[i]);
    }
        System.out.println("media geral da turma: %.1f \n" +mediageral);
        input.close();
    }
}
