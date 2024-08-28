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
public class WorldMapFrame extends JFrame {

    public WorldMapFrame(String title, RegionManager regionManager, Player player) {
        super(title);
        add(new WorldMapPanel(regionManager, player));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
