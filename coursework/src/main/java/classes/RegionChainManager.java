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
import java.util.HashMap;
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

    public BaseRegion getCurrentRegion() {
        return regions.get(currentPosition);
    }

    public BaseRegion moveNext() {
        currentPosition = (currentPosition + 1) % regions.size();
        return getCurrentRegion();
    }

    public BaseRegion movePrevious() {
        currentPosition = (currentPosition - 1 + regions.size()) % regions.size();
        return getCurrentRegion();
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