package regions;



import bioms.MildClimate;
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
        this.mildClimate = new MildClimate() {
        };
    }

    @Override
    protected ArrayList<Class<?>> getPossibleObjectsInterestList() {
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
}