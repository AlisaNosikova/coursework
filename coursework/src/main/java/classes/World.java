/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;
import regions.BaseRegion;


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
        Scanner scanner = new Scanner(System.in);
        String regionName = scanner.nextLine();
        int regionCount  = scanner.nextInt();
        regionManager.generateRegions(regionName, regionCount);
        System.out.println(regionManager.getRegions());
        System.out.println("Выберите регион");
        int regionNum  = scanner.nextInt();
        player.setCurrentRegion( regionManager.getRegion(regionNum));
        System.out.println("Регионы, доступные для перемещения:");
        System.out.println(player.getCurrentRegion());
        for (BaseRegion region: regionManager.checkAvailableRegions(player.getCurrentRegion())){
            System.out.print(regionManager.getRegionPosition(region));
            System.out.println("" + region);
        }
    }
}
