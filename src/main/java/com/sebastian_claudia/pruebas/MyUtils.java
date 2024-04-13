/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebastian_claudia.pruebas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Sebastian
 * @author Claudia Durán
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        if (cadena != null) {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultat += cadena.charAt(i) + "";
            }
            return resultat;
        }else{
            return null;
        }
        
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) throws Exception {
        int resultat = 0;
        try{
            resultat = Period.between(LocalDate.of(year, month, day), LocalDate.now()).getYears();
            if(resultat >=0 && resultat<=150){
                //si la edad es válida la devolvemos
                return resultat;
            }else{
                //Si no está entre ese rango de edades devuelve -1
                return -1;
            }
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
            //Y si de por si es imposible crear esa fecha devuelve -2
            //ej 1999-13-35
            return -2;
        }
        
    }
    
    

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else if(numero<0){
            return -1;
        }else{
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
    public static void saludar(){
        System.out.println("Bienvenido a mi programa");
    }

}
