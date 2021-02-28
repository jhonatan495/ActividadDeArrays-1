package com.mycompany.arrays;

import java.util.Scanner;

public class P1 {
//Jhonaatan Vanegas rueda
    //28/02/2021
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud del Vector");
        int cant = leer.nextInt();
        int suma = 0, NumeroMayor = 0, NumeroMenor = 0;
        int[] Array1 = new int[cant];

        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Dame un numero");
            Array1[i] = leer.nextInt();
        }

        for (int i = 0; i < Array1.length; i++) {
            suma += Array1[i];
        }
        int promedio = suma / Array1.length;

        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] > NumeroMayor) {
                NumeroMayor = Array1[i];
            }
        }
        NumeroMenor = Array1[0];
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] < NumeroMenor) {
                NumeroMenor = Array1[i];
            }
        }

        String Suma = String.valueOf(suma);
        String Promedio = String.valueOf(promedio);
        String numeroMayor = String.valueOf(NumeroMayor);
        String numeroMenor = String.valueOf(NumeroMenor);

        String msg = "La suma del vector es: " + Suma + ", El promedio es: " + Promedio + ", El numero mayor es: " + numeroMayor + ",El numero menor es: " + numeroMenor;
       
                
        String[] parts = msg.split(",");
        for(String palabra: parts){
        
            System.out.println(palabra);
        }
    }

   

}
