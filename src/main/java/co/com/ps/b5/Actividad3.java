package co.com.ps.b5;

import java.util.Scanner;


public class Actividad3 {

    //Números Positivos - Negativos - Cero
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Número");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("El número es neutro");
        } else if (num < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }


//Calcular los primeros números pares entre 1 y el número que ingresa el usuario

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese un Número");
        int numero = scanner1.nextInt();

        int i = 1;
        while (i <= numero) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}


