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
public class Produtora {
String Filme_produzido; 
int cod_produtora;

    public Produtora(String Filme_produzido, int cod_produtora) {
        this.Filme_produzido = Filme_produzido;
        this.cod_produtora = cod_produtora;
    }



void imprimirProdutora(){
    System.out.println("Filmes produzidos:"+Filme_produzido);
    System.out.println("codigo da produtora: "+cod_produtora);
}
}

