/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;

/**
 *
 * @author brand
 */
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Escriba un numero: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " es un numero par.");
            } else {
                System.out.println(numero + " es un numero impar.");
            }

            if (numero <= 50) {
                System.out.println("El numero ingresado es menor o igual a 50.");
                break;
            }
        }

        scanner.close();
    }
}
