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
public class Medico {
    String nome;
    int NOM;

    public Medico(String nome, int NOM) {
        this.nome = nome;
        this.NOM = NOM;
    }

void imprimirMedico(){
    System.out.println("Nome do medico: " +nome);
    System.out.println("numero na ordem: "+NOM);

}
    
    
    
    
}

