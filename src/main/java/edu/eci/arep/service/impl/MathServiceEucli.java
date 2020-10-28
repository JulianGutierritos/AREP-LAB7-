package edu.eci.arep.service.impl;

import edu.eci.arep.service.MathService;

/**
 * Clase que calcula el minimo comun multiplo y maximo comun divisor de dos numeros
 * @author Julián Gutiérrez
 * @version 1.0
 */

public class MathServiceEucli implements MathService{

    
    /**
     * Calcula el mcm y mcd de dos numeros
     * @param n1 primer numero
     * @param n2 segundo numero
     * @return retorna un arreglo de enteros de longitud 2 con el mcm y mcd correspondientemente
     */
    public int[] calcularMCMyMCD(int n1 , int n2){
        int mcd = this.euclides(n1,n2);
        int mcm = (n1 * n2)/ mcd; 
        int [] resp = {mcm, mcd }; 
        return resp;
    }

    /**
     * Implementacion del algoritmo de euclides para calcular el mcd 
     * @param n1 primer numero
     * @param n2 segundo numero
     * @return int con el mcd utilizando el algoritmo de euclides
     */
    public int euclides(int n1, int n2){
        if (n1 < n2){
            int tmp = n2; 
            n2 = n1; 
            n1 = tmp;
        }
        int resi = n1 % n2; 
        if (resi == 0){
            return n2;
        }
        else{
            return this.euclides(n2, resi);
        }
    }
    


    
}
