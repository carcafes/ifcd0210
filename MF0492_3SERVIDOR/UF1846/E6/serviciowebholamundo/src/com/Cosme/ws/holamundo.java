package com.Cosme.ws;
 
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 

@WebService
@SOAPBinding(style = Style.RPC)
public interface holamundo{
 
	@WebMethod String getHolaMundoAsString(String nombre);

}