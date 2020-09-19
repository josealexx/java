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
public class Professor extends Pessoa{
    int num_funcionario;
    String grau_academico;
    String nacionalidade;
    String especialidade;        

    public Professor(int num_funcionario, String grau_academico, String nacionalidade, String especialidade, String nome, String genero, String data_nasc, String estado_civil) {
        super(nome, genero, data_nasc, estado_civil);
        this.num_funcionario = num_funcionario;
        this.grau_academico = grau_academico;
        this.nacionalidade = nacionalidade;
        this.especialidade = especialidade;
    }

    public Professor(){
        
        
        this.nome = "José Alexandre";
        this.genero = "Masculino";
        this.data_nasc = "1994-07-05";
        this.estado_civil = "divorciado";
        
        this.num_funcionario = 50505;
        this.grau_academico = "Mestre";
        this.nacionalidade = "Angolana";
        this.especialidade = "Programação";
    
    
    }

    public void imprimir() {
        System.out.println("Professor");
        super.imprimir();
        System.out.println(" num_funcionario=" + num_funcionario + "\n grau_academico=" + grau_academico + "\n nacionalidade=" + nacionalidade + "\n especialidade=" + especialidade);
    }
    
    
    



}
