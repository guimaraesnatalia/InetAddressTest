package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * $ mvn compile
 * $ java -cp target/classes br.ufs.dcomp.InetAddressTest.App 
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.google.com";
            InetAddress[] address = InetAddress.getAllByName(name); 
            System.out.println( "Name:      "+ name);
            for (int i=0 ; i<address.length; i++){
                System.out.println( "Address:   "+ address[i].getHostAddress());
            }
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
