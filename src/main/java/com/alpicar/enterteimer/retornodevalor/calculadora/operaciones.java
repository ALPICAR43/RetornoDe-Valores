/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alpicar.enterteimer.retornodevalor.calculadora;

/**
 *
 * @author Oscar
 */
public class operaciones {

    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public int multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public int division(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }

    public void resultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }

}
