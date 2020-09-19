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
public class NacionalidadeActor {
    String pais;
    int id_actor;

    public NacionalidadeActor(String pais, int id_actor) {
        this.pais = pais;
        this.id_actor = id_actor;
    }
    
    void imprimirNacionalidadeActor(){
        System.out.println("Nome do pais: "+pais);
        System.out.println("numero na ordem: " +id_actor);
    }
    
}

    

