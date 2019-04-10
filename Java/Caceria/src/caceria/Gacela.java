/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caceria;

/**
 *
 * @author pc
 */
public class Gacela extends Bovido implements Presa{
 int posicion;
 int observar;
 int comida;
 int bebida;
 int huyendo;
 int posLeon;
 boolean panico;
 boolean observado;
 boolean leonEscondido;
 String textobservado ="";
 
 
    public Gacela (int posicion, int comida, int bebida, int observar,int huyendo,boolean panico,boolean observado){
    	this.posicion = posicion;
    	this.comida = comida;
    	this.bebida = bebida;
    	this.observar = observar;
    	this.huyendo = huyendo;
    	this.panico = panico;
    	this.observado = observado;
    	
    }
 
 
    


	@Override
    public void Comer() {
		comida++;
        
    }

    @Override
    public void Beber() {
        bebida++;
    }

    @Override
    public void Observar() {
    	if(observar > 0){observado = true; 
    				    if(leonEscondido == false) {
    						if(posicion - posLeon <= 5) {panico = true; textobservado="La gacela ha visto un leon a " + (posicion-posLeon) + ".";}
    					 	else {textobservado="La gacela no ha visto ningun peligro.";}
    											 }
    				    else {textobservado="La gacela no ha visto ningun peligro.";}
    					}
    	else {textobservado="La gacela se entretuvo mirando mariposas.";}
       
    }

    @Override
    public void Huir() {
    	if(panico == true) {if(huyendo > 0){posicion++;posicion++;huyendo++;}
    					   else 		  {posicion++;huyendo++;}	
    					  }
        
    				   }
    
    public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}





	public int getObservar() {
		return observar;
	}





	public void setObservar(int observar) {
		this.observar = observar;
	}





	public int getComida() {
		return comida;
	}





	public void setComida(int comida) {
		this.comida = comida;
	}





	public int getBebida() {
		return bebida;
	}





	public void setBebida(int bebida) {
		this.bebida = bebida;
	}





	public boolean isPanico() {
		return panico;
	}





	public void setPanico(boolean panico) {
		this.panico = panico;
	}





	public boolean isObservado() {
		return observado;
	}





	public void setObservado(boolean observado) {
		this.observado = observado;
	}
	
}
