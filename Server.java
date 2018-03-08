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
    public static byte buff[] = new byte [1024];
    public static int CPORT = 3000, SPORT = 2000;
    
    public Server () throws IOException
    {
        //Creates DatagramSocket
        //Creates DatagramPacket
        //Creates BufferedReader
        ServerSocket = new DatagramSocket(SPORT);
        dataPacket = new DatagramPacket(buff,buff.length);
        dataInput = new BufferedReader(new InputStreamReader(System.in));
        
        //begin InetAddress
        addr = InetAddress.getLocalHost();
        System.out.println("Server is running");
        System.out.println("Port Number:\t" + SPORT);
        System.out.println("IP Address:\t" + addr);
        
        //receive dataPacket to ServerSocket
        //Get the IP Address
        //Messages from the packet will be turned into strings
        while(true)
        {
            ServerSocket.receive(dataPacket);
            addr = dataPacket.getAddress();
            
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
