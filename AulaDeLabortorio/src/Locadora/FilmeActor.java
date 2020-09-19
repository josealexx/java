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
public class FilmeActor {
    int cod_filme;
    int cod_actor;

    public FilmeActor(int cod_filme, int cod_actor) {
        this.cod_filme = cod_filme;
        this.cod_actor = cod_actor;
    }
    void imprimirFilmeActor(){
        System.out.println("codigo do filme: "+cod_filme);
        System.out.println("codigo do actor: "+cod_actor);
    
    }
         
    
    
}
