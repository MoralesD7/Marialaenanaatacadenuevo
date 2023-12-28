import javax.swing.JOptionPane;

//codigo para que muestre la cantidad de veces que intentaste insertar un numero que no es negativo 
public class N_negativos_Ciclos {
    public static void main ( String args[]){
        // declaracion de variables 
        int cantidad; 
        int intentos=0;
        do{
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(""));
        // la cantidad de intentos va a ir avanzando y al final se va a imprimir 
        intentos++;
        }while(cantidad >= 0);
        
        // se necesita una resta a la ultima cantidad de intentos de 1 para que no cuente el intento del numero negativo 
        intentos--;
        System.out.println("la cantidad de veces que lo has intentado es "+intentos );
    }
}
