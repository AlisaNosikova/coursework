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
public class Swamp extends ObjectInterest {
    private boolean isFireAllowed=false;
    private boolean isHouseBuildingAllowed=false;
    private boolean isTreeFellingAllowed=true;
     public Swamp(){
         super(TREE, BUSH);
     }
    
}
