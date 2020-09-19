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
public class Bebe {
    String nome;
    int id_bb;
    int data;
    int altura;
    float peso;
    String genero;
    int id_mae;
    int NOM;

    public Bebe(String nome, int id_bb, int data, int altura, float peso, String genero, int id_mae, int NOM) {
        this.nome = nome;
        this.id_bb = id_bb;
        this.data = data;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.id_mae = id_mae;
        this.NOM = NOM;
    }
    
    void imprimirBebe(){
        System.out.println("Nome do bebê:" +nome);
        System.out.println("data de nascimento:" +data);
        System.out.println("Peso: " +peso);
        System.out.println("Genero: " +genero);
        System.out.println("ID Mãe: " +id_mae);
        System.out.println("Numero na ordem dos medicos" +NOM);
    }
}
