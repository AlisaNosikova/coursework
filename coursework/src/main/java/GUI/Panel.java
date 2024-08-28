package GUI;

import classes.CommandManager;
import classes.Player;
import classes.RegionManager;
import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.util.mxCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import org.jgrapht.Graph;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import regions.BaseRegion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Panel extends JPanel {

    private BufferedImage image;
    JButton startGame = new JButton("Начать игру");
    JLabel mainLabelPanel2;
    JLabel labelTundra;
    JLabel labelDesert;
    JLabel labelMildClimate;
    TextField countTundra;
    TextField countDesert;
    TextField countMildClimate;
    JButton goButton;
    RegionManager regionManager = new RegionManager();
    CommandManager commandManager = new CommandManager();
    Player player = new Player();

    public Panel() throws IOException {

        try {
            image = ImageIO.read(new File("C:\\Users\\User\\Documents\\GitHub\\coursework\\coursework\\src\\main\\resources\\background.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        startGame.setBackground(Color.getHSBColor(63, 224, 208));
        startGame.setPreferredSize(new Dimension(300, 100));
        startGame.setFont(new Font("Arial", Font.BOLD, 18));
        startGame.addActionListener(new startGameListener());
        add(startGame);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public class startGameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            removeAll();
            revalidate();
            repaint();
            mainLabelPanel2 = new JLabel("Добавьте регионы в свой мир!");
            labelTundra = new JLabel("Бескрайняя Тундра");
            labelDesert = new JLabel("Знойная Пустыня");
            labelMildClimate = new JLabel("Дремучий Смешанный Лес");
            countTundra = new TextField();
            countDesert = new TextField();
            countMildClimate = new TextField();
            goButton = new JButton("Погнали к приключениям!");
            goButton.addActionListener(new goButtonListener());
            countTundra.setBackground(Color.ORANGE);
            countDesert.setBackground(Color.ORANGE);
            countMildClimate.setBackground(Color.ORANGE);
            setLayout(new GridBagLayout());
            addComponentsPanel2();

        }
    }

    private void addComponentsPanel2() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        changeLabels(labelTundra);
        changeLabels(labelDesert);
        changeLabels(labelMildClimate);
        add(labelTundra, gbc);
        gbc.gridy++;
        add(labelDesert, gbc);
        gbc.gridy++;
        add(labelMildClimate, gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainLabelPanel2.setFont(new Font("Arial", Font.BOLD, 30));
        mainLabelPanel2.setForeground(Color.white);
        add(mainLabelPanel2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(countTundra, gbc);
        gbc.gridy++;
        add(countDesert, gbc);
        gbc.gridy++;
        add(countMildClimate, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        goButton.setForeground(Color.white);
        goButton.setFont(new Font("Arial", Font.BOLD, 15));
        goButton.setBackground(Color.ORANGE);
        add(goButton, gbc);

    }

    private void changeLabels(JLabel label) {
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setOpaque(true);
        label.setForeground(Color.white);
        label.setBackground(new Color(238, 130, 238));
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 4);
        label.setBorder(border);
    }

    public class goButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            removeAll();
            revalidate();
            repaint();
            try {
                regionManager.generateRegions(Integer.parseInt(countTundra.getText()), Integer.parseInt(countDesert.getText()), Integer.parseInt(countMildClimate.getText()));
            } catch (IOException ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
            player.setCurrentRegion(regionManager.getRegion(0));
            try {
                // FrameGraph frame = new FrameGraph("Карта мира", regionManager, player);
                MainGameFrame frame = new MainGameFrame("Главное меню", commandManager,  player, regionManager);
            } catch (IOException ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void createGraph() throws IOException {
        ArrayList<String> vertices = new ArrayList<>();
        for (BaseRegion region : regionManager.getRegions()) {
            vertices.add(region.getUniqueName());
        }
        System.out.println(vertices);
        File imgFile = new File("src/main/resources");
        imgFile.createNewFile();
        DefaultDirectedGraph<String, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);
        vertices.forEach(v -> g.addVertex(v));
        for (int i = 0; i < vertices.size() - 1; i++) {
            String v1 = vertices.get(i);

            String v2 = vertices.get(i + 1);
            g.addEdge(v1, v2);

        }
        g.addEdge(vertices.get(0), vertices.get(vertices.size() - 1));

        givenAdaptedGraph_whenWriteBufferedImage_thenFileShouldExist(g);

    }

    void givenAdaptedGraph_whenWriteBufferedImage_thenFileShouldExist(Graph g) throws IOException {

        JGraphXAdapter<String, DefaultEdge> graphAdapter
                = new JGraphXAdapter<String, DefaultEdge>(g);
        mxIGraphLayout layout = new mxCircleLayout(graphAdapter);
        layout.execute(graphAdapter.getDefaultParent());
        graphAdapter.removeCells();

        BufferedImage image
                = mxCellRenderer.createBufferedImage(graphAdapter, null, 4, Color.WHITE, true, null);
        File imgFile = new File("src/main/resources/graph.png");
        ImageIO.write(image, "PNG", imgFile);

    }

}
