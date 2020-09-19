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
public class Produzir {
    int cod_produtora;
    int cod_filme;

    public Produzir(int cod_produtora, int cod_filme) {
        this.cod_produtora = cod_produtora;
        this.cod_filme = cod_filme;
    }
    void imprimirProduzir(){
        System.out.println("codigo da produtora: "+cod_produtora);
        System.out.println("codigo do filme: " +cod_filme);
    
    }
}
