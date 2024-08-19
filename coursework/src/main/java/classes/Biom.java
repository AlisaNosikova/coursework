/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bioms;

import classes.OI;
import java.util.*;

/**
 *
 * @author User
 */
public class Biom {
    private ArrayList<OI> oiList;
    private String name;
    public Biom(){
    }
    private String getName(){
        return name;
    }
    private ArrayList<OI> getOIList(){
        return oiList;
    }
    private void setName(String name){
        this.name = name;
    }
    private void setOiList(ArrayList<OI> oiList){
        this.oiList = oiList;
    }
}
