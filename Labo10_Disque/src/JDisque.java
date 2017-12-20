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
        setBackground(Color.WHITE);
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
        
        Graphics2D g2D = (Graphics2D) g;

        for(Object o : disques){
            System.out.println("disque");
            Disque d = (Disque) o;
            g2D.fillOval(d.getCenter().x, d.getCenter().y, (int)d.getR(), (int)d.getR());
        }
          
    }
    
    public void mouseExited(MouseEvent e){
        /** do nothing **/
    }
    
    public void	mousePressed(MouseEvent e){
        
        currentDisque = new Disque(e.getX(),e.getY(),0);
        disques.add(currentDisque);
        this.update(this.getGraphics());
    }
    
    public void	mouseReleased(MouseEvent e){
        
        this.update(this.getGraphics());
    }
    
    public void mouseDragged(MouseEvent e){
        currentDisque = (Disque)disques.getFirst();
        Point centerPos = currentDisque.getCenter();
        Point mousePos = new Point(e.getX(), e.getY());
        double r = centerPos.distance(mousePos);
        currentDisque.setR(r);
        this.update(this.getGraphics());
    }
    
    public void mouseEntered(MouseEvent e){}
    
    public void mouseClicked(MouseEvent e){}
    
    public void mouseMoved(MouseEvent e) {}

}