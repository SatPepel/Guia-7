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
public class Circunferencia {
 double Radio;

    public Circunferencia() {
    }

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    Scanner leer = new Scanner(System.in);

    public void crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia a crear");
        this.Radio = leer.nextDouble();
    }

    public void area(double Radio) {
        double area;
        area = (Math.PI * Radio * Radio);
        System.out.println("El area del circulo es :" + area);

    }

    public void perimetro(double Radio) {
        double perimetro;
        perimetro = Math.PI * 2 * Radio;
        System.out.println("El perimetro del circulo es :" + perimetro);
    }    
    
}
