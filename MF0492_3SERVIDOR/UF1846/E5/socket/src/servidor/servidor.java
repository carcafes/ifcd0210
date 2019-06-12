package servidor;



import java.net.*;
import java.io.*;
import java.util.Scanner;


public class servidor {

    private Socket socket;
    private ServerSocket serverSocket;
    private DataInputStream bufferDeEntrada = null;
    private DataOutputStream bufferDeSalida = null;
    Scanner escaner = new Scanner(System.in);
    final String COMANDO_TERMINACION = "salir()";

    public void crearConeccion(int puerto) {
        try {
            serverSocket = new ServerSocket(puerto);
            mostrarTexto("Esperando conexión entrante en el puerto " + String.valueOf(puerto) + "...");
            socket = serverSocket.accept();
            mostrarTexto("Conexión establecida con: " + socket.getInetAddress().getHostName() + "\n\n\n");
        } catch (Exception e) {
            mostrarTexto("Error en crearConeccion(): " + e.getMessage());
            System.exit(0);
        }
    }
    public void flujos() {
        try {
            bufferDeEntrada = new DataInputStream(socket.getInputStream());
            bufferDeSalida = new DataOutputStream(socket.getOutputStream());
            bufferDeSalida.flush();
        } catch (IOException e) {
            mostrarTexto("Error en la apertura de flujos");
        }
    }

    public void recibirDatos() {
        String st = "";
        try {
            do {
                st = (String) bufferDeEntrada.readUTF();
                mostrarTexto("\n[Cliente] => " + st);
                System.out.print("\n[Usted] => ");
            } while (!st.equals(COMANDO_TERMINACION));
        } catch (IOException e) {
            cerrarConeccion();
        }
    }


    public void enviar(String s) {
        try {
            bufferDeSalida.writeUTF(s);
            bufferDeSalida.flush();
        } catch (IOException e) {
            mostrarTexto("Error en enviar(): " + e.getMessage());
        }
    }

    public static void mostrarTexto(String s) {
        System.out.print(s);
    }

    public void escribirDatos() {
        while (true) {
            System.out.print("[Usted] => ");
            enviar(escaner.nextLine());   
        }
    }

    public void cerrarConeccion() {
        try {
            bufferDeEntrada.close();
            bufferDeSalida.close();
            socket.close();
        } catch (IOException e) {
          mostrarTexto("Excepción en cerrarConeccion(): " + e.getMessage());
        } finally {
            mostrarTexto("Conversación finalizada....");
            System.exit(0);

        }
    }

    public void ejecutarConeccion(int puerto) {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        crearConeccion(puerto);
                        flujos();
                        recibirDatos();
                    } finally {
                        cerrarConeccion();
                    }
                }
            }
        });
        hilo.start();
    }

    public static void main(String[] args) throws IOException {
        servidor s = new servidor();
        Scanner sc = new Scanner(System.in);

        mostrarTexto("Ingresa el puerto [5050 por defecto]: ");
        String puerto = sc.nextLine();
        if (puerto.length() <= 0) puerto = "5050";
        s.ejecutarConeccion(Integer.parseInt(puerto));
        s.escribirDatos();
    }
}