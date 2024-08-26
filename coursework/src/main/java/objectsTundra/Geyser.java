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
public class Geyser extends ObjectInterest{
    private boolean isFireAllowed=false;
    private boolean isHouseBuildingAllowed=false;
    private boolean isTreeFellingAllowed=false;
    public Geyser(){
        super(HILL, THERMAL_POOL,STREAM);
    }
    
}
