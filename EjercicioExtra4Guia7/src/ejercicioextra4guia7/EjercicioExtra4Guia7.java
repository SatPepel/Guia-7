/*
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package ejercicioextra4guia7;

import ENTIDAD.Cuenta;

/**
 *
 * @author jose
 */
public class EjercicioExtra4Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cuenta c1 = new Cuenta();
        
        c1.setSaldo(10000);
        c1.setTitular("Juan");
        
       c1.retirar_dinero();
    }
    
}
