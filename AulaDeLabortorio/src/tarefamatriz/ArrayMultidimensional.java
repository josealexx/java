/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefamatriz;

/**
 *
 * @author pc
 */import javax.swing.*;
import java.util.Random;
public class ArrayMultidimensional {
	    public static void main (String Args[])
	    {
	     int mat[][]=new int[7][7],a,b,t=0;
	      int soma=0;
	      String flag="",saida="";
	      JTextArea saidat=new JTextArea();
		Random r=new Random(); 
	        for(a=0;a<7;a++)
	        {
	            for(b=0;b<7;b++)
	            {
	                mat[a][b]=r.nextInt(100);
	                saida+=mat[a][b]+"\t";
	            }
	                saida+="\n";
	        }
	            for(a=0;a<7;a++)
	            {
	                for(b=0;b<=t;b++)
	                {
	                    soma+=mat[a][b];
	                }
	                t++;
	            }
	            saida+="\n A soma dos elementos abaixo e da diagonal principal é: "	            +soma;
	            saida+="\n A média é: "+(soma/15);
	            saidat.setText(saida);
	            JOptionPane.showMessageDialog(null,saidat,"Matriz 7 x 7",JOptionPane.PLAIN_MESSAGE);
	            soma=t=0;
	            saida="";
	            System.exit(0);
	    }
	}

