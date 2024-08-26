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
public class Gorge extends ObjectInterest {
    public Gorge(){
        super(STREAM, BOULDER, CACTUS);
        this.isFireAllowed=true;
        this.isHouseBuildingAllowed=false;
        this.isTreeFellingAllowed=true;
    }
    
}
