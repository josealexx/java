/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasemcasa;

/**
 *
 * @author pc
 */
 
import java.util.Scanner;
 
public class  DiferencaEmSegundos{
 
    public static void main(String[] args) {
        int h1,h2, m1, m2, s1, s2, total1, total2, difSeg1=0, difSeg2=0;
 
        System.out.println("Por favor entre com uma hora válida(Formato 24h)");
        h1 = new Scanner(System.in).nextInt();
 
        while (h1 < 0 || h1 > 23) {
            System.out.println("Hora invalida, favor informar um horário válido(Formato 24h)");
            h1 = new Scanner(System.in).nextInt();
        }
 
        System.out.println("Por favor entre com os minutos");
        m1 = new Scanner(System.in).nextInt();
 
        while (m1 < 0 || m1 > 59) {
            System.out.println("Minutos inválidos,favor informar minutos válidos");
            m1 = new Scanner(System.in).nextInt();
        }
        System.out.println("Por favor entre com os segundos");
        s1 = new Scanner(System.in).nextInt();
 
        while (s1 < 0 || s1 > 59) {
            System.out.println("Segundos inválidos,favor informar segundos válidos");
            s1 = new Scanner(System.in).nextInt();
        }
 
        System.out.println("A hora informada foi: "+h1+":"+m1+":"+s1);
        System.out.println("\n");
        System.out.println("Agora entre como novos dados de data e hora para que");
        System.out.println("possamos verificar a diferença desses dois horários em segundos.");
        System.out.println("\n");
 
        System.out.println("Por favor entre com uma hora válida(Formato 24h)");
        h2 = new Scanner(System.in).nextInt();
 
        while (h2 < 0 || h2 > 23) {
            System.out.println("Hora invalida, favor informar um horário válido(Formato 24h)");
            h2 = new Scanner(System.in).nextInt();
        }
 
        System.out.println("Por favor entre com os minutos");
        m2 = new Scanner(System.in).nextInt();
 
        while (m2 < 0 || m2 > 59) {
            System.out.println("Minutos inválidos,favor informar minutos válidos");
            m2 = new Scanner(System.in).nextInt();
        }
        System.out.println("Por favor entre com os segundos");
        s2 = new Scanner(System.in).nextInt();
 
        while (s2 < 0 || s2 > 59) {
            System.out.println("Segundos inválidos,favor informar segundos válidos");
            s2 = new Scanner(System.in).nextInt();
        }
        System.out.println("A hora informada foi: "+h2+":"+m2+":"+s2);
        System.out.println("\n");
 
        total1 = 0;
        total1 = total1 + h1 * 360 + m1 * 60 + s1;
 
        total2 = 0;
        total2 = total2 + h2 * 360 + m2 * 60 + s2;
 
        if(h1>h2)
        {
            difSeg2 = total1 - total2;
            System.out.println("O maior horário informado foi o segundo \n");
            System.out.println("A diferença entre os dois é: "+difSeg2+" segundos");
        }
        else
        {
            difSeg1 = total2 - total1;
            System.out.println("O maior horário informado foi o segundo \n");
            System.out.println("A diferença entre os dois é: "+difSeg1+" segundos");
        }
    }
}
