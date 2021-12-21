/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectcallservice;

/**
 *
 * @author Zorays
 */
public class CallHangedUp implements CallState{

    private static CallHangedUp instance = new CallHangedUp();
 
    private CallHangedUp() {}
 
    public static CallHangedUp instance() {
        return instance;
    }

    @Override
    public void updateState(Call call) {
        System.out.println("Call Ended");
        System.exit(0);
    }
    
}
