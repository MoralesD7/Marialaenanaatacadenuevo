import java.util.Scanner;


public class operaciones {
    
    public static void main (String args []){
            System.out.println("Bienvenido a tu calculadora de dos digitos ");
            
            Scanner entrada = new Scanner(System.in);
            
            int num1,num2,suma,resta,multiplicacion,division;
            
            System.out.println("digita 2 numeros para las operaciones ");
            num1 = entrada.nextInt();
            num2 = entrada.nextInt();
            
            suma = num1+num2; 
            resta = num1-num2; 
            multiplicacion = num1*num2; 
            division = num1/num2; 
            
            System.out.println("la suma es: "+ suma );
            System.out.println("la resta es :"+ resta );
            System.out.println("la multiplicacion es :"+ multiplicacion);
            System.out.println("la division es :"+division );
         
            
    }
    
}