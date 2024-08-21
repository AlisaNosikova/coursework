package regions;


import bioms.Tundra;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TundraRegion extends Tundra implements Region{
    private ArrayList<Object> objectsInterestList = new ArrayList<>();
    private Random random = new Random();

    public ArrayList<Object> getObjectsInterestList() {
        return objectsInterestList;
    }

    public void generateObjectsInterestList() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ArrayList<Class<?>> possibleObjectsInterestList = getPossibleObjectsInterestList();
        int size = possibleObjectsInterestList.size();

        int numOfClasses = random.nextInt(3) + 3;
        ArrayList<Class<?>> selectedClasses = new ArrayList<>();

        for (int i = 0; i < numOfClasses; i++) {
            int randomIndex = random.nextInt(size);
            Class<?> clazz = possibleObjectsInterestList.get(randomIndex);
            selectedClasses.add(clazz);
        }

        for (Class<?> clazz : selectedClasses) {
            Object obj = clazz.getDeclaredConstructor().newInstance();
            objectsInterestList.add(obj);
        }
    }

}

