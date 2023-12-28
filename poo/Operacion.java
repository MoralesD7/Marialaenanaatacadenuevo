/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author darko
 */
public class Operacion {
    
    
    //declaracion de atributos 
    
    int suma; 
    int resta; 
    int multiplicacion; 
    int division;     
    //declaracion de metodos 
    
    
    public void suma(int num1,int num2){
        suma = num1 + num2;
    }
    
    public void resta(int num1,int num2){
        resta = num1-num2;
    }
    
    public void multiplicacion(int num1,int num2){
        multiplicacion = num1*num2;
    }
    
    public void division(int num1,int num2){
        division = num1/num2;
    }
    public void Mostrar(){
    
        System.out.println("la suma de los numeros es :"+ suma);
        System.out.println("la resta de los numeros es :"+ resta);
        System.out.println("la multplicacion de los numeros es :"+ multiplicacion);
        System.out.println("la division de los numeros es :"+ division);

    }

    
    
}


