/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tft;

import javax.swing.JFrame;

/**
 *
 * @author Chris
 */
public class TFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.setVisible(true);
        client.setSize(300, 220);
        client.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    
}
