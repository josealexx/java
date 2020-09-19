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
public class Contacto {
int telefone;
int ID_CLIENTE;

    public Contacto(int telefone, int ID_CLIENTE) {
        this.telefone = telefone;
        this.ID_CLIENTE = ID_CLIENTE;
    }

void imprimirContacto(){
    System.out.println("telefone:"+telefone);
    System.out.println("ID do cliente:"+ID_CLIENTE);

}


    
}
