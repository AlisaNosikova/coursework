/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandClasses;

import classes.*;

/**
 *
 * @author User
 */
public class ActionResult {

    private String message;
    private boolean status;
    private boolean isInventoryChanged;
    private ObjectInterest placeOfAction;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setObjectInterest(ObjectInterest obj) {
        this.placeOfAction = obj;
    }

    public String getMessage() {
        return message;
    }

    public boolean getStatus() {
        return status;
    }

    public ObjectInterest getPlaceOfAction() {
        return placeOfAction;
    }

    public String getCompleteResult() {
        return message + " в объекте интереса " + placeOfAction.getObjectType();
    }
}
