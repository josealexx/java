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
public class Opercoes {

    public static void main(String[] args){
        
    Pessoa p1=new Pessoa();
    Pessoa p2=new Pessoa("Esperança ","femenino", "1999-05-07","casada");
    p1.imprimir();
    p2.imprimir();
    
    
    Estudante e1=new Estudante();
    Estudante e2=new Estudante(12,"psicologia","diurno", "1º ano", "Maria Meury","femenino","1990-05-07","solteira");
    e1.imprimir();
    e2.imprimir();
    
   Professor prof1=new Professor(6060606, "doutor", "Angolano", "matematico", "filipe lomingou", "masculino", "1990-08-09", "casado");
    Professor prof2=new Professor();
    prof1.imprimir();
    prof2.imprimir();
    }

    
}
