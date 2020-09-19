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
 
public class Emprestimo{
 
    public static void main(String[] args) {
        String nome, cargo;
        float sal, emprestimo=0;
 
        System.out.println("Por favor informe seu nome");
        nome = new Scanner(System.in).nextLine();
        System.out.println("E agora informe seu cargo (Diretor, Gerente ou Operacional");
        cargo = new Scanner(System.in).nextLine();
 
        while (cargo == "Diretor" || cargo == "Gerente" || cargo =="Operacional"){
            System.out.println("Cargo incorreto, por favor informe o cargo novamente");
            cargo = new Scanner(System.in).nextLine();    
        }
 
        System.out.println("Agora informe o seu salário");
        sal = new Scanner(System.in).nextFloat();
 
        if (cargo.equals("Gerente"))
            emprestimo = sal*25/100;
        else if (cargo.equals("Diretor"))
                emprestimo = sal*30/100;
                else 
                    emprestimo = sal*20/100;
 
        System.out.println("Olá "+nome);
        System.out.print("Seu cargo é "+cargo+", ");
        System.out.println("Seu sálario é "+sal);
        System.out.println("E você tem direito a pegar R$"+emprestimo+" de empréstimo.");
    }
 
}