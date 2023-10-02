package tarea.pkg1;

import java.util.Scanner;

public class Tarea1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
          while (true) {
            System.out.println("Calculadora en consola:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Verificar numero primo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = teclado.nextInt();

            if (opcion == 6) {
                System.out.println("Saliendo de la aplicación.");
                break;
            }
            switch (opcion) {
                case 1:
                    suma(teclado);
                    break;
                case 2:
                    resta(teclado);
                    break;
                case 3:
                    multiplicacion(teclado);
                    break;
                case 4:
                    division(teclado);
                    break;
                case 5:
                    verificacionNumeroPrimo(teclado);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void suma(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }

    private static void resta(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        int resultado = num1 - num2;
        System.out.println("La resta es: " + resultado);
    }

    private static void multiplicacion(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo nnmero: ");
        int num2 = scanner.nextInt();
        int resultado = num1 * num2;
        System.out.println("La multiplicacion es: " + resultado);
    }

    private static void division(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int segundoNumero = scanner.nextInt();

        if (primerNumero == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            double resultado = (double) primerNumero / segundoNumero;
            System.out.println("La division es: " + resultado);
        }
    }

    private static void verificacionNumeroPrimo(Scanner scanner) {
        System.out.print("Ingrese un numero para verificar si es primo: ");
        int num = scanner.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es un numero primo.");
        } else {
            System.out.println(num + " no es un numero primo.");
        }
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
