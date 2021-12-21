/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectcallservice;

import java.util.Scanner;

/**
 *
 * @author Zorays
 */
public class BPartyPickup implements CallState{

    private static BPartyPickup instance = new BPartyPickup();
    private BPartyPickup() {}
 
    public static BPartyPickup instance() {
        return instance;
    }
    Call call;

    @Override
    public void updateState(Call call) {
        System.out.println("Call Received");
        Scanner input = new Scanner(System.in);
        System.out.println("1 to receive the call\n 2 to hang up.");
        int receiveChoice = input.nextInt();
        if (receiveChoice == 1)
        {
            System.out.println("1 to accept request and 2 to deny");
            int choice = input.nextInt();
            if (choice == 1)
            {
                System.out.println("Permission for collect call accepted\nCall Connected");
                call.setCurrentState(BPartyPermissionGranted.instance());
            }
            else if (choice == 2)
            {
                System.out.println("Permission for collect call denied\nCall Disconnected");
                call.setCurrentState(BPartyPermissionDenied.instance());
            }
            else{
                System.out.println("Wrong Input");
            }
        }
        else{
            call.setCurrentState(CallHangedUp.instance());
        }
        
        //call.setCurrentState(BPartyPermissionGranted.instance());
        
    }

}
