/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsMildClimate;

import classes.ObjectInterest;
import static classes.InsideObjectType.*;

/**
 *
 * @author User
 */
public class Forest extends ObjectInterest {

    public Forest() {
        super(TREE, BEAR, FLOWERS, BUSH, HARE, MOOSE);
        this.isFireAllowed = true;
        this.isHouseBuildingAllowed = true;
    }

    @Override
    public String getObjectType() {
        return "Лес";
    }

}
