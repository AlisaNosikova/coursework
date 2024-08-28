/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


import classes.ObjectInterest;
import classes.Player;
import classes.RegionManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author User
 */
public class MenuPanel extends JPanel {

    private BufferedImage image;
    private JButton map = new JButton("Карта мира");
    private JButton inventory = new JButton("Инвентарь");
    List<String> namesOI;
    RegionManager manager;
    Player player;
    JList<String> list = new JList();
    JTextArea area = new JTextArea();
    JLabel label;
    public MenuPanel(RegionManager manager, Player player) throws IOException {
        this.player = player;
        try {
            image = player.getCurrentRegion().getImage();
            setPreferredSize(new Dimension(image.getWidth() / 2, image.getHeight() / 2));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        map.setBackground(Color.WHITE);
        inventory.setBackground(Color.WHITE);
        add(map);
        add(inventory);
        makeList();
        add(area);
        label = new JLabel("Ваш регион: "+ player.getCurrentRegion().getUniqueName());
        label.setFont(new Font("Arial", Font.BOLD, 35));
        label.setForeground(Color.white);
        add(label);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }

    protected void makeList() {
        DefaultListModel<String> dlm = new DefaultListModel<String>();
        for (ObjectInterest obj : player.getCurrentRegion().getObjectsInterestList()) {
            dlm.add(0, obj.getObjectType());
        }
        list = new JList<String>(dlm);
        add(new JScrollPane(list));
        area.setColumns(5);
        System.out.println(list.getSelectedValue());
        area.setText(list.getSelectedValue());
     
     list.addListSelectionListener(new listSelectionListener());
        // Подключение слушателя мыши
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    area.setText(list.getSelectedValue());
            }
        });
    }
   class listSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
           
    }
}

