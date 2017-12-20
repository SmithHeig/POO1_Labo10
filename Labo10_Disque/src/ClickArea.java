
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class ClickArea extends JLabel{
    Dimension minSize;
    
    public ClickArea(Color color) {
        setBackground(color);
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.black));
        minSize = new Dimension(500,500);
        
    }
    
    public Dimension getMinimumSize(){
        return minSize;
    }
    
    public Dimension getPreferedSize(){
        return minSize;
    }
}
