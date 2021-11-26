package dpdev.socket;

import java.io.IOException;
import java.net.*;

public class DatagramRunner {
    public static void main(String[] args) throws IOException {

        var inetAdress = InetAddress.getByName("localhost");
        try(var datagramSocket = new DatagramSocket()) {
            var bytes = "Hello from UDP client.".getBytes();
            var datagramPacket = new DatagramPacket(bytes, bytes.length, inetAdress, 7777);
            datagramSocket.send(datagramPacket);
        }
    }
}
