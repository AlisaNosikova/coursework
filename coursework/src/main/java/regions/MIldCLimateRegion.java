package regions;



import bioms.MildClimate;
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
public class MildClimateRegion extends BaseRegion{
    private final MildClimate mildClimate;

    public MildClimateRegion() {
        this.mildClimate = new MildClimate() {};
        generateObjectsInterestList();
        for (ObjectInterest obj: getObjectsInterestList()){
            obj.generateInsideObjectsList();
        }
        
    }

    @Override
    protected ArrayList<Class<? extends ObjectInterest>> getPossibleObjectsInterestList() {
        return mildClimate.getPossibleObjectsInterestList();
    }

    @Override
    protected int getMinNumOfClasses() {
        return 3;
    }

    @Override
    protected int getMaxNumOfClasses() {
        return 5;
    }
    public static String getRegionType(){
        return "MildClimate";
    }
}