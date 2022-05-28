/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.ejemploreto1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 * @version 1.0
 */
public class Newmain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Digite la cantidad de productos:");//Imprimir pantalla - print()
        int cantidad;
        Scanner teclado = new Scanner(System.in);
        cantidad = teclado.nextInt();
        int electronica;
        int muebles;
        int ropa;
        String camion;

        electronica = cantidad;
        muebles = (cantidad * 2) + 4;
        ropa = suma(electronica, muebles) / 5;

        if (cantidad > 0 && cantidad <= 20) {
            camion = "uno";
        } else if (cantidad > 20 && cantidad <= 40) {
            camion = "dos";
        } else if (cantidad > 40 && cantidad <= 80) {
            camion = "tres";
        } else {
            camion = "cuatro";
        }

        System.out.println(electronica + " " + muebles + " " + ropa);
        System.out.println(camion);

    }
    
    public static int suma(int a, int b){
        int suma;
        suma=a+b;
        return suma;
    }

}
