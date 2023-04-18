/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package ejercicioextra5guia7;

import ENTIDAD.Empleado;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class EjercicioExtra5Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
       System.out.println("Ingrese su salario");
        double salario = leer.nextDouble();
        
        Empleado empleado1 = new Empleado( nombre, edad ,salario );
    
     empleado1.calcular_aumento();
    }
    
}
