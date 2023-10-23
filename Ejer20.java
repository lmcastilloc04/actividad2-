import java.io.PrintStream;
import java.util.Scanner;

public class Ejer20 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main (String[]args){
        int num=0;
        int resi=0;
        String mensaje ="";

        screen.println("Ingrese un numero entero");
        num = keyboard.nextInt();
        resi = (num % 2);

        if (resi == 0){
            mensaje = "el numero ingresado es par";
        }
        else {
            mensaje = "El numero ingresado es impar";
        }
        screen.println(mensaje);

    }
}