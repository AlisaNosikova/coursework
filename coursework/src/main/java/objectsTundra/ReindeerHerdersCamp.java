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
public class ReindeerHerdersCamp extends ObjectInterest {  
    private boolean isFireAllowed=true;
    private boolean isHouseBuildingAllowed=false;
    private boolean isTreeFellingAllowed=true;
     public ReindeerHerdersCamp(){
         super(REINDEER,REINDEER_HERDER,TENT, TREE);
     }
             
    
}
