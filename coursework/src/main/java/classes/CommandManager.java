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

    public CommandManager() {
        completeCommandList();
    }

    public void completeCommandList() {
        commandList.put(FellTreeCommand.getName(), new FellTreeCommand());
        commandList.put(BuildHouseCommand.getName(), new BuildHouseCommand());
        commandList.put(MakeFireCommand.getName(), new MakeFireCommand());
    }

    public HashMap<String, Command> getCommandList() {
        return commandList;
    }

}
