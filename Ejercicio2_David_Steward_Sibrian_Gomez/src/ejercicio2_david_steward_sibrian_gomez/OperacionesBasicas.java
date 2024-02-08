package ejercicio2_david_steward_sibrian_gomez;

/**
 *
 * @author david
 */

import java.util.Scanner;

public class OperacionesBasicas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Escriba el segundo numero: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

        scanner.close();
    }
}