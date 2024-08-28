/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.IOException;
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

    public void start() throws IOException {
        boolean doActions = true;
        boolean doChoices = true;
        int countTundra = 0;
        int countDesert = 0;
        int countMildClimate = 0;
        while (doChoices) {
            System.out.println("Введите количество регионов для генерации мира");
            System.out.println("Ввведите количество регионов Тундра: ");
            countTundra = choiceCheck(scanner);
            System.out.println("Ввведите количество регионов Пустыня: ");
            countDesert = choiceCheck(scanner);
            System.out.println("Ввведите количество регионов Смешанный лес: ");
            countMildClimate = choiceCheck(scanner);
            if (countTundra != 0 || countDesert != 0 || countMildClimate != 0) {
                doChoices = false;
            }
        }
        if (!doChoices) {
            regionManager.generateRegions(countTundra, countDesert, countMildClimate);
            player.setCurrentRegion(regionManager.getRegion(0));
            while (doActions) {
                System.out.println("----------------");
                System.out.println("Ваш текущий регион : " + player.getCurrentRegion().getUniqueName());
                System.out.println("Доступные команды для взаимодействия с ОИ: " + commandManager.getCommandList().keySet());
                System.out.println("Если вы хотите переместится в другой регион, введите: move");
                System.out.println("Если вы хотите посмотреть содержимое инвентаря, введите: checkInventory");
                System.out.println("Если вы хотите завершить игру, введите: exit");
                System.out.println("Введите команду из предложенных: ");
                String actionName = scanner.nextLine();
                if ("move".equals(actionName)) {
                    moveToRegion();
                } else if ("checkInventory".equals(actionName)) {
                    System.out.println("Количество бревен сейчас: " + player.getInventory().getNumLogs());
                } else if ("exit".equals(actionName)) {
                    System.out.println("Спасибо за игру!");
                    doActions = false;
                } else {
                    System.out.println("Список ОИ в текущем регионе: ");
                    for (ObjectInterest object : player.getCurrentRegion().getObjectsInterestList()) {
                        System.out.println(object.getObjectType());
                    }
                    System.out.println("Введите номер объекта интереса из предложенных: ");
                    int objectIndex = scanner.nextInt();
                    scanner.nextLine();  // Поглощаем символ новой строки после ввода числа
                    System.out.println(player.makeAction(player.getCurrentRegion().getObjectsInterestList().get(objectIndex - 1), commandManager.getCommandList().get(actionName)).getCompleteResult());
                }
            }
        }
    }

    public void moveToRegion() {
        ArrayList<BaseRegion> availableRegions = regionManager.checkAvailableRegions(player.getCurrentRegion());
        System.out.println("Доступные регионы для перемещения: ");
        for (BaseRegion region : availableRegions) {
            System.out.print(regionManager.getRegionPosition(region));
            System.out.println(" " + region.getUniqueName());
        }
        System.out.println("Всего регионов для выбора:" + availableRegions.size());
        System.out.println("Выберите номер региона, куда хотите переместится: ");
        int regionIndex = scanner.nextInt();
        scanner.nextLine();  // Поглощаем символ новой строки после ввода числа
        player.setCurrentRegion(availableRegions.get(regionIndex - 1));
        System.out.println(player.getCurrentRegion());
    }

    public static int choiceCheck(Scanner scanner) {
        int choice = 0;
        boolean ch = true;
        ArrayList<Integer> choicesList = new ArrayList<>();
        while (ch) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine();  // Поглощаем символ новой строки после ввода числа
                if (choice < 0) {
                    System.out.println("Ошибка! Введено отрицательное число.");
                } else {
                    ch = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введен неверный тип данных.");
                scanner.nextLine(); // Очищаем некорректный ввод
            }
        }
        return choice;
    }

}
