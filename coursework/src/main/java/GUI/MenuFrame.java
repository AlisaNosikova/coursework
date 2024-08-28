/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import classes.Player;
import classes.RegionManager;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class MenuFrame extends JFrame{
     public MenuFrame(String title, RegionManager regionManager, Player player) throws IOException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MenuPanel(regionManager, player));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
