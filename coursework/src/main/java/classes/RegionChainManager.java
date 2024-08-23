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
import regions.BaseRegion;

public class RegionChainManager {
    private final ArrayList<BaseRegion> regions;
    private int currentPosition;

    public RegionChainManager(ArrayList<BaseRegion> regions) {
        this.regions =  regions;
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
}