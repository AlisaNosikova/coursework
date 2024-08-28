package regions;

import bioms.Tundra;
import classes.ObjectInterest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class TundraRegion extends BaseRegion {

    private final Tundra tundra;

    public TundraRegion() throws IOException {
        this.image = ImageIO.read(new File("C:\\Users\\User\\Documents\\GitHub\\coursework\\coursework\\src\\main\\resources\\tundra.jpg"));
        this.tundra = new Tundra() {
        };
        generateObjectsInterestList();
        for (ObjectInterest obj : getObjectsInterestList()) {
            obj.generateInsideObjectsList();
        }
    }

    @Override
    protected ArrayList<Class<? extends ObjectInterest>> getPossibleObjectsInterestList() {
        return tundra.getPossibleObjectsInterestList();
    }

    @Override
    protected int getMinNumOfClasses() {
        return 3;
    }

    @Override
    protected int getMaxNumOfClasses() {
        return 5;
    }

    @Override
    public String getRegionType() {
        return "Tundra";
    }

    @Override
    public void generateUniqueRegion(int index) {
        this.uniqueName = getRegionType() + " region " + index;
    }
}
