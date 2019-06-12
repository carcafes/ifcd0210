package com.Cosme.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.Cosme.ws.holamundo;

public class holamundoClient{
	
	public static void main(String[] args) throws Exception {
	   
	URL url = new URL("http://localhost:9999/ws/hola?wsdl");
	
        QName qnombre = new QName("http://ws.Cosme.com/", "holamundoimplService");

        Service service = Service.create(url, qnombre);

        holamundo hola = service.getPort(holamundo.class);

        System.out.println(hola.getHolaMundoAsString("Cosme"));

    }

}