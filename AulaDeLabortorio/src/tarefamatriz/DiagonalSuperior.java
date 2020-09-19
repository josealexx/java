package tarefamatriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class DiagonalSuperior {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para n: ");
        int n = scanner.nextInt();
        Criar_matriz v = new Criar_matriz();

        v.criaMatriz(n);
        v.mostrar_matriz();
        v.maior();
        v.menor();
        v.somadoselementos();
         v.soma_diagonal_superior();
        v.produto_diagonal_superior();
        v.produto_diagonal_inferior();
        v.produto_da_linha();
       // v.vetormax(n);
    //    v.ordenarMatriz();
    }
}

class Criar_matriz {

    int[][] numerosAleatorio;

    public void criaMatriz(int n) {    
        int[][] arraymult = new int[n][n];

        Random numeroRandom = new Random();

        for (int i = 0; i < arraymult.length; i++) {
            for (int j = 0; j < arraymult[i].length; j++) {
                arraymult[i][j] = numeroRandom.nextInt(100);

            }
        }
        numerosAleatorio = arraymult;
    }

    public void mostrar_matriz() {
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio[i].length; j++) {
                System.out.print(numerosAleatorio[i][j] + "  ");

            }
            System.out.println("  ");
        }
    }

    public void soma_diagonal_superior() {
        int diagonalPrincipal = 0;
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio.length; j++) {
                if (i == j) {
                    diagonalPrincipal += numerosAleatorio[i][j];
                }
            }
        }
        System.out.println("\nSoma da Diagonal Principal = " + diagonalPrincipal);
    }

    public void maior() {
        int maior = 0, linhamaior = 1, colunamaior = 1;
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio[i].length; j++) {
                if (numerosAleatorio[i][j] > maior) {

                    maior = numerosAleatorio[i][j];
                    linhamaior = i;
                    colunamaior = j;
                }

            }
        }

        System.out.println("\n o maior numero e: " + maior);
        System.out.println("esta na linha: " + linhamaior);
        System.out.println(" e na coluna: " + colunamaior);

    }

    
    public void somadoselementos() {

        int soma = 0;
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio[i].length; j++) {

                soma=soma+ numerosAleatorio[i][j];

            }
        }
        
        System.out.println("A soma dos elementos da matriz é: "+soma);

    }
    
    public void menor() {

        int menor = 10, linhamenor = 10, colunamenor = 10;
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio[i].length; j++) {

                if (numerosAleatorio[i][j] < menor) {

                    menor = numerosAleatorio[i][j];
                    linhamenor = i;
                    colunamenor = j;
                }

            }
        }
        System.out.println("o menor numero e: " + menor);
        System.out.println("esta na linha: " + linhamenor);
        System.out.println(" e na coluna: " + colunamenor);

    }
    

    
    

    public void produto_diagonal_superior() {
        int diagonal_supprod = 1;
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio.length; j++) {
                if (i >= j) {
                    continue;
                }
                diagonal_supprod *= numerosAleatorio[i][j];
            }
        }
        System.out.println("Produto  da Diagonal superior: " + diagonal_supprod);
    }
    
    
    public void produto_da_linha() {
        int vezes=0;
        for (int i = 0; i < numerosAleatorio.length; i++) {
int produto=1;
            for (int j = 0; j < numerosAleatorio[i].length; j++) {
            produto*=numerosAleatorio[i][j];
            }
            System.out.println("produto da linha "+vezes+" é: "+produto);
            vezes++;
        }
    }
    
/*
    public void vetormax(int v) {
        int vezes = 0, x = 0;
        int[] vetormax = new int[v];
        int maior = 0;
        for (int i = 0; i < numerosAleatorio.length; i++) {
           // int produto = 1;
            for (int j = 0; j < numerosAleatorio[i].length; j++) {
                //produto*=numerosAleatorio[i][j];
                if (numerosAleatorio[i][j] > maior) {
                    vetormax[x] = numerosAleatorio[i][j];
                    /*    maior = numerosAleatorio[i][j];
                    linhamaior = i;
                    colunamaior = j;

                    x++;
                }
for(int m=0;m<x;m++){
    System.out.println("o maior elemento de cada linha "+vetormax[m]);
}
            }
        }
    }
                     */



    public void produto_diagonal_inferior() {
        int diagonal_infprod = 1;
        loop1:
        for (int i = 0; i < numerosAleatorio.length; i++) {
            for (int j = 0; j < numerosAleatorio.length; j++) {
                if (i <= j) {
                    continue loop1;
                }
                diagonal_infprod *= numerosAleatorio[i][j];
            }
        }
        System.out.println("Produto da Diagonal inferior: " + diagonal_infprod);
    }
    
    
}