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

public class Disque {
    private Point center;
    private double r;

    public Disque(int x, int y, double r) {
        Point center = new Point(x,y);
        this.r = r;
    }
    
    double getR(){
        return r;
    }
    
    Point getCenter(){
        return center;
    }
    
    void setR(double r){
        this.r = r;
    }
    
    void setCenter(Point center){
        this.center = center;
    }
}
