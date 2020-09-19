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
public class Cliente {
    String nome_cliente;
    String sobrenome;
    String pais,provincia,municipio, distrito, bairro, rua;
    int num_casa;
    int num_associado;
    int id_dvd;

    public Cliente(String nome_cliente, String sobrenome, String pais, String provincia, String municipio, String distrito, String bairro, String rua, int num_casa, int num_associado, int id_dvd) {
        this.nome_cliente = nome_cliente;
        this.sobrenome = sobrenome;
        this.pais = pais;
        this.provincia = provincia;
        this.municipio = municipio;
        this.distrito = distrito;
        this.bairro = bairro;
        this.rua = rua;
        this.num_casa = num_casa;
        this.num_associado = num_associado;
        this.id_dvd = id_dvd;
    }
    
    void imprimirCliente(){
        System.out.println("Dados cliente ");
        
        System.out.println("Nome do cliente: " +nome_cliente);
        System.out.println("Sobrenome do cliente: " +sobrenome);
        System.out.println("País:" +pais);
        System.out.println("Provincia: " +provincia);
        System.out.println("Municipio: "+municipio);
        System.out.println("Distrito: " +distrito);
        System.out.println("Bairro: "+bairro);
        System.out.println("Rua: "+rua);
        System.out.println("numero da casa: " +num_casa);
        System.out.println("Numero Associado: "+num_associado);
        System.out.println("ID_DVD: " +id_dvd);
    
    }
    
    
}
