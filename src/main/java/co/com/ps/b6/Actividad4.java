package co.com.ps.b6;

import java.util.Scanner;
import java.util.Random;

//Adivina el número
//Deben preguntar al usuario números del 1 al 100 con 10 intentos


public class Actividad4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = (int)(Math.random() * 100 + 1); //Número aleatorio

        int numeroSolicitadoUsuario;

        int numeroIntentos = 10;

        System.out.println("Tienes 10 Intentos para adivinar el número aleatorio entre 1 y 100: ");


        do {
            System.out.println("número intentos: " + numeroIntentos);
            System.out.print("Introduce el número a adivinar: ");
            numeroSolicitadoUsuario = sc.nextInt();

            if (numeroSolicitadoUsuario > numeroAleatorio) {
                System.out.println("El número que buscas es menor, te quedan " + (numeroIntentos-1) + " intentos: ");

                } else if (numeroSolicitadoUsuario < numeroAleatorio){
                    System.out.println("El número que buscas es mayor, te quedan " + (numeroIntentos-1) + " intentos: ");

            } else {
                System.out.print("¡Bien! "+ numeroAleatorio + " era el número que estabas adivinando, has necesitado " + (10 - (numeroIntentos-1)) +" intentos.");
            }
            numeroIntentos--;

        } while (numeroSolicitadoUsuario != numeroAleatorio && numeroIntentos > 0);
            if (numeroIntentos == 0) {
                System.out.println("Has perdido. El número aleatorio era " + numeroAleatorio);

        }

    }
}
