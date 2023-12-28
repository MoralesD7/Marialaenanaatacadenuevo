
import java.util.Scanner;


public class salario {
    public static void main (String args[]){
    Scanner entrada = new Scanner(System.in);
    int horas; 
        System.out.println("digite cuantas horas trabajo el obrero:");
    horas = entrada.nextInt();
    if(horas<=40){
           horas *= 16;
           System.out.println("el pago total de las horas trabajadas sera :"+ horas);
    }else{
        horas = (40*16) +((horas-40)*20);
        System.out.println("tu salario es de :"+horas );
    }
    
    
    
    }
}
