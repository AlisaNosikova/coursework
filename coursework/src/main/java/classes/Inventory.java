/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

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
}
