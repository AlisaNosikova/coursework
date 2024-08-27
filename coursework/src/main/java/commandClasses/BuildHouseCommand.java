/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandClasses;

import classes.InsideObjectType;
import classes.Inventory;
import classes.ObjectInterest;

/**
 *
 * @author User
 */
public class BuildHouseCommand implements Command {

    private ActionResult actionResult = new ActionResult();

    @Override
    public ActionResult execute(ObjectInterest obj, Inventory inventory) {
        boolean approveStatus = obj.getHouseBuildingAllowedStatus();
        String message;
        if (approveStatus && checkResources(10, inventory)) {
            obj.addToInsideObjectsList(InsideObjectType.HOUSE);
            message = "Вы построили дом!";
            inventory.useInventory(10);
            actionResult.setStatus(true);
        } else {
            if (!approveStatus) {
                message = "Построить дом в этом месте нельзя!";
            } else {
                message = "У вас недостаточно ресурсов!";
            }
            actionResult.setStatus(false);
        }
        actionResult.setMessage(message);
        actionResult.setObjectInerest(obj);
        return actionResult;
    }

    @Override
    public String getName() {
        return "Построить дом";
    }

}
