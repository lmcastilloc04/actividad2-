import java.io.PrintStream;
import java.util.Scanner;

public class Ejer21 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero:");
		
		double numero = escaner.nextDouble();
		
		if (numero == 0) {
			System.out.println("El número es cero");
		} else if (numero < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
	}
}