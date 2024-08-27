/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsTundra;

import classes.ObjectInterest;
import static classes.InsideObjectType.*;

/**
 *
 * @author User
 */
public class Glacier extends ObjectInterest {

    public Glacier() {
        super(CAVE, POLAR_BEAR, SNOW_DUNE);
        this.isFireAllowed = false;
        this.isHouseBuildingAllowed = false;
    }
    @Override
    public String getObjectType() {
        return "Ледник";
    }
}
