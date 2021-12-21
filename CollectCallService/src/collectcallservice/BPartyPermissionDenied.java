/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectcallservice;

/**
 *
 * @author Zorays
 */
public class BPartyPermissionDenied implements CallState{

    private static BPartyPermissionDenied instance = new BPartyPermissionDenied();
 
    private BPartyPermissionDenied() {}
 
    public static BPartyPermissionDenied instance() {
        return instance;
    }
//    @Override
//    public void message() {
//        System.out.println("Permission for collect call not accepted\nEnding Call");
//        this.call.changeState(new CallHangedUp(this.call));
//        }

    @Override
    public void updateState(Call call) {
        System.out.println("Permission Denied");
        call.setCurrentState(CallHangedUp.instance());
    }
    
}
