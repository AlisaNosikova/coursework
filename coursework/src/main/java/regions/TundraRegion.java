package regions;


import bioms.Tundra;
import java.util.ArrayList;
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
public class TundraRegion extends Tundra{
    ArrayList<Object> listOI = new ArrayList<>();
    @Override
    public ArrayList<Class<?>> getObjectsInterestList() {
       return objectsInterestList;
    }
    public void generateObjectsInterestList(){
      for (Class<?> clazz: getObjectsInterestList()){
          try{
              Object obj = clazz.getDeclaredConstructor().newInstance();
              listOI.add(obj);
          } catch (Exception ex) {
              ex.printStackTrace();
      }
    }
    
}
}
