/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import classes.CommandManager;
import classes.Player;
import classes.RegionManager;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class MainGameFrame extends JFrame {

    public MainGameFrame(String title, CommandManager commandManager, Player player, RegionManager regionManager) throws IOException {
        super(title);
        setSize(800, 400);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(new MainGamePanel(commandManager, player, regionManager), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
