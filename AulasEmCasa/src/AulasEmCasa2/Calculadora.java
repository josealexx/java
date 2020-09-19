/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulasEmCasa2;
import java.util.*;
/**
 * @author pc
 */
public class Calculadora {
 public static void main(String[] args){
    Scanner ler=new Scanner(System.in);
    String seuNome;
    System.out.println(" digite o seu nome");
    seuNome=ler.nextLine();
     System.out.println("ola! "+seuNome+"\n eu sou o Alexandre");
     Random rnd=new Random();
     int num1,num2;   
    String continua="SIM";
    while(continua.toUpperCase().equals("SIM")){
        System.out.println("digite o primeiro Numero");
        num1=ler.nextInt();
        System.out.println("digite o segundo Numero ");
        num2=ler.nextInt();
        
        System.out.println("primeiro Numero " +num1);
        System.out.println("segundo Numero " +num2);
        System.out.println("soma = " +soma(num1,num2));
        System.out.println("produto  = " +produto(num1,num2));
        if(num1>num2){
            System.out.println("Numero 1 ="+num1);
        }else{
            System.out.println("Numero 2 ="+num2);
        }
        System.out.println("Maior na função =" +maior(num1,num2));
        System.out.println("para executar novamente digite(SIM)");
        continua=ler.nextLine();
        
        
    }
 }
    static int soma(int a, int b){
        int s;
        s=a+b;
        return s;
    }
    
    static int produto(int a,int b){
        return a*b;
    }
    
    static float dobro(float n){
    return n*2;
    }
    
    static int maior(int a, int b){
    return(a > b ? a : b);
    }
    
}