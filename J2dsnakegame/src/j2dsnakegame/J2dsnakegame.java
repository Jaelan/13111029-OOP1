/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2dsnakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class J2dsnakegame extends JFrame {

    
    public J2dsnakegame() {
            add(new Board());
            setResizable(false);
            pack();
            setTitle("Snake");
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
        @Override
            public void run() {
               JFrame ex = new J2dsnakegame();
               ex.setVisible(true);
          
             }
    });
  }
    
}
