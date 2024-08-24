/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import commandClasses.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Player {
    private Inventory inventory;
    private ArrayList<ActionResult> actionHistory;
    private Command buildHouseAction;
    
    public int getInventory(){
        return inventory.getNumLogs();
    }
    public ArrayList<ActionResult> getActionList(){
        return actionHistory;
    }
    public void setInventory(Inventory invent){
        this.inventory = invent;
    }
    public void setActionList(ArrayList<ActionResult> history){
        this.actionHistory = history;
    }
    public ActionResult buildHouse(ObjectInterest obj){
        return buildHouseAction.execute(obj);
    }
}
