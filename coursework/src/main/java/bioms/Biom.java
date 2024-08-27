/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bioms;

import classes.ObjectInterest;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
public abstract class Biom {

    private final ArrayList<Class<? extends ObjectInterest>> possibleObjectsInterestList = new ArrayList<>();

    protected Biom(Class<? extends ObjectInterest>... classes) {
        possibleObjectsInterestList.addAll(Arrays.asList(classes));
    }

    public ArrayList<Class<? extends ObjectInterest>> getPossibleObjectsInterestList() {
        return possibleObjectsInterestList;
    }
}
