package udp.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds = new DatagramSocket();
        int i = 8 ;
        byte[] b = (i+"").getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b,b.length,ia,9999);
        ds.send(dp);
    }
}
