/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import commandClasses.*;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class CommandManager {

    private HashMap<String, Command> commandList = new HashMap<>();
    
    CommandManager(){
        completeCommandList();
    }

    public void completeCommandList() {
        commandList.put("Срубить дерево", new FellTreeCommand());
        commandList.put("Построить дом", new BuildHouseCommand());
        commandList.put("Развести костер", new MakeFireCommand());
    }

    public HashMap<String, Command> getCommandList() {
        return commandList;
    }

}
