package ejercicio1_david_steward_sibrian_gomez;

/**
 *
 * @author david
 */

import java.util.Scanner;

public class ImprimirPalabra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palabra;
        int numero;

        System.out.print("Escriba una palabra: ");
        palabra = scanner.next();

        System.out.print("Escriba un número: ");
        numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(palabra);
        }
    }
}
