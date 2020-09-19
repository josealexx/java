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
public class Emprestimo {
    String nome;
    int num_associado;
    int qtd_dvd_emprestado;
    int num_dvd;
    int n_emprestimo;

    public Emprestimo(String nome, int num_associado, int qtd_dvd_emprestado, int num_dvd, int n_emprestimo) {
        this.nome = nome;
        this.num_associado = num_associado;
        this.qtd_dvd_emprestado = qtd_dvd_emprestado;
        this.num_dvd = num_dvd;
        this.n_emprestimo = n_emprestimo;
    }
    
    void imprimirEmprestimo(){
    
        System.out.println("Nome: " +nome);
        System.out.println("Numero de associado "+num_associado);
        System.out.println("quantidade de DVD emprestado " +qtd_dvd_emprestado);
        System.out.println("numero do DVD" +num_dvd);
        System.out.println("numero de emprestimo "+n_emprestimo);
    }
    
    
    

}
