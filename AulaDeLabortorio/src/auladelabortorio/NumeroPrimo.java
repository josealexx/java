

package auladelabortorio;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class NumeroPrimo {

public static void main(String[] args){

    int div, n, i, soma=1;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("digite o numero");
    n=sc.nextInt();
    for(i=0;i<=n;i++){
        div=0;
        for(int j=1;j<=n;j++){
        if(i%j==0){
        div++;  
        }
        }
        if(div==2){
            soma=soma+i;
            System.out.println(i);
        }
    }
    
    System.out.println("A soma dos numero e " +soma);

}   
}
