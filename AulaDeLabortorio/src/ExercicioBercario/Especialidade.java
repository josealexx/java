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
public class Especialidade {
    int NOM;
    String descricao;

    public Especialidade(int NOM, String descricao) {
        this.NOM = NOM;
        this.descricao = descricao;
    }
    
    void imprimirEspicialidade(){
    
        System.out.println("Descrição: " +descricao);
        System.out.println("numero na ordem dos medicos: " +NOM);
    }
}
