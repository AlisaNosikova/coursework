/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bioms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public interface Biom {
    ArrayList<Class<?>> objectsInterestList = new ArrayList<>();
    public void addToObjectsInterestList();
    public ArrayList<Class<?>> getObjectsInterestList();
}
