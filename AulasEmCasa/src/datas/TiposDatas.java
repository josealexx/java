/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datas;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author pc
 */
public class TiposDatas {
    public static void main(String[] args){
    Date agora =new Date();
    //System.out.println(agora);
    Calendar c =Calendar.getInstance();
    c.set(2020,Calendar.AUGUST, 3);
    ///System.out.println(c.getTime());

    java.text.SimpleDateFormat formatador = new java.text.SimpleDateFormat("yyyy-MM-dd");
    String agora_f = formatador.format(agora);
    String data_f = formatador.format(c.getTime());
    
        System.out.println("agora formatado: "+agora_f);
        System.out.println("data formatada: "+data_f);
        /*
        System.out.println("ano: "+agora_f.substring(0,4));
        System.out.println("Mes: "+agora_f.substring(5,7));
        System.out.println("Dia: "+agora_f.substring(8,10));
        
        System.out.println("ano: "+data_f.substring(0,4));
        System.out.println("Mes: "+data_f.substring(5,7));
        System.out.println("Dia: "+data_f.substring(8,10)); */

        int n_day = Integer.parseInt(agora_f.substring(0,4));
        int n_month = Integer.parseInt(agora_f.substring(5,7));
        int n_year = Integer.parseInt(agora_f.substring(8,10));
        
        int d_day = Integer.parseInt(data_f.substring(0,4));
        int d_month = Integer.parseInt(data_f.substring(5,7));
        int d_year = Integer.parseInt(data_f.substring(8,10));
        
        if(n_year <= d_year){
            System.out.println("1");
            if(d_year == n_year){
                System.out.println("2");
                if(n_month <= d_month){
                    System.out.println("3");
                    if(n_month == d_month){
                        System.out.println("4");
                        if(n_day <= d_day){
                            System.out.println("5");
                        }else{
                            System.out.println("Prazo expirado");
                        }
                    }else{
                            System.out.println("Prazo expirado");
                        }
                }else{
                            System.out.println("Prazo expirado");
                        }
            }
            
        }else{
            System.out.println("prazo esgotado");
        }

        
}
}