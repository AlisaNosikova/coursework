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
    private boolean isFireAllowed=true;
    private boolean isHouseBuildingAllowed=true;
    private boolean isTreeFellingAllowed=true;
    public Forest(){
        super(TREE, BEAR, FLOWERS, BUSH, HARE, MOOSE);
    }
    
}
