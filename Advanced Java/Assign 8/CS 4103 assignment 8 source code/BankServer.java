import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.net.*;

/**
   A server that executes the Simple Bank Access Protocol.
*/
public class BankServer
{  
   public static void main(String[] args) throws IOException
   {  
      final int ACCOUNTS_LENGTH = 10;
      Bank bank = new Bank(ACCOUNTS_LENGTH);
      final int SBAP_PORT = 8888;
      ServerSocket server = new ServerSocket(SBAP_PORT);
      server.setReuseAddress(true);
      System.out.println("Waiting for clients to connect...");
      
      while (true)
      {
         Socket s = server.accept();
         System.out.println("Client connected." + s.getInetAddress().getHostAddress());
         ClientHandler clientSock = new ClientHandler(s);
         BankService service = new BankService(s, bank);
         Thread t = new Thread(service);
         t.start();
      }
      
   }
   // ClientHandler class
    private static class ClientHandler implements Runnable {
      private final Socket clientSocket;
   
         // Constructor
         public ClientHandler(Socket socket)
         {
             this.clientSocket = socket;
         }
   
         public void run()
         {
             PrintWriter out = null;
             BufferedReader in = null;
             try {
                     
                   // get the outputstream of client
                 out = new PrintWriter(
                     clientSocket.getOutputStream(), true);
   
                   // get the inputstream of client
                 in = new BufferedReader(
                     new InputStreamReader(
                         clientSocket.getInputStream()));
   
                 String line;
                 while ((line = in.readLine()) != null) {
   
                     // writing the received message from
                     // client
                     System.out.printf(
                         " Sent from the client: %s\n",
                         line);
                     out.println(line);
                 }
             }
             catch (IOException e) {
                 e.printStackTrace();
             }
             finally {
                 try {
                     if (out != null) {
                         out.close();
                     }
                     if (in != null) {
                         in.close();
                         clientSocket.close();
                     }
                 }
                 catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         }
     }
 }









