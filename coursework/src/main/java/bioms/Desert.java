/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioms;

import java.util.ArrayList;
import objectsDesert.*;

/**
 *
 * @author User
 */
public abstract class Desert implements Biom {
    ArrayList<Class<?>> possibleObjectsInterestList = new ArrayList<>();
    public Desert(){
        possibleObjectsInterestList.add(Gorge.class);
        possibleObjectsInterestList.add(Oasis.class);
        possibleObjectsInterestList.add(PyramidRuins.class);
        possibleObjectsInterestList.add(Saline.class);
}
}
