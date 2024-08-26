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
    private final ArrayList<BaseRegion> regions = new ArrayList<>();
    private int currentPosition;
    public RegionChainManager() {
        this.currentPosition = 0;
    }

    public BaseRegion getRegion(int regionPosition) {
        return regions.get(regionPosition);
    }
    public int getRegionPosition(BaseRegion region){
        return regions.indexOf(region);
    }
    public ArrayList<BaseRegion> checkAvailableRegions(BaseRegion currentRegion){
        this.currentPosition = regions.indexOf(currentRegion);
        ArrayList<BaseRegion> availableRegions = new ArrayList<>();
        availableRegions.add(moveNext());
        availableRegions.add(movePrevious());
        return availableRegions;
    }
    public BaseRegion moveNext() {
        return getRegion((currentPosition + 1) % regions.size());
    }

    public BaseRegion movePrevious() {
        return getRegion((currentPosition - 1 + regions.size()) % regions.size());
    }
   public void generateRegions(String regionName, int count) {
    for (int i = 0; i < count; i++) {
        BaseRegion region = null;
        switch (regionName) {
            case "Desert" -> region = new DesertRegion();
            case "Tundra" -> region = new TundraRegion();
            case "MildClimate" -> region = new MildClimateRegion();
        }
        regions.add(region);
        region.generateUniqueRegion(regions.indexOf(region)+1);
    }
   }
   public ArrayList<BaseRegion> getRegions(){
       return regions;
   }
}