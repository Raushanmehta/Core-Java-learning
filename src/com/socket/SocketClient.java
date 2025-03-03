package com.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws Exception
    {
        String ip = "localhost";
        int port = 9999; //0-1013 to 65535;
        Socket s = new Socket(ip, port);

        String str = "Rahul Raj";
        PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        out.println(str);
        out.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String nickName = br.readLine();

        System.out.println("C : Data from Server" + nickName);


    }
}
