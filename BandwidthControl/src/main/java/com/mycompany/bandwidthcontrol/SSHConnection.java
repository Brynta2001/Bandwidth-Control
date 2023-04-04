/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bandwidthcontrol;

import com.jcraft.jsch.JSchException;
import java.io.IOException;

/**
 *
 * @author brynt
 */
public class SSHConnection {
    private static final String USERNAME = "admin";
    private static final String HOST = "192.168.200.2";
    private static final int PORT = 22;
    private static final String PASSWORD = "dpmUni65";
 
    public static void main(String[] args) throws IOException {
 
        try {
            SSHConnector sshConnector = new SSHConnector();
             
             
            sshConnector.connect(USERNAME, PASSWORD, HOST, PORT);
            //sshConnector.executeCommand("enable");
            //sshConnector.executeCommand("config");
            System.out.println("Hola");
            String result = sshConnector.executeCommand("show board");
            sshConnector.disconnect();
             
            System.out.println(result);
        } catch (JSchException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        }
    }
}
