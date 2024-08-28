/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import classes.Player;
import classes.RegionManager;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FrameGraph extends JFrame {

    public FrameGraph(String title, RegionManager regionManager, Player player) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new WorldMapPanel(regionManager, player));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}