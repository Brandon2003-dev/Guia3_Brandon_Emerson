/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package añobisiesto;

/**
 *
 * @author brand
 */
import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba un año: ");
        int año = scanner.nextInt();

        scanner.close();

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
}
