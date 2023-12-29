//pedir numeros hasta que se teclee un 0 , mostrar la suma de todos los numeros introducidos 
import java.util.Scanner;

public class bucles_ejercicio6 {
    public static void main (String args[]){
    
    int numero,resultado= 0;
    Scanner entrada = new Scanner(System.in);
    
    do{
        System.out.println("digita un numero :");
        numero= entrada.nextInt();

        resultado += numero;
        }while(numero!=0);
        System.out.println("la suma de los numeros es :"+ resultado );

    }
    
}
