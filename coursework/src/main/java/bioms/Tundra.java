/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioms;

import objectsTundra.*;

/**
 *
 * @author User
 */
public abstract class Tundra implements Biom {
    
    @Override
    public void addToObjectsInterestList(){
        objectsInterestList.add(Glacier.class);
        objectsInterestList.add(Geyser.class);
        objectsInterestList.add(OpenWoodland.class);
        objectsInterestList.add(ReindeerHerdersCamp.class);
        objectsInterestList.add(Swamp.class); 
    }
}
