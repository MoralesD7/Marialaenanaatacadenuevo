package poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author darko
 */
public class llamado {
    public static void main (String args[]){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        
        //creacion del objeto 
        Operacion op = new Operacion();
        
        //llamado de los metodos 
        op.suma(num1,num2);
        op.resta(num1,num2);
        op.multiplicacion(num1,num2);
        op.division(num1,num2);
        op.Mostrar();
    
    
    }

    
    
}