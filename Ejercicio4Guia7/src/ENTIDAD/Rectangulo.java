/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
 * También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
 * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Rectangulo {
Scanner leer = new Scanner(System.in);
private int altura;
private int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {
    }

    public Scanner getLeer() {
        return leer;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

public void crearRectangulo(){
    
    System.out.println("Ingrese la altura del rectangulo");
    this.altura = leer.nextInt();
    System.out.println("Ingrese la base del rectangulo");
    this.base = leer.nextInt();
 }   

public double superficie()  {
return this.base * this.altura;    
}

public double perimetro()  {
return (this.base + this.altura)* 2;    
}

public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==(altura-1)) {
                    System.out.print(" * ");
                } else if (j==0 || j==(base-1)) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
}

    }
