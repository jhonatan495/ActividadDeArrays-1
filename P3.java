package com.mycompany.arrays;

import java.util.Scanner;

public class P3 {
//Jhonatan Vanegas Rueda
    //27/02/2021

    static final int i = 1;
    static final int j = 1;
    static final int k = 1;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int totalP1 = 0, totalP2 = 0, totalP3 = 0;
        double resultado = ProductoCruz();

       // System.out.println("el total de i " + totalP1 + " el total de j " + totalP2 + " el total de k " + totalP3);
        System.out.println("el resultado de la op es: " + resultado);
    }

    static double ProductoCruz() {
        Scanner leer = new Scanner(System.in);
        int[] Array1 = new int[3];
        int[] Array2 = new int[3];
        int[][] Matriz = new int[2][3];
        int totalP1 = 0, totalP2 = 0, totalP3 = 0;
        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Dame un numero para vector 1");
            Array1[i] = leer.nextInt();
        }
        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Dame un numero para vector 2");
            Array2[i] = leer.nextInt();
        }

        for (int j = 0; j < Matriz.length + 1; j++) {
           
            Matriz[0][j] = Array1[j];
            Matriz[1][j] = Array2[j];
        }
        int resultado = 0;

        totalP1 = (i * Matriz[0][1] * Matriz[1][2]) - (Matriz[0][2] * Matriz[1][1]);
        totalP2 = (i * Matriz[0][0] * Matriz[1][2]) - (Matriz[1][0] * Matriz[0][2]);
        totalP3 = (i * Matriz[0][0] * Matriz[1][1]) - (Matriz[1][0] * Matriz[0][1]);
        resultado = totalP1 - totalP2 + totalP3;

        return resultado;
    }

}
