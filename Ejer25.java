import java.io.PrintStream;
import java.util.Scanner;

public class Ejer25B{
    static PrintStream screen= System.out;
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[]args){
        float per1;
        float per2;
        float per3;
        float per4;
        float aux;
        
        screen.println("Ingrese la estatura de la primera persona en metros de la forma x,xx");
        per1=keyboard.nextFloat();
        screen.println("Ingrese la estatura de la segunda persona en metros de la forma x,xx");
        per2=keyboard.nextFloat();
        screen.println("Ingrese la estatura de la tercera persona en metros de la forma x,xx");
        per3=keyboard.nextFloat();
        screen.println("Ingrese la estatura de la cuarta persona en metros de la forma x,xx");
        per4=keyboard.nextFloat();

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
        if(per3>per4){
            aux=per3;
            per3=per4;
            per4=aux;
        }
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

        screen.println(per1+"   "+per2+"   "+per3+"   "+per4);

    }

}