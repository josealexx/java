package tarefamatriz;

import java.util.Random;

/**
 *
 * @author pc
 */
public class testando {

    
    public static void main(String[] args) {

        int[][] numerosAleatorio = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio[i].length; j++) {
                numerosAleatorio[i][j] = numeroRandom.nextInt(100);

            }
        }
        int diagonal_supprod = 0,diagonal_infprod  = 0;
        int maior = 0,linhamaior = 1,colunamaior = 1;
        int menor=10,linhamenor=10,colunamenor = 10;
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio[i].length; j++) {
                if (numerosAleatorio[i][j] > maior) {

                    maior = numerosAleatorio[i][j];
                    linhamaior= i;
                    colunamaior = j;
                }
                if (numerosAleatorio[i][j] < menor) {

                    menor = numerosAleatorio[i][j];
                    linhamenor= i;
                    colunamenor = j;
                }

            }
        }
        
         //produto da diagonal inferior
		loop1:
		for(int i = 0; i < numerosAleatorio.length; i++) {
			for(int j = 0; j < numerosAleatorio.length; j++) {
				if(i <= j) {
					continue loop1;										
				}
				diagonal_infprod *= numerosAleatorio[i][j];							
			}			
		}

//produto da diagonal superior
       	
                
                
        
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio[i].length; j++) {
                System.out.print(numerosAleatorio[i][j] +"  ");

            }
            System.out.println("");
        }

        System.out.println("o maior numero e: " +maior);
        System.out.print("esta na linha: "+linhamaior);
        System.out.println("e na coluna: " +colunamaior);
        
        System.out.println("o menor numero e: "+menor);
        System.out.print("esta na linha: "+linhamenor);
        System.out.println("e na coluna: " +colunamenor);
        
        System.out.println("Produto Diagonal Inferior: " + diagonal_infprod);
        System.out.println("Produto  da Diagonal superior: " + diagonal_supprod);

    }

}
