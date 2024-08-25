package regions;

import classes.ObjectInterest;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public abstract class BaseRegion {
    private final ArrayList<Object> objectsInterestList = new ArrayList<>();
    private final Random random = new Random();

    protected abstract ArrayList<Class<?>> getPossibleObjectsInterestList();

    protected abstract int getMinNumOfClasses();

    protected abstract int getMaxNumOfClasses();

    public void generateObjectsInterestList() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList<Class<?>> possibleObjectsInterestList = getPossibleObjectsInterestList();
        int size = possibleObjectsInterestList.size();

        int numOfClasses = random.nextInt(getMaxNumOfClasses() - getMinNumOfClasses() + 1) + getMinNumOfClasses();

        for (int i = 0; i < numOfClasses; i++) {
            int randomIndex = random.nextInt(size);
            Class<?> clazz = possibleObjectsInterestList.get(randomIndex);
            objectsInterestList.add( clazz.getDeclaredConstructor().newInstance());
        }
    }

    public ArrayList<Object> getObjectsInterestList() {
        return objectsInterestList;
    }
}
