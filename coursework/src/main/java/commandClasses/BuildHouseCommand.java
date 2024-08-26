/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandClasses;

import classes.Inventory;
import classes.ObjectInterest;
import classes.Player;

/**
 *
 * @author User
 */
public class BuildHouseCommand implements Command {
    private ActionResult actionResult= new ActionResult();
    @Override
    public ActionResult execute(ObjectInterest obj, Inventory inventory) {
       boolean approveStatus = obj.getHouseBuildingAllowedStatus();
       if (approveStatus && checkResources(10,inventory)){
           actionResult.setMessage("Вы построили дерево!");
           actionResult.setStatus(true);
       }
       else{
           if(!checkResources(10,inventory)){
               actionResult.setMessage("У вас недостаточно ресурсов!");
           }
           actionResult.setMessage("Построить дом в этом месте нельзя!");
           actionResult.setStatus(false);
       }
       actionResult.setObjectInerest(obj);
       return actionResult;
    }
    @Override
    public String getName(){
      return "Построить дерево";
    }

}
