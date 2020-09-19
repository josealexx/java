/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringOperações;

/**
 *
 * @author pc
 */
public class StringOperacoes {
    public static void main(String[] args){
        //formas de criar Strings
        String s1="Jose alexandre";
        String s2= s1+" dos Santos";
        String s3=new String("alexandre");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        //operações basicas
        
        int tamanho=s1.length();
        System.out.println("a palavra " +s1+ " tem " +tamanho+ "palavras");
        String texto = s1.toString();
        
        //Localização
        int ulposicao=s3.lastIndexOf("e");
        int posicao=s3.indexOf('a');
        System.out.println("aa primeira letra a esta na "
                + "posição numero" +posicao);
        System.out.println("a ultima letra e se encontra na "
                + "posição numero" +ulposicao);
        boolean vazia= s3.isEmpty();
        System.out.println("esta vazia? " +vazia);
        
        //comparação
    String x="JOSE";
    boolean comp=x.equals("jose");
        System.out.println(comp);

    boolean compa=x.equalsIgnoreCase("jose");
        System.out.println(compa);
       int c="amor".compareTo("bola");
       //vai retornar um valor menor que zero pk a palavra amor vem antes de bola
        System.out.println(c);
        String so="big olhe jose";
        boolean o=so.regionMatches(10, "jose", 0, 15);
        System.out.println(o);
        //extração
        
        String l=" angola e linda";
        String l1=l.substring(10);
        String l2=l.substring(1, 10);
        System.out.println(l);
        System.out.println(l1);
        String l3=l.replace('a', 'A');
        
        System.out.println(l2);
        System.out.println(l3);
        
        
        
        
            
            
            }}
