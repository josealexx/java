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
public class Categoria {
    int cod_categoria;
    String descricao;

    public Categoria(int cod_categoria, String descricao) {
        this.cod_categoria = cod_categoria;
        this.descricao = descricao;
    }
    void imprimirCategoria(){
        System.out.println("descrição: "+descricao);
        System.out.println("codigo da categoria: "+cod_categoria);
    }
}
