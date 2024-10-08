/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsTundra;

import static classes.InsideObjectType.*;
import classes.ObjectInterest;

/**
 *
 * @author User
 */
public class Geyser extends ObjectInterest {

    public Geyser() {
        super(HILL, THERMAL_POOL, STREAM);
        this.isFireAllowed = false;
        this.isHouseBuildingAllowed = false;
    }

    @Override
    public String getObjectType() {
        return "Гейзер";
    }

}
