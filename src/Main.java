import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    verificarMayorEdad(lector);
                    break;
                case 2:
                    encontrarMayor(lector);
                    break;
                case 3:
                    verificarParImpar(lector);
                    break;
                case 4:
                    calcularFactorial(lector);
                    break;
                case 5:
                    mostrarImparesFor(lector);
                    break;
                case 6:
                    mostrarImparesWhile(lector);
                    break;
                case 7:
                    mostrarDiaSemana(lector);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    lector.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Verificar si es mayor de edad.");
        System.out.println("2. Encontrar el mayor de dos números.");
        System.out.println("3. Verificar si un número es par o impar.");
        System.out.println("4. Calcular el factorial de un número.");
        System.out.println("5. Mostrar números impares con bucle for.");
        System.out.println("6. Mostrar números impares con bucle while.");
        System.out.println("7. Mostrar día de la semana.");
        System.out.println("8. Salir.");
        System.out.print("Opción: ");
    }

    private static void verificarMayorEdad(Scanner lector) {
        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }

    private static void encontrarMayor(Scanner lector) {
        System.out.print("Ingrese el primer número: ");
        int num1 = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = lector.nextInt();
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    private static void verificarParImpar(Scanner lector) {
        System.out.print("Ingrese un número: ");
        int numero = lector.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    private static void calcularFactorial(Scanner lector) {
        System.out.print("Ingrese un número: ");
        int numero = lector.nextInt();
        int factorial = 1;
        int i = numero;
        while (i > 0) {
            factorial *= i;
            i--;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }

    private static void mostrarImparesFor(Scanner lector) {
        System.out.print("Ingrese un número mayor a 10 y menor que 30: ");
        int numero = lector.nextInt();
        if (numero <= 10 || numero >= 30) {
            System.out.println("Número fuera de rango.");
            return;
        }
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void mostrarImparesWhile(Scanner lector) {
        System.out.print("Ingrese un número mayor a 10 y menor que 30: ");
        int numero = lector.nextInt();
        if (numero <= 10 || numero >= 30) {
            System.out.println("Número fuera de rango.");
            return;
        }
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        int i = 1;
        while (i <= numero) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }

    private static void mostrarDiaSemana(Scanner lector) {
        System.out.print("Ingrese un número del 1 al 5: ");
        int dia = lector.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Número fuera de rango.");
        }
    }
}