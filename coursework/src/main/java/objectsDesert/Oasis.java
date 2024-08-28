/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsDesert;

import classes.ObjectInterest;
import static classes.InsideObjectType.*;

/**
 *
 * @author User
 */
public class Oasis extends ObjectInterest {

    public Oasis() {
        super(PALM_TREE, OLIVE_TREE, LAKE, PASTURE);
        this.isFireAllowed = true;
        this.isHouseBuildingAllowed = true;
    }

    @Override
    public String getObjectType() {
        return "Оазис";
    }
}
