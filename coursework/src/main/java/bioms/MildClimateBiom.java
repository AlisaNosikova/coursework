/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioms;

import java.util.ArrayList;
import objectsMildClimate.*;


/**
 *
 * @author User
 */
public abstract class MildClimateBiom implements Biom {
    ArrayList<Class<?>> possibleObjectsInterestList = new ArrayList<>();
    public MildClimateBiom(){
        possibleObjectsInterestList.add(Forest.class);
        possibleObjectsInterestList.add(Meadow.class);
        possibleObjectsInterestList.add(Mountain.class);
        possibleObjectsInterestList.add(Swamp.class);
        possibleObjectsInterestList.add(Village.class);
}
}
