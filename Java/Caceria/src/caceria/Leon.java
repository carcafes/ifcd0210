/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caceria;


public class Leon extends Felino implements Depredador{
  int  posicion;
  boolean cazando;
  boolean sigilo;
  boolean cazado;
  boolean ocultado;
  
  public Leon(int posicion,boolean cazando,boolean ocultado,boolean cazado){
  }
  




	@Override
    public void Cazar() {
    	if(Gacela.getPosicion() - Leon.getPosicion() <= 1) cazado=true;
        
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
    	sigilo = true;
    	ocultado = true;
        
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
