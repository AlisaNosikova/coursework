/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author User
 */
public abstract class ObjectInterest {
    private ArrayList<InsideObjectType> possibleInsideObjects = new ArrayList<>();
    private ArrayList<InsideObjectType> insideObjectsList = new ArrayList<>();
    protected boolean isFireAllowed;
    protected boolean isHouseBuildingAllowed;
    protected boolean isTreeFellingAllowed;
    private boolean isAlive = true;
    private final Random random = new Random();    
    public ObjectInterest(InsideObjectType... types) {
        possibleInsideObjects.addAll(Arrays.asList(types));
    }
    public void generateInsideObjectsList() {
        int size = possibleInsideObjects.size();
        for (InsideObjectType type: possibleInsideObjects) {
            int randomIndex = random.nextInt(5) + 1 ;
            for (int i=1;i<randomIndex;i++){
                insideObjectsList.add(type);
            }
        }
    }
    public ArrayList<InsideObjectType> getPossibleInsideObjects(){
        return possibleInsideObjects;
    }
    public ArrayList<InsideObjectType> getInsideObjects(){
        return insideObjectsList;
    }
    public boolean getFireAllowedStatus(){
        return isFireAllowed;
    }
    public boolean getHouseBuildingAllowedStatus(){
        return isHouseBuildingAllowed;
    }
    public boolean getTreeFellingAllowedStatus(){
        return isTreeFellingAllowed;
    }
    public void setFireAllowedStatus(boolean status){
        this.isFireAllowed = status;
    }
    public void setHouseBuildingAllowedStatus(boolean status){
        this.isHouseBuildingAllowed = status;
    }
    public void setTreeFellingAllowedStatus(boolean status){
        this.isTreeFellingAllowed = status;
    }
    public boolean getAliveStatus(){
        return isAlive;
    }
    public void addToInsideObjectsList(InsideObjectType type){
        insideObjectsList.add(type);
    }
    public void removeFromInsideObjectsList(InsideObjectType type){
        insideObjectsList.remove(type);
    }
}
