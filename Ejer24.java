import java.io.PrintStream;
import java.util.Scanner;

public class Ejer24{
    static PrintStream screen= System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args){
        float per1;
        float per2;
        float per3;
        float aux;

        screen.println("Ingrese la estatura de la primera persona en metros de la forma x,xx");
        per1=keyboard.nextFloat();
        screen.println("Ingrese la estatura de la segunda persona en metros de la forma x,xx");
        per2=keyboard.nextFloat();
        screen.println("Ingrese la estatura de la tercera persona en metros de la forma x,xx");
        per3=keyboard.nextFloat();
        
        if(per1>per2){
            aux=per1;
            per1=per2;
            per2=aux;
        }
        if(per2>per3){
            aux=per2;
            per2=per3;
            per3=aux;
        }
        if(per1>per2){
            aux=per1;
            per1=per2;
            per2=aux;
        }

        screen.println("Las estaturas ordenadas de forma asendente son: "+per1+"   "+per2+"   "+per3);

    }
}
