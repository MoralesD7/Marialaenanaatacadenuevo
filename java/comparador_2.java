import java.util.Scanner;
/*
Programa que comprara dos numeros si son iguales imprime cosass*/

public class comparador_2 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int num1,num2;
        System.out.println("digita dos numero :");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        if ((num1%2)==0&&(num2%2)==0){
            System.out.println("ambos numeros son pares ");
        }else if ((num1%2)==1&&(num2%2)==1){
            System.out.println("ambos numeros son impares  ");
        } else if ((num1%2)==0&&(num2%2)==1){
            System.out.println("el numero primer numero que ingresaste  es par y el segundo numero es impar ");
        }else if ((num1%2)==1&&(num2%2)==0){
            System.out.println("el numero primer numero que ingresaste  es impar y el segundo numero es par ");
        }else {
            System.out.println("No cumple ninguno");
        }
            
    }
}