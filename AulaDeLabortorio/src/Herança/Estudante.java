/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança;

/**
 *
 * @author pc
 */
public class Estudante extends Pessoa{
    int matricula;
    String curso;
    String turno;
    String classe;

    public Estudante(int matricula, String curso, String turno, String classe, String nome, String genero, String data_nasc, String estado_civil) {
        super(nome, genero, data_nasc, estado_civil);
        this.matricula = matricula;
        this.curso = curso;
        this.turno = turno;
        this.classe = classe;
    }

    
     public Estudante(){
         
         this.nome = "Ricardo";
        this.genero = "Masculino";
        this.data_nasc = "1994-04-06";
        this.estado_civil = "Solteiro";
        this.matricula = 1231;
        this.curso = "informatica";
        this.turno = "diurno";
        this.classe = "decima";
    
     
     }

     
    public void imprimir() {
        System.out.println("Estudante");
        super.imprimir();
        System.out.println("\n matricula = " + matricula + "\n curso=" + curso + "\n turno = " + turno + "\n classe = " + classe );
    }
    
    
}
