/*
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el título 
 * y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción.
 * Se deberán además definir los métodos getters y setters correspondientes.
 */
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Cancion {
Scanner leer = new Scanner(System.in);    
private String Titulo;
private String Autor;

    public Cancion() {
    }

    public Cancion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

public void cargarCancion() {
    
    System.out.println("Ingrese el titulo de la cancion");
    Titulo = leer.nextLine();
    System.out.println("Ingrese el autor de la cancion");
    Autor = leer.nextLine();
    
    }

public void mostrarCancion() {
    System.out.println("El titulo de la cancion es: " + Titulo);
    System.out.println("El autor de la cancion es: " + Autor);
}
}
    

