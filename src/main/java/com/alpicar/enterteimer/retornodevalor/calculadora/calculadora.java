/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alpicar.enterteimer.retornodevalor.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class calculadora {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n2: "));

        operaciones op = new operaciones();
        int suma = op.sumar(n1, n2);
        int resta = op.restar(suma, suma);
        int multiplicacion = op.multiplicar(suma, suma);
        int division = op.division(suma, suma);

        op.resultados(suma, resta, multiplicacion, division);
    }

}
