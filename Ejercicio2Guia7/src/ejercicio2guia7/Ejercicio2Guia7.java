/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
 * Método constructor que inicialice el radio pasado como parámetro.
 * Métodos get y set para el atributo radio de la clase Circunferencia.
 * Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
 * Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
 * Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package ejercicio2guia7;

import ENTIDAD.Circunferencia;

/**
 *
 * @author jose
 */
public class Ejercicio2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Circunferencia pelota1 = new Circunferencia();

        pelota1.crearCircunferencia();

        System.out.println("");

        pelota1.area(pelota1.getRadio());

        System.out.println("");

        pelota1.perimetro(pelota1.getRadio());

    }
    
}
