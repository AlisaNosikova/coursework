/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coursework;

import regions.*;

/**
 *
 * @author User
 */
public class Coursework {

    public static void main(String[] args) {
        BaseRegion tundraRegion = new TundraRegion();
        tundraRegion.generateObjectsInterestList();
        BaseRegion desertRegion = new DesertRegion();
        desertRegion.generateObjectsInterestList();
        BaseRegion mildClimateRegion = new MildClimateRegion();
        mildClimateRegion.generateObjectsInterestList();
        for (Object obj : tundraRegion.getObjectsInterestList()) {
            System.out.println("Объект интереса в ТУНДРА: " + obj);
        }
        for (Object obj : desertRegion.getObjectsInterestList()) {
            System.out.println("Объект интереса в ПУСТЫНЯ: " + obj);
        }
        for (Object obj : mildClimateRegion.getObjectsInterestList()) {
            System.out.println("Объект интереса в СМЕШАННЫЙ ЛЕС: " + obj);
        }
    }
}
