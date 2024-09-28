package tarea;

import java.util.Scanner;
public class Tarea {
 
    public static void main(String[] args) {
        //declaracion de variables
        Scanner scanner = new Scanner(System.in);
        int edad, total = 0, contador = 0;
        String continuar;
        //calculando
        do {
            System.out.print("Ingrese la edad: ");
            edad = scanner.nextInt();
            total += edad;
            contador++;

            System.out.print("¿Desea ingresar otra edad? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));

        double promedio = (double) total / contador;
        System.out.println("El promedio de las edades ingresadas es: " + promedio);
    }
    
}
