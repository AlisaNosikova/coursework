/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class Inventory {

    private int numLogs;

    public Inventory(int numLogs) {
        this.numLogs = numLogs;
    }

    public void addToInventory(int countLogs) {
        numLogs += countLogs;
    }

    public void useInventory(int countLogs) {
        numLogs -= countLogs;
    }

    public int getNumLogs() {
        return numLogs;
    }
    public BufferedImage getImage() throws IOException {
           return ImageIO.read(new File("C:\\Users\\User\\Documents\\GitHub\\coursework\\coursework\\src\\main\\resources\\inventory.jpg"));
    }
     
}
