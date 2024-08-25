/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandClasses;

import classes.ObjectInterest;
import classes.Player;

/**
 *
 * @author User
 */
public class FellTreeCommand implements Command {
    private ActionResult actionResult= new ActionResult();
    private Player player;
    @Override
    public ActionResult execute(ObjectInterest obj, Player player) {
       this.player = player;
       boolean approveStatus = obj.getHouseBuildingAllowedStatus();
       if (approveStatus == true){
           actionResult.setMessage("Вы срубили дерево!");
           player.getInventory().addToInventory(1);
           actionResult.setStatus(true);
       }
       else{
           actionResult.setMessage("Срубить дерево тут нельзя!");
           actionResult.setStatus(false);
       }
       actionResult.setObjectInerest(obj);
       return actionResult;
    }
}
