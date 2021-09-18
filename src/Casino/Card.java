/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Reyn
 */
public class Card extends JPanel {

    private JPanel form;
    private int wForm;
    private int hForm;
    boolean asd = true;
    public Card(JPanel form){
      this.form = form;
        wForm = form.getWidth();
        hForm = form.getHeight();
      
    }
    
    public void DrawImage(int x, int y, String path){
        JPanel pnl;
        pnl = new JPanel(){
            File imgFile;
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                
                Path inputPath = Paths.get("src");
                Path fullPath = inputPath.toAbsolutePath();
                
                try{imgFile = new File(inputPath.toString()+"\\Resources\\"+path);}catch(Exception ex){System.out.println(ex.toString());}
                
                try{
                    Image img = ImageIO.read(imgFile);
                    g2.drawImage(img,x,y,80,100,form);
                    
                    
                }catch(Exception ex){
                    
                }
                
            }
        };
        
       form.add(pnl,0);
       pnl.setBounds(0,0,wForm,hForm);
       
       
    
    }  
    
}

    /*public void move(from position, to players position){
        while not in the player position
                move;
                pag nandon na stop
                        
        
    }
    
    card[] asd = new card[5];
    for (int i = 0 ; i < 5; i++){
    card[i].clear
            
            
    public void clear(){
        
    }*/
    
   
   
    
     

