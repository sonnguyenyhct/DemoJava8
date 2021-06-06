package socketdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class EchoServer {
    public final static int SERVER_PORT = 7;
    public final static byte[] BUFFER = new byte[4096];
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            System.out.println("Binding to port" + SERVER_PORT);
            ds = new DatagramSocket(SERVER_PORT);
            System.out.println("Server Started");
            System.out.println("Waiting for message from Client");
            while (true){
                DatagramPacket incoming = new DatagramPacket(BUFFER,BUFFER.length);
                ds.receive(incoming);
                String message = new String(incoming.getData(),0,incoming.getLength());
                System.out.println("Received " + message);
                DatagramPacket outsending = new DatagramPacket(message.getBytes(),incoming.getLength(),incoming.getAddress(),incoming.getPort());
                ds.send(outsending);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ds != null){
                ds.close();
            }
        }
    }
}
