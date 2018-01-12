/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author laris_000
 */
public class Servidor {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) throws IOException {
      // TODO code application logic here
      ServerSocket s = new ServerSocket(4444);
      Socket ns = s.accept();
      DataInputStream in = new DataInputStream(ns.getInputStream());
      DataOutputStream out = new DataOutputStream(ns.getOutputStream());
      
      System.out.println(in.readUTF());
      out.writeUTF("Ola Cliente");
      
      in.close();
      out.close();
      ns.close();
      s.close();
   }
   
}
