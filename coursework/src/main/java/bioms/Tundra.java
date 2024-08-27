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
public abstract class Tundra extends Biom {

    public Tundra() {
        super(Glacier.class, Geyser.class, OpenWoodland.class, ReindeerHerdersCamp.class, Swamp.class);
    }
}
