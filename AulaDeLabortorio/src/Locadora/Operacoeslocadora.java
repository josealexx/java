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
public class Operacoeslocadora {
    public static void main(String[] args){
        Cliente cl1 = new Cliente("Leticia", " Sequeira", "Angola", "Kwanza norte", "viana", "Sanzala", "Sanzala", "Quinhentas casas", 2323, 2323, 2222);
        Cliente cl2 = new Cliente("Leti", "Leticia ", "Angola", "Kwanza norte", "viana", "Sanzala", "Sanzala", "Quinhentas casas", 2323, 2323, 2222);
        
        //Actor(String nome_real, String nome_artistico, int data, String nacionalidade) 
        Actor actor1=new Actor("Vin diesel", "DOMINIC", 1980/02/05, "America");
        Actor actor2=new Actor("Jose", "Jackie", 1980/02/05, "canada");
           // public Contacto(int telefone, int ID_CLIENTE)
        Contacto cont1=new Contacto(923306380,2323);
        Contacto cont2=new Contacto(923306380,12121);
        
        Produtora prod1=new Produtora("Vingadores",12345);
        Produtora prod2=new Produtora("Taken",11110);        
      //                         FilmeCategoria(int cod_categoria, int filme_categoria)
        FilmeCategoria filcat1= new FilmeCategoria(11111, 22222);
        FilmeCategoria filcat2= new FilmeCategoria(12131, 212222);
        
        NacionalidadeActor nacli1=new NacionalidadeActor("canada", 55555);
        NacionalidadeActor nacli2=new NacionalidadeActor("mexico", 44444);
        
    //    Filme(int id_filme, String titulo, int ano_lancamento, String produtora, String categoria, int ID_DVD, String actores)
            Filme filme1=new Filme(666666, "vingadores", 2018, "Marvel", "Acção", 9999, "Nicolas cage");
            Filme filme2=new Filme(666666, "50 tons de cinzas", 2018, "Marvel", "Acção", 9999, "Nicolas cage");
        
  //      Produzir(int cod_produtora, int cod_filme)
        Produzir produzir=new Produzir(12345, 22222);
        Produzir produzir1=new Produzir(212222, 11110);
          //                       FilmeActor(22222, int cod_actor)
        FilmeActor filactor1=new FilmeActor(22222,32222);
        FilmeActor filactor2=new FilmeActor(11111,2222);       
        
        
//        Emprestimo(String nome, int num_associado, int qtd_dvd_emprestado, int num_dvd, int n_emprestimo)
        Emprestimo empr1=new Emprestimo("José Alexandre",010101,123,1,3333);                                                      
        Emprestimo empr2=new Emprestimo("Hugo dos Santos",011100,124,3,444);                                                      
        System.out.println("\n");
        cl1.imprimirCliente();
        cl1.imprimirCliente();    
        
        System.out.println("\n");
        
        nacli1.imprimirNacionalidadeActor();
        nacli2.imprimirNacionalidadeActor();
        
        filme1.imprimirFilme();
        filme2.imprimirFilme();
        System.out.println("\n");
        produzir.imprimirProduzir();
        produzir1.imprimirProduzir();
        
        System.out.println("\n");
        prod1.imprimirProdutora();
        prod1.imprimirProdutora();
        
        empr1.imprimirEmprestimo();
        empr2.imprimirEmprestimo();
        
        cont1.imprimirContacto();
        cont2.imprimirContacto();
        
    
    }
    
}
