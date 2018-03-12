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
public class Client 
{
    public static DatagramSocket ClientSocket;
    public static DatagramPacket dataPacket;
    public static BufferedReader dataInput;
    public static InetAddress addr;
    public static int CPORT = 3000, SPORT = 2000;
    public static byte buf[] = new byte[1024];
    public static String ServerIP = "10.0.0.86";
    
    public Client () throws IOException
    {
        //Creates ClientSocket
        //Creates dataPacket
        //Creates dataInput
        
        ClientSocket = new DatagramSocket(CPORT);
        dataPacket = new DatagramPacket(buf, buf.length);
        dataInput = new BufferedReader(new InputStreamReader(System.in));
        addr = InetAddress.getByName(ServerIP);
        
        //addr = InetAddress.getLocalHost();
        System.out.println("Client is Running. Enter 'Stop' to quit.");
        while(true)
        {
            String str = new String(dataInput.readLine());
            buff = str.getBytes();
            if(str.equals("Stop"))
            {
                System.out.println("Finished");
                ClientSocket.send(new DatagramPacket(buf,str.length(), addr, SPORT));
                break;
            }//end of if loop 
            ClientSocket.send(new DatagramPacket(buf,str.length(),addr, SPORT));
            ClientSocket.receive(dataPacket);
            String str2 = new String(dataPacket.getData(), 0,dataPacket.getLength());
            System.out.println("Server: " + str2);
        }//end of while loop    
    }        
}

