/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandClasses;

import classes.ObjectInterest;

/**
 *
 * @author User
 */
public class MakeFireCommand implements Command {
    private ActionResult actionResult= new ActionResult();
    @Override
    public ActionResult execute(ObjectInterest obj) {
       boolean approveStatus = obj.getFireAllowedStatus();
       if (approveStatus == true){
           actionResult.setMessage("Вы развели костер!");
       }
       else{
           actionResult.setMessage("Развести костер тут нельзя!");
       }
       actionResult.setObjectInerest(obj);
       actionResult.setStatus(true);
       return actionResult;
    }

   
    
}
