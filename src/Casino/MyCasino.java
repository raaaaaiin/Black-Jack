/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Casino;

/**
 *
 * @author Filmosh
 */
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MyCasino extends JFrame{
    public static void main(String[] args) {
        Register first = new Register();
        first.getContentPane().requestFocusInWindow();
        first.setVisible(true);
    }  
}
