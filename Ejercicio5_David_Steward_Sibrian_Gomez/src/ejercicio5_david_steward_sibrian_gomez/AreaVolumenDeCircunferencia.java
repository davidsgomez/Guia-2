package ejercicio5_david_steward_sibrian_gomez;

/**
 *
 * @author david
 */

import java.util.Scanner;

public class AreaVolumenDeCircunferencia {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        double pi = 3.141592653;

        double area = pi * radio * radio;
        double volumen = (4.0 / 3.0) * pi * radio * radio * radio;

        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);

        scanner.close();
    }
}