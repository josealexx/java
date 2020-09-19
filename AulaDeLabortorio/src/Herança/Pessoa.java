/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança;

/**
 *
 * @author pc
 */
public class Pessoa {
    String nome;
    String genero;
    String data_nasc;
    String estado_civil;

    public Pessoa(String nome, String genero, String data_nasc, String estado_civil) {
        this.nome = nome;
        this.genero = genero;
        this.data_nasc = data_nasc;
        this.estado_civil = estado_civil;
    }
    
    public Pessoa() {
        this.nome = "Ricardo";
        this.genero = "Masculino";
        this.data_nasc = "1994-04-06";
        this.estado_civil = "Solteiro";
    }

    public void imprimir() {
        
//    System.out.println("dados da pessoa ");
    
        System.out.println("\n  nome = " + nome + "\n genero = " + genero + "\n data_nasc = " + data_nasc + "\n estado_civil = " + estado_civil);
    }
    
    
    
    
            
    
    
}
