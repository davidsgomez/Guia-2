package ejercicio4_david_steward_sibrian_gomez;

/**
 *
 * @author david
 */

import java.util.Scanner;

public class AreaPerimetro {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba la longitud del rectangulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Escriba la anchura del rectangulo: ");
        double anchura = scanner.nextDouble();

        double perimetro = 2 * (longitud + anchura);
        double area = longitud * anchura;

        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);

        scanner.close();
    }
}