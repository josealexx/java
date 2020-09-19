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
public class Filme {
int id_filme;
String titulo;
int ano_lancamento;
String produtora;
String categoria;
int ID_DVD;
String actores;

    public Filme(int id_filme, String titulo, int ano_lancamento, String produtora, String categoria, int ID_DVD, String actores) {
        this.id_filme = id_filme;
        this.titulo = titulo;
        this.ano_lancamento = ano_lancamento;
        this.produtora = produtora;
        this.categoria = categoria;
        this.ID_DVD = ID_DVD;
        this.actores = actores;
    }
    
    void imprimirFilme(){
        System.out.println("id_filme: "+id_filme);
        System.out.println("titulo: "+titulo);
        System.out.println("ano de lançamento: "+ano_lancamento);
        System.out.println("produtora:"+ produtora);
        System.out.println("categoria:" +categoria);
        System.out.println("ID_DVD:" +ID_DVD);
        System.out.println("actores:" +actores);
    
    }
    
            



}
