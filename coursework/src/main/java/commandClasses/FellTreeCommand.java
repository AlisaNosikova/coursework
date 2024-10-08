/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandClasses;

import classes.ObjectInterest;
import classes.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class FellTreeCommand implements Command {

    private ActionResult actionResult = new ActionResult();

    @Override
    public ActionResult execute(ObjectInterest obj, Inventory inventory) {
        boolean approveStatus = obj.searchForTree();
        String message;
        if (approveStatus) {
            message = "Вы срубили дерево!";
            obj.removeFromInsideObjectsList(InsideObjectType.TREE);
            obj.addToInsideObjectsList(InsideObjectType.STUMP);
            inventory.addToInventory(1);
            actionResult.setStatus(true);
        } else {
            message = "Срубить дерево тут нельзя!";
            actionResult.setStatus(false);
        }
        actionResult.setMessage(message);
        actionResult.setObjectInterest(obj);
        return actionResult;
    }

    public static String getName() {
        return "Срубить дерево";
    }

    @Override
    public BufferedImage getImage() throws IOException {
        return ImageIO.read(new File("src\\main\\resources\\fellTree.png"));
    }

}
