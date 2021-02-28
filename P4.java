package com.mycompany.arrays;
//Jhonaatan Vanegas rueda
    //28/02/2021
import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para crear las filas");
        int row = leer.nextInt();
        System.out.println("Ingrese un numero para crear las columna");
        int column = leer.nextInt();
        double[][] Matrix = new double[row][column];
        for (int i = 0; i < Matrix.length; i++) {

            for (int j = 0; j < Matrix.length; j++) {
                System.out.println("Dame un numero ");
                Matrix[i][j] = leer.nextDouble();

            }

        }
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                System.out.print(Matrix[i][j]);

            }

        }

    }

}
