/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caceria;


public class Leon extends Felino implements Depredador{
  int   posicion;
  int 	posGacela;
  int   ocultarse;
  boolean cazando;
  boolean sigilo;
  boolean cazado;
  boolean ocultado;
  
  
  
  public Leon(int posicion, int ocultarse ,boolean cazando,boolean ocultado,boolean cazado,boolean sigilo){
	  this.posicion = posicion;
	  this.cazando = cazando;
	  this.ocultado = ocultado;
	  this.cazado = cazado;
	  this.sigilo = sigilo;
	  
  }
  




	@Override
    public void Cazar() {
    	if(posGacela - posicion <= 1) cazado=true;
        
    }

    @Override
    public void Avanzar() {
    	posicion++;
        
    }

    @Override
    public void Perseguir() {
    	posicion++;
    	posicion++;
        
    }

    @Override
    public void Acechar() {
    	posicion++;;
        
    }

    @Override
    public void Esconderse() {
    	if(ocultarse > 0) {
    		sigilo = true;
    		ocultado = true;}
    	else {System.out.println("El leon se entretuvo mirando mariposas.");}
        
    }


	public boolean isCazando() {
		return cazando;
	}


	public void setCazando(boolean cazando) {
		this.cazando = cazando;
	}


	public boolean isSigilo() {
		return sigilo;
	}


	public void setSigilo(boolean sigilo) {
		this.sigilo = sigilo;
	}


	public boolean isCazado() {
		return cazado;
	}


	public void setCazado(boolean cazado) {
		this.cazado = cazado;
	}


	public boolean isOcultado() {
		return ocultado;
	}


	public void setOcultado(boolean ocultado) {
		this.ocultado = ocultado;
	}
    public int getPosicion() {
	return posicion;
}


public void setPosicion(int posicion) {
	this.posicion = posicion;
}
}
