package ejercicio3_david_steward_sibrian_gomez;

/**
 *
 * @author david
 */

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba el primer numero: ");
        byte numero1 = (byte) scanner.nextDouble();

        System.out.print("Escriba el segundo numero: ");
        byte numero2 = (byte) scanner.nextDouble();

        System.out.print("Escriba el tercer numero: ");
        byte numero3 = (byte) scanner.nextDouble();

        byte mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println("El mayor numero que fue ingresado es: " + mayor);

        scanner.close();
    }
}