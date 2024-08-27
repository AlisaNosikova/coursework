/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioms;

import java.util.ArrayList;
import objectsDesert.*;

/**
 *
 * @author User
 */
public abstract class Desert extends Biom {

    public Desert() {
        super(Gorge.class, Oasis.class, PyramidRuins.class, Saline.class);
    }
}
