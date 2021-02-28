package com.mycompany.arrays;

import java.util.Scanner;
//Jhonaatan Vanegas rueda
    //28/02/2021
public class P2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cant = 0, cant2;
        System.out.println("Ingrese cuanto quiere que sea la longitud de los dos Vectores");
        cant = leer.nextInt();
        cant2 = cant;
        if (cant == cant2) {
            int[] Array1 = new int[cant];
            int[] Array2 = new int[cant2];
            for (int i = 0; i < Array1.length; i++) {
                System.out.println("dame un numero para vector " + (i + 1));
                Array1[i] = leer.nextInt();
            }
            for (int i = 0; i < Array2.length; i++) {
                System.out.println("dame un numero para vector " + (i + 1));
                Array2[i] = leer.nextInt();
            }
            int multiplicacion = 0;
            for (int i = 0; i < Array1.length; i++) {
                int j = 0;
                multiplicacion = Array1[i] * Array2[j];

                System.out.println("La multiplicacion entre" + Array1[i] + "*" + Array2[j]);
                System.out.println(" es: " + multiplicacion + "\n ");
                j++;
            }

        } else {
            System.out.println("Los Arrays NO son iguales");
        }

    }

}
