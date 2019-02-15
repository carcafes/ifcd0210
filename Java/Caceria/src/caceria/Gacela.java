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
 boolean panico;
 boolean observado;
 
    public Gacela (int posicion, int comida, int bebida, int observar){   
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
    	observado = true;
        if(Gacela.getPosicion() - Leon.getPosicion() <= 5) panico = true;
       
    }

    @Override
    public void Huir() {
    	if(panico = true) {posicion++;posicion++;}
        
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
