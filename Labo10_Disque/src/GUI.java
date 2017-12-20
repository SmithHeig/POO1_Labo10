/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI {
    public GUI(){
        final JDisque disque = new JDisque();
        ClickArea clickArea = new ClickArea(Color.white);
        
        JFrame frame = new JFrame("Disque");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(disque, BorderLayout.CENTER);
        frame.addMouseListener(disque);

        JPanel south = new JPanel();
        south.setLayout(new GridLayout(0, 1));
        frame.getContentPane().add(south, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(); // to avoid button resizing
        south.add(buttonPanel);

        final JButton clear = new JButton("Clear");
        final JButton quit = new JButton("Quit");
        buttonPanel.add(clear);
        buttonPanel.add(quit);
        

        frame.pack();
        frame.setVisible(true);
        
        //clear.addActionListner(/**to Do**/);
        //quit.addActionListner(/** to do **/);
    }
}
