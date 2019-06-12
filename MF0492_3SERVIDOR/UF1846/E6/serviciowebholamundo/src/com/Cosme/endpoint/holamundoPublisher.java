package com.Cosme.endpoint;

import javax.xml.ws.Endpoint;
import com.Cosme.ws.holamundoimpl;

//Endpoint publisher
public class holamundoPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hola", new holamundoimpl());
    }
	
}