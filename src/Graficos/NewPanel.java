/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class NewPanel extends JPanel implements ActionListener, MouseListener{
    //private final int initial_X=
    int x=0;
    int k= 150;
    int y = 20;
    private Timer timer;
    private int Delay= 20;
    private final Color color;
    
    public NewPanel(){
        timer= new Timer(Delay,this);
        this.addMouseListener(this);
        this.color= Color.ANTIQUEWHITE;
        timer.start();
        
    }
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        Image fondo = cargarImagen("fondo.png");
        g.drawImage(fondo, 0, 0,null);
                
        g.drawString("Puntos",600,30);
        g.drawString(": xxx",650,30);
        
        g.drawString("01",x+25,340);
        g.setColor(java.awt.Color.GRAY);
        g.fillOval(x+30,380, 30, 30);
        g.drawOval(x+100,380, 30, 30);
        g.drawRect(x+20,320, 120, 60);
        g.drawRect(x+110, 335, 60, 10);
        g.drawOval((x+k)+y+90,80, 30, 30);
        g.drawRect((x+k), y+60, 15,30);
        g.drawOval(400,351, 56, 56);
        
 
    }
    
    public void detectarcolisionnes(){
        Rectangle tanque = getBounds();
        Rectangle objeto= new Rectangle(400,351, 56, 56);
        if(tanque.intersects(objeto)){
            timer.stop();
        }
    }
            

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 1;
        //y += 1;
        detectarcolisionnes();
        repaint();
    }
   
    public Rectangle getBounds(){
        //Dimension del carro
        return new Rectangle(x+20,320, 120, 60);
    }
   
    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp = e.getPoint();
        if(getBounds().contains(mp)){
            this.timer.stop();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

    public Image cargarImagen(String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
}
