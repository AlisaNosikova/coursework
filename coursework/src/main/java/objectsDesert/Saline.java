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
public class Saline extends ObjectInterest {

    public Saline() {
        super(LAKE, BUSH, CACTUS, HALOPHYTE);
        this.isFireAllowed = true;
        this.isHouseBuildingAllowed = false;
    }

    @Override
    public String getObjectType() {
        return "Солончак";
    }

}
