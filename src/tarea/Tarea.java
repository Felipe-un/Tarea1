package tarea.pkg1;

import java.util.Scanner;
/*
 * @author Felipe Beltrán, recibir e imprimir los cuatro primeros datos
 * primitivos en Java.
 */
public class Tarea {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        
        System.out.println("TOMA DE DATOS");
        
        boolean continuar = true;
        
        while (continuar) {            
                        
            System.out.println("\nDigite su nombre: ");
            String nombre = lector.nextLine();
            System.out.println("\nBienvenido: " + nombre);
        
            System.out.println("Por favor digite su edad: ");
            int edad = lector.nextInt();

            System.out.println("\nDigite su peso en kg: ");
            double peso = lector.nextDouble();
            System.out.println("\nNombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso + "kg");

            System.out.println("\nDesea agregar nuevos datos?");
            
            continuar = lector.nextBoolean();    
            lector.nextLine();
            
        }     
        
        System.out.println("\nFin del programa");
        lector.close();
        
    }
    
}