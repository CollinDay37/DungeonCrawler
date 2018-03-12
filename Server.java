/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.net.*;
import java.io.*;
/**
 *
 * @author adbonaro
 */
public class Server 
{
    public static DatagramSocket ServerSocket;
    public static DatagramPacket dataPacket;
    public static BufferedReader dataInput;
    public static InetAddress addr;
    public static byte buf[] = new byte [1024];
    public static int CPORT = 3000, SPORT = 2000;
    
    public Server () throws IOException
    {
        //Creates DatagramSocket
        //Creates DatagramPacket
        //Creates BufferedReader
        ServerSocket = new DatagramSocket(SPORT);
        
        try (
        socket clientSocket = serverSocket.accept();
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            )
        DatagramPacket = new DatagramPacket(buf,buf.length);
        socket.receive(packet);
      
        
        //begin InetAddress
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        packet = new DatagramPacket(buf, buf.length, address, port);
        socket.send(packet);
        System.out.println("IP Address:\t" + addr);
        
        //receive dataPacket to ServerSocket
        //Get the IP Address
        //Messages from the packet will be turned into strings
        while(true)
        {
            packet = new DatagramPacket(buf, buf.length);
            ServerSocket.receive(dataPacket);
            String received = new String(packet.getData(), 0 ,packet.getLength());
            System.out.println("packet:" + received); 
            
            String str = new String(dataPacket.getData(), 0, dataPacket.getLength()).trim();
            if(str.equals("Stop"))
            {
                System.out.println("Finished");
                break;
            }//end of if loop
            System.out.println("Client: " + str);
            String str1 = dataInput.readLine();
            buff = str1.getBytes();
            ServerSocket.send(new DatagramPacket(buff, str1.length(), addr, CPORT));
        }//end of while loop
    }
}        
