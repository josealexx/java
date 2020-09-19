/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladelabortorio;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ClassificaçãoComSwitch {
    
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota no intervalo 1 a 20");
        int nota =sc.nextInt();
        
        
         switch (nota){
            case 1:
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: System.out.println("Péssimo");break;
            case 9: 
            case 10: 
            case 11: 
            case 13: System.out.println("Médio");break;
            case 14: 
            case 15: 
            case 16:
            case 17: 
            case 18: 
            case 19: 
            case 20: System.out.println("Excelente");break;
            
            default: System.out.println("Nota invalida");
     
        }
        
        
    }
    
}
