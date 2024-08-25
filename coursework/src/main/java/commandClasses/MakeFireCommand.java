/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandClasses;

import classes.ObjectInterest;
import classes.Player;

/**
 *
 * @author User
 */
public class MakeFireCommand implements Command {
    private ActionResult actionResult= new ActionResult();
    private Player player;
    @Override
    public ActionResult execute(ObjectInterest obj, Player player) {
       this.player = player;
       boolean approveStatus = obj.getFireAllowedStatus();
       if (approveStatus == true){
           actionResult.setMessage("Вы развели костер!");
           actionResult.setStatus(true);
       }
       else{
           actionResult.setMessage("Развести костер тут нельзя!");
           actionResult.setStatus(false);
       }
       actionResult.setObjectInerest(obj);
       return actionResult;
    }
     public void checkResources(){
       if (player.getInventory().getNumLogs()>=1){
           player.getInventory().useInventory(1);
             actionResult.setStatus(true);
       }
       else{
           actionResult.setMessage("Развести костер невозможно! У вас нет ресурсов!");
             actionResult.setStatus(false);
       }
       
   }

   
    
}
