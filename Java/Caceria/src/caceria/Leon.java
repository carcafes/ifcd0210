/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caceria;


public class Leon extends Felino implements Depredador{
  int   posicion;
  int 	posGacela;
  int   esconderse;
  String textesconderse="";
  boolean cazando;
  boolean sigilo;
  boolean cazado;
  boolean ocultado;
  boolean gacelaPanico;
  
  
  
  public Leon(int posicion, int ocultarse ,boolean cazando,boolean ocultado,boolean cazado,boolean sigilo, boolean gacelapanico){
	  this.posicion = posicion;
	  this.cazando = cazando;
	  this.ocultado = ocultado;
	  this.cazado = cazado;
	  this.sigilo = sigilo;
	  this.gacelaPanico = gacelapanico;
	  
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
    	if(gacelaPanico == true) {posicion++;posicion++;}
    	else {posicion++;}
    }

    @Override
    public void Acechar() {
    	posicion++;
        
    }

    @Override
    public void Esconderse() {
    	if(esconderse > 0) {
    		sigilo = true;
    		ocultado = true;}
    	else {textesconderse="El leon se entretuvo mirando mariposas.";}
        
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


	public int getPosGacela() {
		return posGacela;
	}





	public void setPosGacela(int posGacela) {
		this.posGacela = posGacela;
	}





	public int getEsconderse() {
		return esconderse;
	}





	public void setEsconderse(int esconderse) {
		this.esconderse = esconderse;
	}





	public boolean isGacelaPanico() {
		return gacelaPanico;
	}





	public void setGacelaPanico(boolean gacelaPanico) {
		this.gacelaPanico = gacelaPanico;
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
