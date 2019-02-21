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
    	int leon = 0;
    	boolean leoncorrecto = false;
    	int gacela = 0;
    	boolean gacelacorrecto = false;
    	
    	
    	
    	
    	//Numero aleatorio
        int n; 
        Random rnd = new Random();
        n = rnd.nextInt(10);
        n = n + 5;
        
        //gacela
        Gacela Gacela = new Gacela(0, 0, 0, 3, 0, false,false);
        
        
        
        //leon
        Leon Leon = new Leon(0 , 1, false, false, false, false);
        
        //inicializar Gacela
        Gacela.setPosicion(n);
        Gacela.posLeon = Leon.posicion;
        Leon.posGacela = Gacela.posicion;
        
        
        //inicializar leon
        Leon.setPosicion(0);
        
        
        
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
			TimeUnit.SECONDS.sleep(1);
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
			TimeUnit.SECONDS.sleep(1);
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
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        //chequeos
        if(Gacela.posicion - Leon.posicion < 5) {Leon.setCazando(true);}
        else {Leon.setCazando(false);}
        
        //acciones leon
        
        do {
        	if(Leon.cazando = false) {
        		//opciones sin cazar
        		try ( Scanner scleon = new Scanner(System.in);) { 
        				System.out.println("El Leon no ve todavia a la gacela.");
        				System.out.println("Accion leon:");
        				System.out.println("1. Avanzar.");
        				leon = scleon.nextInt();
        														}
        		catch(Exception ex){
        				ex.printStackTrace();
        						   } 
        
    
        		switch(leon){
        				case 1: leon = 1;
        						Leon.Avanzar();
        						leoncorrecto = true;
        				default:System.out.println("Accion no existente.");
        					}
        							 }
        	//opciones cazando.
        	 else {try (Scanner scleon = new Scanner(System.in);){
        		 	System.out.println("El leon ve a la gacela a "+ Leon.posGacela +", es hora de cazar.");
        			System.out.println("Accion leon:");
        			System.out.println("1. Acechar.");
        			System.out.println("2. Esconderse. ");
        			System.out.println("3. Perseguir.");
        			System.out.println("4. Cazar ");
        			leon = scleon.nextInt();
        														 }
        	
        		  catch(Exception ex){
            //exception handling...do something (e.g., print the error message)
        			ex.printStackTrace();
        				   			 }
        
        
        
        
        		  switch(leon){
        
        
        		  		case 1: leon = 1;
        		  				Leon.Acechar();
        		  				leoncorrecto = true;
        		  		case 2: leon = 2;
        		  				Leon.Esconderse();
        		  				leoncorrecto = true;
        		  		case 3: leon = 3;
        		  				Leon.Perseguir();
        		  				leoncorrecto = true;
        		  		case 4: leon = 4;
        		  				Leon.Cazar();
        		  				leoncorrecto = true;
        		  		default:System.out.println("Accion no existente ");
        		  				}
        			}
           }while (leoncorrecto=false);
        
        //inicializar habilidades leon
        Gacela.leonEscondido = Leon.sigilo;
        Gacela.posLeon = Leon.posicion;
        //Gacela selector
        
        
        do {
        	if(Gacela.panico = true) {
        			//acciones normales
        		try ( Scanner scgacela = new Scanner(System.in);) { 
        				System.out.println("Gacela:");
        				System.out.println("1. Huir.");
        				gacela = scgacela.nextInt();
        			}
        		catch(Exception ex){
        				ex.printStackTrace();
        						   } 
        
    
        		switch(gacela){
        				case 1: gacela=1;
        						Gacela.Huir();
        						gacelacorrecto = true;
        				default:System.out.println("Accion no existente,intentelo de nuevo.");}
        							}
        	//huida
        	 else {try (Scanner scgacela = new Scanner(System.in);){
        			System.out.println("Gacela:");
        			System.out.println("1. Comer.");
        			System.out.println("2. Beber. ");
        			System.out.println("3. Observar.");
        			gacela = scgacela.nextInt();
        														   }
        	
        		  catch(Exception ex){
            //exception handling...do something (e.g., print the error message)
        			ex.printStackTrace();
        				   			 }
        
        		  switch(gacela){
        
        
        		  		case 1: gacela = 1;
        		  				Gacela.Comer();
        		  				gacelacorrecto = true;
        		  		case 2: gacela = 2;
        		  				Gacela.Beber();
        		  				gacelacorrecto = true;
        		  		case 3: gacela = 3;
        		  				Gacela.Observar();
        		  				gacelacorrecto = true;
        		  		default:System.out.println("Accion no existente ");
        		  			   }
        		   }
           }while (gacelacorrecto=false);
        
        
        //chequeos de victoria.
        if(Leon.cazado = true) {System.out.println("El leon gana.");}
        if(Gacela.huyendo >= 5) {System.out.println("La gacela ha escapado");}
        if(Gacela.huyendo >= 5 & Gacela.comida >= 3 & Gacela.bebida >= 3) {System.out.println("La gacela ha ganado");}
        //fin de turno
        if(Leon.ocultado = false) {Leon.ocultarse++;}
        if(Gacela.observado = false) {Gacela.observar++;}
        Leon.sigilo = false;
        Leon.ocultado= false;
        Gacela.observado = false;
        Gacela.leonEscondido = false;
        
        System.out.println("El leon esta en "+ Leon.posicion + " y la gacela en "+ Gacela.posicion);
    }
    
}
