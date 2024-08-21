/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioms;

import java.util.ArrayList;
import objectsTundra.*;

/**
 *
 * @author User
 */
public abstract class Tundra implements Biom {

    ArrayList<Class<?>> possibleObjectsInterestList = new ArrayList<>();

    public Tundra() {
        possibleObjectsInterestList.add(Glacier.class);
        possibleObjectsInterestList.add(Geyser.class);
        possibleObjectsInterestList.add(OpenWoodland.class);
        possibleObjectsInterestList.add(ReindeerHerdersCamp.class);
        possibleObjectsInterestList.add(Swamp.class);
    }

    @Override
    public ArrayList<Class<?>> getPossibleObjectsInterestList() {
        return possibleObjectsInterestList;
    }

}
