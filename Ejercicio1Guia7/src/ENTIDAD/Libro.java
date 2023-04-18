/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Libro {
  private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    // Constructor vacío
    public Libro() {}
    
    // Constructor con todos los atributos
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    // Método para cargar un libro
    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de ISBN: ");
        isbn = sc.nextLine();
        System.out.print("Ingrese el título del libro: ");
        titulo = sc.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        autor = sc.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        numPaginas = sc.nextInt();
    }
    
    // Método para mostrar la información del libro
    public void mostrarInformacion() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);   
    
}
    }
