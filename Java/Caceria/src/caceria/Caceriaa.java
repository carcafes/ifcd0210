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
        int distancia2;
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
        //jframe
        jframe interfaz = new jframe();
                interfaz.setVisible(true);
        leon= interfaz.leon;        
        
        
        
        //titulo
        interfaz.jTextArea1.setText("                                           Juego de cazeria: ");
        
        //Realentizar?
        try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        //informacion
        
        interfaz.jTextArea1.setText("		Informacion."
                + "\n"
                + "El juego de cazeria nesesita de dos jugadores:"
                + "\n"
                + " Leon y gacela."
                + "\n"
                + "El objetivo del juego es sobrevivir,"
                + "\n"
                + " ya sea el leon cazando a la gacela "
                + "\n"
                + "o la gazela comiendo, bebiendo y escapando. ");
        
      //Realentizar X2?
        try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        //Como jugar
        
        
        interfaz.jTextArea1.setText(
                "\n"
        + "	La gacela puede comer, beber y obsevar a su alrededor."
        + "\n"
        + "	El leon debe avanzar hasta encontrar a la gacela."
        + "\n"
        + "\n"
        + "	Una vez se han encontrado empieza la accion."
        + "\n"
        + "	Si la gacela ve al leon podra huir."
        + "\n"
        + "	Cuando el leon encuentra a la gacela gana acciones nuevas."
        + "\n"
        + "\n"
        + "	- Acechar: avanza una casilla en silencio."
        + "\n"
        + "	- Esconderse: se agazapa escondido para que no le vean."
        + "\n"
        + "	- Perseguir: avanza dos casillas si le han visto."
        + "\n"
        + "	Y Cazar, que gana si esta en la casilla contigua a la gacela.");
       
        
      //Realentizar X3?
        try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        //Selecion de acciones y turnos
        interfaz.jTextArea1.setText("\n"
        + "	Para escoger opciones se debe escribir el numero de la accion. "
        +        "\n"
        + "	Los turnos seran primero del leon y despues de la gazela."
        + "\n"
        + "	Si la gazela escapa pero no ha comido suficiente se volvera a empezar"
        + "\n"
        + "     hasta que haya comido y bebido suficiente."
        + "\n");
        
       
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
        if(distancia <= 5 ) {Leon.setCazando(true);}
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
        		 
        	interfaz.jTextArea1.setText("El Leon no ve todavia a la gacela."
                                        + "\n"
        				+ "Accion leon:"
                                        + "\n"
        				+ "1. Avanzar.");
                                        //Realentizar?
                                         
               		 	
                                        try {
                                         TimeUnit.SECONDS.sleep(5);
                                             } catch (InterruptedException e) {
			
                                            e.printStackTrace();
                                                }
        				while(leon == 0){leon = interfaz.leon;}
        														
        		
        
    
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
                    distancia2 =(Leon.posGacela - Leon.posicion);
        interfaz.jTextArea1.setText("El leon ve a la gacela a " 
                                        + distancia2
                                        + ", es hora de cazar."
                                        + "Accion leon:"
                                        + "1. Acechar."
                                        + "2. Esconderse. "
                                        + "3. Perseguir."
                                        + "4. Cazar ");
                                    
                                        
        			
           		 	
           		 	try {
                                         TimeUnit.SECONDS.sleep(5);
                                             } catch (InterruptedException e) {
			
                                            e.printStackTrace();
                                                }
        			while(leon == 0){leon= interfaz.leon;};
        
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
        		  default:interfaz.jTextArea1.setText("Accion no existente ");
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
                try {
                                         TimeUnit.SECONDS.sleep(2);
                                             } catch (InterruptedException e) {
			
                                            e.printStackTrace();
                                                }
        	if(Gacela.panico == true) {contador = 4;}
        	else {contador++;}
        		break;
        	case 2 : Gacela.Comer();
                try {
                                         TimeUnit.SECONDS.sleep(2);
                                             } catch (InterruptedException e) {
			
                                            e.printStackTrace();
                                                }
        		contador++;
        		break;
        	case 3 : Gacela.Beber();
                try {
                                         TimeUnit.SECONDS.sleep(2);
                                             } catch (InterruptedException e) {
			
                                            e.printStackTrace();
                                                }
        		contador++;
        		break;
        	case 4 : Gacela.Huir();
                try {
                                         TimeUnit.SECONDS.sleep(2);
                                             } catch (InterruptedException e) {
			
                                            e.printStackTrace();
                                                }
        		break;
        	
        
        }
       
        
        
        //chequeos de victoria.
        if(Leon.cazado == true) {interfaz.jTextArea1.setText("El leon gana.");
        						 victoria=true;
        						}
        
        if(Gacela.huyendo >= 5) {interfaz.jTextArea1.setText("La gacela ha escapado");
                                                           Leon.setPosicion(0);
        						Gacela.setPosicion(x);
        						Gacela.setPanico(false);
        						 Leon.setCazando(false);
        						 contador = 1;
        						}
        
        if(Gacela.huyendo >= 5 & Gacela.comida >= 3 & Gacela.bebida >= 3) {
        	interfaz.jTextArea1.setText("La gacela ha ganado");
        	victoria=true;
        																  }
        //fin de turno
        if(Leon.ocultado == false) {Leon.esconderse++;}
        if(Gacela.observado == false) {Gacela.observar++;}
        if(contador == 3) {contador = 1;}
       //reinicios
        Leon.sigilo = false;
        Leon.ocultado= false;
        Gacela.observado = false;
        Gacela.leonEscondido = false;
        interfaz.leon=0;
        leon=0;
        
    }while(victoria == false);
        s.close();
        
    }
    
}
