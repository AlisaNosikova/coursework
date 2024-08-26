/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */


import java.util.ArrayList;
import regions.*;

public class RegionChainManager {
 //   private HashMap<String, BaseRegion> regionTypes = new HashMap<>();
    private final ArrayList<BaseRegion> regions = new ArrayList<>();
    private int currentPosition;
    public RegionChainManager() {
       // regionTypes.put(DesertRegion.getRegionType(), new DesertRegion());
      //  regionTypes.put(TundraRegion.getRegionType(), new TundraRegion());
      //  regionTypes.put(MildClimateRegion.getRegionType(), new MildClimateRegion());
        this.currentPosition = 0;
    }

    public BaseRegion getCurrentRegion(int currentPosition) {
        return regions.get(currentPosition);
    }
    public ArrayList<BaseRegion> checkAvailableRegions(BaseRegion currentRegion){
        this.currentPosition = regions.indexOf(currentRegion);
        ArrayList<BaseRegion> availableRegions = new ArrayList<>();
        availableRegions.add(moveNext());
        availableRegions.add(movePrevious());
        return availableRegions;
    }
    public BaseRegion moveNext() {
        currentPosition = (currentPosition + 1) % regions.size();
        return getCurrentRegion(currentPosition);
    }

    public BaseRegion movePrevious() {
        currentPosition = (currentPosition - 1 + regions.size()) % regions.size();
        return getCurrentRegion(currentPosition);
    }
   public void generateRegions(String regionName, int count) {
    for (int i = 0; i < count; i++) {
        switch (regionName) {
            case "Desert" -> regions.add(new DesertRegion());
            case "Tundra" -> regions.add(new TundraRegion());
            case "MildClimate" -> regions.add(new MildClimateRegion());
        }
    }
   }
   public ArrayList<BaseRegion> getRegions(){
       return regions;
   }
}