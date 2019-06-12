package com.Cosme.ws;

import javax.jws.WebService;


@WebService(endpointInterface = "com.Cosme.ws.holamundo")
public class holamundoimpl implements holamundo{
	
	 
		@Override
		public String getHolaMundoAsString(String nombre) {
			return "Hola Mundo JAX-WS " + nombre;
		}
	 
	}

