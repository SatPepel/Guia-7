/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
 * El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
 * El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
 * Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package ENTIDAD;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Juego {
public int intenTos, nuM, nuM2, conT1, conT2;
public String juG1, juG2;
public boolean veriFi;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Juego() {
    }

    public Juego(int intenTos, int nuM, int nuM2, int conT1, int conT2, String juG1, String juG2, boolean veriFi) {
        this.intenTos = intenTos;
        this.nuM = nuM;
        this.nuM2 = nuM2;
        this.conT1 = conT1;
        this.conT2 = conT2;
        this.juG1 = juG1;
        this.juG2 = juG2;
        this.veriFi = veriFi;
    }

public void iniciar_juego(){
conT1 = 0;
conT2 = 0;
    System.out.println("Ingrese los nombres de los jugadores: ");   
    juG1 = leer.next();
    juG2 = leer.next();
veriFi= false;
String seleccion = "s";
    do
    {  
        
        System.out.println(juG1+" Ingrese el numero a buscar: ");
        nuM = leer.nextInt();
        System.out.println(juG1+" Ingese la cantidad de intentos");
        intenTos = leer.nextInt();
         
        while (veriFi == false)
        {            
            System.out.println(juG2+" Tiene " + intenTos + " intentos" );
            nuM2 = leer.nextInt();
            intenTos --;
            if (nuM2 > nuM )
            {
                System.out.println("Pruebe con un mas bajo: ");
            } else if (nuM2< nuM)
            {
                System.out.println("Pruebe con un numero mas alto: ");
            }
            if (nuM2== nuM)
            {
                System.out.println("El numero coincide:");
                veriFi = true;
                conT2 ++;
                break;
            }
            if (intenTos == 0)
            {
                System.out.println("Se acabaron los intentos");
                conT1 ++;
                break;
            }
            
            
        }
        System.out.println("Quiere seguir jugando s/n? ");
        seleccion = leer.next();
        
        
    } while (seleccion.equalsIgnoreCase("s"));
    System.out.println( juG1+ " A ganado "+ conT1+ " veces "+ juG2 +" a acertado "+ conT2+" veces.");

    
}
    
    
    
    
    
    
    
    
    public int getIntenTos() {
        return intenTos;
    }

    public void setIntenTos(int intenTos) {
        this.intenTos = intenTos;
    }

    public int getNuM() {
        return nuM;
    }

    public void setNuM(int nuM) {
        this.nuM = nuM;
    }

    public int getNuM2() {
        return nuM2;
    }

    public void setNuM2(int nuM2) {
        this.nuM2 = nuM2;
    }

    public int getConT1() {
        return conT1;
    }

    public void setConT1(int conT1) {
        this.conT1 = conT1;
    }

    public int getConT2() {
        return conT2;
    }

    public void setConT2(int conT2) {
        this.conT2 = conT2;
    }

    public String getJuG1() {
        return juG1;
    }

    public void setJuG1(String juG1) {
        this.juG1 = juG1;
    }

    public String getJuG2() {
        return juG2;
    }

    public void setJuG2(String juG2) {
        this.juG2 = juG2;
    }

    public boolean isVeriFi() {
        return veriFi;
    }

    public void setVeriFi(boolean veriFi) {
        this.veriFi = veriFi;
    }


    
}
