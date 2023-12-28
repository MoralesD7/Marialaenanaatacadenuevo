import java.util.Scanner;
public class edades {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in );
        System.out.println("digita la cantidad de dinero que tiene Guillermo :");
        int Dguillermo = entrada.nextInt();
        int Dluis = Dguillermo/2;
        int Djuan = ((Dguillermo + Dluis )/2);
        
       
        System.out.println("la cantidad de dinero que tiene guillermo es :" + Dguillermo );
        System.out.println("la cantidad de dinero que tiene luis  es :" + Dluis );
        System.out.println("la cantidad de dinero que tiene juan  es :" + Djuan );
    
        
        int total = Dguillermo + Dluis + Djuan;     
        
        System.out.println("la suma total del dinero es " + total );
        
    }
}