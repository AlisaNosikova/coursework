/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandClasses;

import classes.ObjectInterest;
import classes.*;

/**
 *
 * @author User
 */
public class FellTreeCommand implements Command {
    private ActionResult actionResult= new ActionResult();
    @Override
    public ActionResult execute(ObjectInterest obj, Inventory inventory) {
       boolean approveStatus = obj.getHouseBuildingAllowedStatus();
       if (approveStatus){
           actionResult.setMessage("Вы срубили дерево!");
           obj.removeFromInsideObjectsList(InsideObjectType.HOUSE);
           inventory.addToInventory(1);
           actionResult.setStatus(true);
       }
       else{
           actionResult.setMessage("Срубить дерево тут нельзя!");
           actionResult.setStatus(false);
       }
       actionResult.setObjectInerest(obj);
       return actionResult;
    }
    @Override
    public String getName(){
      return "Срубить дерево";
    }
}
