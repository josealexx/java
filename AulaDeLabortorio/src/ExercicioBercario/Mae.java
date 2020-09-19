/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioBercario;

/**
 *
 * @author pc
 */
public class Mae {
int id_mae;
int idade;
String nome;
String provincia;
String municipio;
String distrito;
String rua;
int n_casa;

    public Mae(int id_mae, int idade, String nome, String provincia, String municipio, String distrito, String rua, int n_casa) {
        this.id_mae = id_mae;
        this.idade = idade;
        this.nome = nome;
        this.provincia = provincia;
        this.municipio = municipio;
        this.distrito = distrito;
        this.rua = rua;
        this.n_casa = n_casa;
    }

void imprimirMae(){

    System.out.println("Nome: " +nome);
    System.out.println("Idade: " +idade);
    System.out.println("ID MÃE: " +id_mae);
    System.out.println("Provincia: " +provincia);
    System.out.println("Municipio: " +municipio);
    System.out.println("Distrito: " +distrito);
    System.out.println("Rua: " +rua);
    System.out.println("Numero da casa: " +n_casa);
    
    
}
        
        
        }
