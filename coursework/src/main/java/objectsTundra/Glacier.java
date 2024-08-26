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
    private boolean isFireAllowed=false;
    private boolean isHouseBuildingAllowed=false;
    private boolean isTreeFellingAllowed=false;
     public Glacier(){
         super(CAVE,POLAR_BEAR, SNOW_DUNE);
     }
}
