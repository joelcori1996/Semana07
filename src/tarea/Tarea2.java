package tarea;
import java.util.Scanner;
public class Tarea2 {
     public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        int temperatura, tempMax = 0, tempMin = 0, contar=0;
        String continuar;
        //calculando
        do {
            contar++;
            System.out.print("Ingrese la temperatura: ");
            temperatura = scanner.nextInt();
            if(contar==1)
            {
            tempMax = temperatura;
            tempMin = temperatura;
            }
            if (temperatura > tempMax) {
                tempMax = temperatura;
            }
            if (temperatura < tempMin) {
                tempMin = temperatura;
            }
            System.out.print("¿Desea ingresar otra temperatura? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equals("si"));

        System.out.println("La temperatura mas alta ingresada es: " + tempMax);
        System.out.println("La temperatura mas baja ingresada es: " + tempMin);
    }
}
