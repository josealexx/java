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
public class Contacto {
    int telefone;
    int id_mae;

    public Contacto(int telefone, int id_mae) {
        this.telefone = telefone;
        this.id_mae = id_mae;
    }
    
    void imprimirContacto(){
        System.out.println("Telefone: "+telefone);
        System.out.println("ID Mãe: "+id_mae);
    }
        
}
