/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FrameGraph  extends JFrame{
     public FrameGraph(String title) throws IOException{
        super(title);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      
        GraphPanel panel = new GraphPanel();
        Container con= this.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
