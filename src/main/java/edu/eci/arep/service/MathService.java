package edu.eci.arep.service;


/**
 * Interfaz para calcular maximo comun divisor y minimo comun multiplo
 * @author Julián Gutiérrez
 * @version 1.0
 */

public interface MathService {


    /**
     * Calcula el mcm y mcd de dos numeros
     * @param n1 primer numero
     * @param n2 segundo numero
     * @return retorna un arreglo de enteros de longitud 2 con el mcm y mcd correspondientemente
     */
    public int[] calcularMCMyMCD(int n1 , int n2);
    
}
