import java.util.Scanner;
//pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido 
import java.util.Scanner;
class bucles_ejercicio4{
    public static void main (String args[]){
        int numero ;
        int cantidad = 0;     
        Scanner entrada = new Scanner (System.in);
    
        do {
            System.out.println("ingresa un numero porfavor:");
            numero = entrada.nextInt();
            cantidad++;

        }while(numero>=0);
        System.out.println("la cantidad de veces que lo has intentado es :"+ cantidad);
    }
}