/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caceria;


import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Caceria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	//Personajes
    	int leon;
    	boolean leoncorrecto;
    	int gacela;
    	boolean gacelacorrecto;
    	
    	
    	
    	
    	//Numero aleatorio
        int n; 
        Random rnd = new Random();
        n = rnd.nextInt(10);
        n = n + 5;
        
        //gacela
        Gacela Gacela = new Gacela(0, 0, 0, 3);
        
        
        
        //leon
        Leon Leon = new Leon(0, false, false, false);
        
        //inicializar Gacela
        
        gacelacorrecto = false;
        Gacela.setPosicion(n);
        
        //inicializar leon
        Leon.setPosicion(0);
        leoncorrecto=false;
        
        //titulo
        System.out.println("						Juego de cazeria: ");
        
        //Realentizar?
        try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        //informacion
        System.out.println(" ");
        System.out.println("						Informacion. ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("		El juego de cazeria nesesita de dos jugadores: Leon y gacela. ");
        System.out.println("		El objetivo del juego es sobrevivir, ya sea el leon cazando a la gacela ");
        System.out.println(" 		o la gazela comiendo, bebiendo y escapando. ");
        System.out.println(" ");
        System.out.println(" ");
        
      //Realentizar X2?
        try {
			TimeUnit.SECONDS.sleep(6);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        //Como jugar
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("		La gacela puede comer, beber y obsevar a su alrededor.");
        System.out.println("		El leon debe avanzar hasta encontrar a la gacela. ");
        System.out.println(" ");
        System.out.println("		Una vez se han encontrado empieza la accion.");
        System.out.println("		Si la gacela ve al leon podra huir.");
        System.out.println(" ");
        System.out.println("		Cuando el leon encuentra a la gacela gana acciones nuevas.");
        System.out.println("		- Acechar: avanza una casilla en silencio.");
        System.out.println("		- Esconderse: se agazapa escondido para que no le vean.");
        System.out.println("		- Perseguir: avanza dos casillas si le han visto.");
        System.out.println("		Y Cazar, que gana si esta en la casilla contigua a la gacela.");
        System.out.println(" ");
        System.out.println(" ");
      //Realentizar X3?
        try {
			TimeUnit.SECONDS.sleep(8);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        //Selecion de acciones y turnos
        System.out.println(" ");
        System.out.println("		Para escoger opciones se debe escribir el numero de la accion. ");
        System.out.println("		Los turnos seran primero del leon y despues de la gazela.");
        System.out.println("		Si la gazela escapa pero no ha comido suficiente se volvera a empezar hasta que haya comido y bebido suficiente.");
        System.out.println(" ");
        System.out.println(" ");
        
       
      //Realentizar X4?
        try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        //Scanner leon
        Scanner scleon = new Scanner(System.in);
        
        
        do {
        if(Leon.cazando = true) {
        System.out.println("Leon:");
        System.out.println("1. Avanzar.");
        leon = scleon.nextInt();
    
    	switch(leon){
    case 1: Leon.Avanzar();leoncorrecto = true;;
    default:System.out.println("Accion no existente.");}
    }
        
        else {System.out.println("Leon:");
    
        System.out.println("1. Acechar.");
        System.out.println("2. Esconderse. ");
        System.out.println("3. Perseguir.");
        System.out.println("4. Cazar ");
        leon = scleon.nextInt();
        //acciones leon entrada
        switch(leon){
        
        
        case 1: Leon.Acechar();leoncorrecto = true;
        case 2: Leon.Esconderse();leoncorrecto = true;
        case 3: Leon.Perseguir();leoncorrecto = true;
        case 4: Leon.Cazar();leoncorrecto = true;
        default:System.out.println("Accion no existente ");}
        }
        }while (leoncorrecto=false);
        
    }
    
}
