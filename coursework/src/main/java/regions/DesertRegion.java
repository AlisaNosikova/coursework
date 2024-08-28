package regions;

import bioms.Desert;
import classes.*;
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
public class DesertRegion extends BaseRegion {

    private final Desert desert;

    public DesertRegion() throws IOException {
        this.image = ImageIO.read(new File("C:\\Users\\User\\Documents\\GitHub\\coursework\\coursework\\src\\main\\resources\\desert.jpg"));
        this.desert = new Desert() {
        };
        generateObjectsInterestList();
        for (ObjectInterest obj : getObjectsInterestList()) {
            obj.generateInsideObjectsList();
        }
    }

    @Override
    protected ArrayList<Class<? extends ObjectInterest>> getPossibleObjectsInterestList() {
        return desert.getPossibleObjectsInterestList();
    }

    @Override
    protected int getMinNumOfClasses() {
        return 2;
    }

    @Override
    protected int getMaxNumOfClasses() {
        return 4;
    }

    @Override
    public String getRegionType() {
        return "Desert";
    }

    @Override
    public void generateUniqueRegion(int index) {
        this.uniqueName = getRegionType() + " region " + index;
    }

}
