/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import regions.BaseRegion;

/**
 *
 * @author User
 */
public class World {

    RegionManager regionManager = new RegionManager();
    CommandManager commandManager = new CommandManager();
    Player player = new Player();
    Scanner scanner;

    public World() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Введите количество регионов для генерации мира");
        System.out.println("Ввведите количество регионов Тундра: ");
        int countTundra = ChoiceCheck();
        System.out.println("Ввведите количество регионов Пустыня: ");
        int countDesert = ChoiceCheck();
        System.out.println("Ввведите количество регионов Смешанный лес: ");
        int countMildClimate = ChoiceCheck();
        regionManager.generateRegions(countTundra, countDesert, countMildClimate);
        player.setCurrentRegion(regionManager.getRegion(0));
        while (true) {
            System.out.print("Ваш текущий регион : " + player.getCurrentRegion().getUniqueName());
            System.out.println("Доступные команды для взаимодействия с ОИ: " + commandManager.getCommandList().keySet());
            System.out.println("Если вы хотите переместится в другой регион, введите: move");
            System.out.println("Введите команду из предложенных: ");
            String actionName = scanner.nextLine();
            if ("move".equals(actionName)) {
                moveToRegion();
            }
            else{
                
            System.out.println("Список ОИ в текущем регионе: ");
            for (ObjectInterest object : player.getCurrentRegion().getObjectsInterestList()) {
                System.out.println(object.getObjectType());
            }
            System.out.println("Введите номер объекта интереса из предложенных: ");
            int objectIndex = scanner.nextInt();
            System.out.println(player.makeAction(player.getCurrentRegion().getObjectsInterestList().get(objectIndex-1), commandManager.getCommandList().get(actionName)).getCompleteResult());
        }
        }
    }

    public void moveToRegion() {
        ArrayList<BaseRegion> availableRegions = regionManager.checkAvailableRegions(player.getCurrentRegion());
        System.out.println("Доступные регионы для перемещения: ");
        for (BaseRegion region : availableRegions) {
            System.out.print(regionManager.getRegionPosition(region));
            System.out.println("" + region.getUniqueName());
        }
        System.out.println("Всего регионов для выбора:" + availableRegions.size());
        System.out.println("Выберите номер региона, куда хотите переместится: ");
        int regionIndex = scanner.nextInt();
        player.setCurrentRegion(availableRegions.get(regionIndex-1));
        System.out.println(player.getCurrentRegion());
    }
    public static int ChoiceCheck(){
           int choice=0;
           boolean ch=true;
           while (ch){
               try{
                   Scanner in = new Scanner(System.in);
                   choice = in.nextInt();
                   if(choice<0){
                    try{
                     throw new Exception();
                    }catch(Exception e){
                  System.out.println("Error! Negative number");  }
                   }
                   else{ch =false;}
                   
                }catch(InputMismatchException e){
                 System.out.println("Error! Wrong type");   
               } 
       }
           return choice;
}

}
