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
public class Nacionalidade {
    String decricao;
    int NOM;

    public Nacionalidade(String decricao, int NOM) {
        this.decricao = decricao;
        this.NOM = NOM;
    }
    
    void imprimir(){
        System.out.println("Descrição: "+decricao);
        System.out.println("numero na ordem: " +NOM);
    }
    
}
