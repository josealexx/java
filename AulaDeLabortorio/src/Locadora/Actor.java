/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora;

/**
 *
 * @author pc
 */
public class Actor {
    
    String nome_real;
    String nome_artistico;
    int data;
    String nacionalidade;

    public Actor(String nome_real, String nome_artistico, int data, String nacionalidade) {
        this.nome_real = nome_real;
        this.nome_artistico = nome_artistico;
        this.data = data;
        this.nacionalidade = nacionalidade;
    }
 void imprimirActor(){
 
     System.out.println("Nome real: " +nome_real);
     System.out.println("Nome Artistico: " +nome_artistico);
     System.out.println("data de nascimento:  " +data);
     System.out.println("Nacionalidade: "+nacionalidade);
 
 }   
    
}
