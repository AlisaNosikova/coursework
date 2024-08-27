/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioms;

import objectsMildClimate.*;
import objectsTundra.Swamp;

/**
 *
 * @author User
 */
public abstract class MildClimate extends Biom {

    public MildClimate() {
        super(Forest.class, Meadow.class, Mountain.class, Swamp.class, Village.class);
    }
}
