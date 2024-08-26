/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;
import objectsDesert.Gorge;



/**
 *
 * @author User
 */
public class World {
    RegionChainManager regionManager;
    CommandManager commandManager;
    Player player;
    public World(){
        this.regionManager = new RegionChainManager();
        this.commandManager = new CommandManager();
        this.player = new Player();
        
    }
    public void start(){
        Gorge gorge = new Gorge();
        System.out.println(gorge.getFireAllowedStatus());
        System.out.println(gorge.getHouseBuildingAllowedStatus());
        System.out.println(gorge.getTreeFellingAllowedStatus());
        Scanner scanner = new Scanner(System.in);
        String regionName = scanner.nextLine();
        int regionCount  = scanner.nextInt();
        regionManager.generateRegions(regionName, regionCount);
        System.out.println(regionManager.getRegions());
        System.out.println("Выберите регион");
        int regionNum  = scanner.nextInt();
        System.out.println(regionManager.getRegions().get(regionNum).getObjectsInterestList());
        regionManager.checkAvailableRegions(player.getCurrentRegion());
        player.setCurrentRegion( regionManager.getCurrentRegion(regionNum));
    }
}
