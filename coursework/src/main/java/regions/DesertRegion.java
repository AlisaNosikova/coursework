package regions;


import bioms.Desert;
import classes.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class DesertRegion extends BaseRegion {
    private final Desert desert;

    public DesertRegion() {
        this.desert = new Desert() {};
        generateObjectsInterestList();
        for (ObjectInterest obj: getObjectsInterestList()){
            obj.generateInsideObjectsList();
        }
    }

    @Override
    protected ArrayList<Class<? extends ObjectInterest>> getPossibleObjectsInterestList() {
        return desert.getPossibleObjectsInterestList();
    }

    @Override
    protected int getMinNumOfClasses() {
        return 2;
    }

    @Override
    protected int getMaxNumOfClasses() {
        return 4;
    }
    public static String getRegionType(){
        return "Desert";
    }
    
}
