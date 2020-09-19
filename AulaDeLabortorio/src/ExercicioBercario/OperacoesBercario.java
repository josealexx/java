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
public class OperacoesBercario {
    public static void main(String[] args){
    Mae mae1=new Mae(12456, 25,"Paula", "Luanda", "Cazenga", "Cazenga", "H", 145);    
    Mae mae2=new Mae(121212, 25,"Amelia", "Luanda", "Cazenga", "Cazenga", "H", 145);
   
    Medico med1=new Medico("Azevedo", 989898);
    Medico med2=new Medico("Alberto", 787878);
    Medico med3=new Medico("Edgar", 5656565);
    
    Especialidade especi=new Especialidade(989898, "genecologista");
    Especialidade especi1=new Especialidade(787878, "Medico Obstetrico");
    
    Nacionalidade nacio1=new Nacionalidade( "Portugues", 989898);
    Nacionalidade nacio2=new Nacionalidade( "Angolano", 787878);
    Nacionalidade nacio3=new Nacionalidade( "cubano", 5656565);
    
    Bebe bebe1 = new Bebe("Alcides", 123321123, 12/12/2019, 1, 5, "masculino", 12456, 989898);
    Bebe bebe2 = new Bebe("Cecilia", 123321123, 12/12/2019, 1, 5, "masculino", 121212, 787878);
    Bebe bebe3 = new Bebe("Dilson", 123321123, 12/12/2019, 1, 5, "masculino", 12456, 989898);
    Bebe bebe4 = new Bebe("José", 123321123, 12/12/2019, 1, 5, "masculino", 121212, 787878);
    Bebe bebe5 = new Bebe("Silvia", 123321123, 12/12/2019, 1, 5, "masculino", 121212, 787878);
    
    System.out.println("\t mae \n");
    mae1.imprimirMae();
    mae2.imprimirMae();
    System.out.println("\t bebe \n");
    bebe1.imprimirBebe();
    bebe2.imprimirBebe();
    bebe3.imprimirBebe();
    bebe4.imprimirBebe();
    bebe5.imprimirBebe();
    System.out.println("\t medico \n");
    med1.imprimirMedico();
    med2.imprimirMedico();
    med3.imprimirMedico();
    System.out.println(" \t especialidade \n");
    especi.imprimirEspicialidade();
    especi1.imprimirEspicialidade();
    System.out.println("\t Nacionalidade \n");
    nacio1.imprimir();
    nacio2.imprimir();
    nacio3.imprimir();
    }
}
