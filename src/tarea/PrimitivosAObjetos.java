package tarea;

import java.util.Scanner;

/**
 *
 * @author Felipe Beltrán, conversión de datos primitivos a objetos.
 * Datos primitivos: Integer, float, double, long, short, byte, string, boolean,
 * char, character. 
 */
public class PrimitivosAObjetos {
    
    public static boolean numeroBooleano(double numero){
        return numero != 0;
    }
     
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        String nombre = "Felipe";
        //String nombre = lector.nextLine();
        
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Nombre en codigo ASCII: ");
        
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i);
            int ascii = (int) c;
            System.out.println(" ' " + c + " ' = " + ascii);
            
        }
         
        System.out.println("\nEdad: ");
        Integer edad = 23;
        //Integer edad = lector.nextInt();
        
        //Character caracterEdad = (char) edad.intValue();
        
        System.out.println("\nInteger original: " + edad);
        System.out.println("Float: " + edad.floatValue());
        System.out.println("Double: " + edad.doubleValue());
        System.out.println("Long: " + edad.longValue());
        System.out.println("Short: " + edad.shortValue());
        System.out.println("Byte: " + edad.byteValue());
        System.out.println("String: " + edad.toString());
        System.out.println("Boolean: " + numeroBooleano(edad));
        //System.out.println("Character: " + caracterEdad);
        
           
        System.out.println("\nPeso: ");
        Float peso = 75.6f;
        //Float peso = lector.nextFloat();
        
        //Character caracterPeso = (char) peso.intValue();
    
        System.out.println("\nFloat original: " + peso);
        System.out.println("Entero: " + peso.intValue());
        System.out.println("Double: " + peso.doubleValue());
        System.out.println("Long: " + peso.longValue());
        System.out.println("Short: " + peso.shortValue());
        System.out.println("Byte: " + peso.byteValue());
        System.out.println("String: " + peso.toString());
        System.out.println("Boolean: " + numeroBooleano(peso));
        //System.out.println("Character: " + caracterPeso);
        
        
        System.out.println("\nPromedio academico: ");
        Double promedio = 4.1;
        //Double promedio = lector.nextFloat();
        
        //Character caracterPeso = (char) peso.intValue();
    
        System.out.println("\nDouble original: " + promedio);
        System.out.println("Entero: " + promedio.intValue());
        System.out.println("Float: " + promedio.floatValue());
        System.out.println("Long: " + promedio.longValue());
        System.out.println("Short: " + promedio.shortValue());
        System.out.println("Byte: " + promedio.byteValue());
        System.out.println("String: " + promedio.toString());
        System.out.println("Boolean: " + numeroBooleano(promedio));
        //System.out.println("Character: " + caracterPeso);
        
           
        
    }
    
}
