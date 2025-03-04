package udp.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(9999);

            byte[] b1 = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b1, b1.length);
            ds.receive(dp);

            // Extract and process data
            String str = new String(dp.getData(), 0, dp.getLength());
            int num = Integer.parseInt(str.trim());
            int result = num * num;

            // Prepare and send response
            byte[] b2 = (result + "").getBytes();
            DatagramPacket dp1 = new DatagramPacket(b2, b2.length, dp.getAddress(), dp.getPort());
            ds.send(dp1);

            ds.close();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions properly
        }
    }
}
