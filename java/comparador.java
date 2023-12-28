
import java.util.Scanner;


public class comparador {
    
    public static void main (String args[]){
        
        Scanner entrada = new Scanner(System.in);
            int N1; 
            int N2;
        System.out.println("digita 2 numeros porfavor ");    
            
        N1 = entrada.nextInt();
        N2 = entrada.nextInt();
        
        if(N1<N2){
            System.out.println("el segundo numero es mayor  que el primero ");
        }if(N1>N2){
            System.out.println("el numero uno es mayor que el segundo numero");
        }if(N1==N2){
            System.out.println("los numeros son  iguales ");
        } 
    
    
    
    }
    
}
