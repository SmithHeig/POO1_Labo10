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
import java.util.LinkedList;

public class JDisque extends JPanel implements MouseListener, MouseMotionListener {
    
    private static Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, 
                                    Color.BLACK, Color.MAGENTA };
    
    LinkedList disques = new LinkedList();
    Disque currentDisque;
    
    /**private static class Disque {

    }**/

    JDisque() {
        this.setBackground(Color.white);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public Dimension getPreferredSize() {
        return new Dimension(640, 480);
    }

    public void actionPerformed(ActionEvent e) {
        
    }

    public void run() {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int i = 0;
        for(Object o : disques){
            
            g.setColor(colors[i % colors.length]);
            Disque d = (Disque)o;
            g.fillOval(d.getCenter().x - (int)(d.getR()/2), d.getCenter().y - (int)(d.getR()/2), (int)d.getR(), (int)d.getR());
            i++;
        }
          
    }
    
    public void mouseExited(MouseEvent e){
        /** do nothing **/
    }
    
    public void	mousePressed(MouseEvent e){
        
        currentDisque = new Disque(e.getX(),e.getY(),0);
        System.out.print("Press :" + currentDisque);
        disques.add(currentDisque);
        this.repaint();
    }
    
    public void	mouseReleased(MouseEvent e){
        
        System.out.print("Release :" + currentDisque);
    }
    
    public void mouseDragged(MouseEvent e){
        
        double r = currentDisque.getCenter().distance(e.getPoint());
        
        System.out.print("Drag :" + currentDisque);
        
        currentDisque.setR(2*r);
        this.repaint();
    }
    
    public void mouseEntered(MouseEvent e){}
    
    public void mouseClicked(MouseEvent e){}
    
    public void mouseMoved(MouseEvent e) { }

}