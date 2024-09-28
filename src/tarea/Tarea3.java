package tarea;
import java.util.Scanner;
public class Tarea3 {
    public static void main(String[] args) {
        // declarando variables
        Scanner scanner = new Scanner(System.in);
        int numero, pares = 0, impares = 0;
        String continuar;
        // calculando
        do {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            System.out.print("¿Desea ingresar otro numero? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equals("si"));

        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
    }
}
