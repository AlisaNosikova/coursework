/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public abstract class ObjectInterest {
    ArrayList<InsideObjectType> possibleInsideObjects = new ArrayList<>();
    ArrayList<InsideObjectType> insideObjectsList = new ArrayList<>();
    protected abstract ArrayList<InsideObjectType> getPossibleInsideObjects();
    boolean isFireAllowed=true;
    boolean isHouseBuildingAllowed=true;
    boolean isTreeFellingAllowed=true;
    private final Random random = new Random();    
    public void generateInsideObjectsList() {
        ArrayList<InsideObjectType> possibleInsideObjects = getPossibleInsideObjects();
        int size = possibleInsideObjects.size();
        for (InsideObjectType type: possibleInsideObjects) {
            int randomIndex = random.nextInt(5) + 1 ;
            for (int i=1;i<randomIndex;i++){
                insideObjectsList.add(type);
            }
        }
    }
    
}
