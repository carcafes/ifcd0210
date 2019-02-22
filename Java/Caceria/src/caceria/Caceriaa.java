/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caceria;


import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Caceriaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	//Personajes
    	int leon = 0;
    	boolean leoncorrecto = false;
    	
    	int  distancia;
    	boolean victoria = false;
    	int contador = 1;
    	
    	
    	
    	
    	//Numero aleatorio
    	int n; 
        Random rnd = new Random();
        n = rnd.nextInt(3);
        n = n + 5;
        
        //gacela
        Gacela Gacela = new Gacela(0, 0, 0, 3, 0, false,false);
        
        
        
        //leon
        Leon Leon = new Leon(0 , 1, false, false, false, false, false);
        
        //inicializar Gacela
        Gacela.setPosicion(n);
        Gacela.posLeon = Leon.posicion;
        Leon.posGacela = Gacela.posicion;
        Gacela.setPanico(false);
        
        
        //inicializar leon
        Leon.setPosicion(0);
        Leon.setCazando(false);
        
        
        
        //titulo
        System.out.println("						Juego de cazeria: ");
        
        //Realentizar?
        try {
			TimeUnit.SECONDS.sleep(3);
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
			TimeUnit.SECONDS.sleep(6);
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
        //scaner
        Scanner s = new Scanner(System.in);
        //Punto de juego
        do {
        //chequeos
        Leon.setGacelaPanico(Gacela.panico);
        distancia = Gacela.posicion - Leon.posicion;
        if(distancia <= 4 ) {Leon.setCazando(true);}
        else {Leon.setCazando(false);}
        
        //nueva posicion
        int x; 
        Random rnd2 = new Random();
        x = rnd2.nextInt(5);
        x = x + 3;
        
        //acciones leon
        
        do {
        	 
        	if(Leon.cazando == false) {
        		//opciones sin cazar
        		 
        				System.out.println("El Leon no ve todavia a la gacela.");
        				System.out.println("Accion leon:");
        				System.out.println("1. Avanzar.");
               		 	leon = s.nextInt();
               		 	
        				System.out.println(leon);
        														
        		
        
    
        		switch(leon){
        				case 1: leon = 1;
        						Leon.Avanzar();
        						leoncorrecto = true;
        						break;
        				default:System.out.println("Accion no existente.");
        						break;
        					}
        							 }
        	//opciones cazando.
        	 else {
        		 	System.out.println("El leon ve a la gacela a "+ (Leon.posGacela-Leon.posicion) +", es hora de cazar.");
        			System.out.println("Accion leon:");
        			System.out.println("1. Acechar.");
        			System.out.println("2. Esconderse. ");
        			System.out.println("3. Perseguir.");
        			System.out.println("4. Cazar ");
        			
           		 	leon = s.nextInt();
           		 	
        			System.out.println(leon);
        
        		  switch(leon){
        
        
        		  		case 1: leon = 1;
        		  				Leon.Acechar();
        		  				leoncorrecto = true;
        		  				break;
        		  		case 2: leon = 2;
        		  				Leon.Esconderse();
        		  				leoncorrecto = true;
        		  				break;
        		  		case 3: leon = 3;
        		  				Leon.Perseguir();
        		  				leoncorrecto = true;
        		  				break;
        		  		case 4: leon = 4;
        		  				Leon.Cazar();
        		  				leoncorrecto = true;
        		  				break;
        		  		default:System.out.println("Accion no existente ");
        		  				break;
        		  				}
        			}
        	
           }while (leoncorrecto == false);
        
        //inicializar habilidades leon
        Gacela.leonEscondido = Leon.sigilo;
        Gacela.posLeon = Leon.posicion;
        //Gacela.bot selector
        switch(contador) {
        	case 1 :Gacela.Observar();
        	if(Gacela.panico == true) {contador = 4;}
        	else {contador++;}
        		break;
        	case 2 : Gacela.Comer();
        		contador++;
        		break;
        	case 3 : Gacela.Beber();
        		contador++;
        		break;
        	case 4 : Gacela.Huir();
        		break;
        	
        
        }
       
        
        
        //chequeos de victoria.
        if(Leon.cazado == true) {System.out.println("El leon gana.");
        						 victoria=true;
        						}
        
        if(Gacela.huyendo >= 5) {System.out.println("La gacela ha escapado");Leon.setPosicion(0);
        						 Gacela.setPosicion(x);
        						 Gacela.setPanico(false);
        						 Leon.setCazando(false);
        						 contador = 1;
        						}
        
        if(Gacela.huyendo >= 5 & Gacela.comida >= 3 & Gacela.bebida >= 3) {
        	System.out.println("La gacela ha ganado");
        	victoria=true;
        																  }
        //fin de turno
        if(Leon.ocultado == false) {Leon.ocultarse++;}
        if(Gacela.observado == false) {Gacela.observar++;}
        if(contador == 3) {contador = 1;}
       //reinicios
        Leon.sigilo = false;
        Leon.ocultado= false;
        Gacela.observado = false;
        Gacela.leonEscondido = false;
        
        
    }while(victoria == false);
        s.close();
        
    }
    
}
