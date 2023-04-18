/*
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el título 
 * y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción.
 * Se deberán además definir los métodos getters y setters correspondientes.

 */
package ejercicioextra1guia7;

import ENTIDAD.Cancion;

/**
 *
 * @author jose
 */
public class EjercicioExtra1Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cancion cancion1 = new Cancion();
    
    cancion1.cargarCancion();
    cancion1.mostrarCancion();
    }
    
}
