import java.util.Scanner;

//leer un numero e indicar si es positivo o negativo se repetira hasta que se introduzca un 0 


class bucles_ejercicio2{

    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero; 

        do{
        System.out.println("digita un numero:");
        numero = entrada.nextInt();
        if(numero>0){
            System.out.println("el numero es positivo");
        }else{
            System.out.println("el numero es negativo");
        }    
    }while(numero!=0);

    }
}