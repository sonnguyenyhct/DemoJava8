package socketdemo;

import java.io.IOException;
import java.net.*;

public class MulticastSender {
    public static final String GROUP_ADDRESS = "244.0.0.1";
    public static final int PORT = 8888;

    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            InetAddress address = InetAddress.getByName(GROUP_ADDRESS);
            socket = new DatagramSocket();
            DatagramPacket outPacket = null;
            long counter = 0;
            while(true){
                String msg = "Send message No. " + counter;
                counter++;
                outPacket = new DatagramPacket(msg.getBytes(), msg.getBytes().length,address,PORT);
                socket.send(outPacket);
                System.out.println("Server sent packet with msg: " + msg);
                Thread.sleep(1000);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (socket != null){
                socket.close();
            }
        }
    }

}
