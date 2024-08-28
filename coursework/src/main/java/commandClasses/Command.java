/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package commandClasses;

import classes.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author User
 */
public interface Command {

    ActionResult execute(ObjectInterest objectInterest, Inventory inventory);

    default boolean checkResources(int numLogs, Inventory inventory) {
        return (inventory.getNumLogs() >= numLogs);
    }
     BufferedImage getImage() throws IOException;
}
