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
public class PyramidRuins extends ObjectInterest {

    public PyramidRuins() {
        super(PYRAMID, TOMB);
        this.isFireAllowed = true;
        this.isHouseBuildingAllowed = false;

    }

    @Override
    public String getObjectType() {
        return "Руины пирамид";
    }

}
