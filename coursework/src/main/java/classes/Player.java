/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import commandClasses.*;
import java.util.ArrayList;
import regions.BaseRegion;

/**
 *
 * @author User
 */
public class Player {
    private Inventory inventory;
    private ArrayList<ActionResult> actionHistory;
    private BaseRegion currentRegion;
  //  private RegionChainManager = new RegionChainManager();
    
    public Inventory getInventory(){
        return inventory;
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
    public ActionResult makeAction(ObjectInterest obj,Inventory inventory, Command action){
        return action.execute(obj, inventory);
    }
    public void setCurrentRegion(BaseRegion region){
        this.currentRegion = region;
    }
    public BaseRegion getCurrentRegion(){
        return currentRegion;
    }
    public BaseRegion moveToRegion(){
        
        return null;
        
    }
}
