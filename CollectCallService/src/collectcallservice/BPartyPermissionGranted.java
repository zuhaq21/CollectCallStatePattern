/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectcallservice;

/**
 *
 * @author Zorays
 */
import java.util.Scanner;
public class BPartyPermissionGranted implements CallState{

    
    private static BPartyPermissionGranted instance = new BPartyPermissionGranted();
 
    private BPartyPermissionGranted() {}
 
    public static BPartyPermissionGranted instance() {
        return instance;
    }

    
//    public void message() {
//        
//        //for acceptance
        // if 1
//        Scanner input = new Scanner(System.in);
//        int choice = input.nextInt();
//        if (choice == 1)
//        {
//            System.out.println("Permission for collect call accepted\nCall Connected");
//            this.call.changeState(new CallConnected(this.call));
//        }
//        else if (choice == 2)
//        {
//            System.out.println("Permission for collect call denied\nCall Disconnected");
//            this.call.changeState(new BPartyPermissionDenied(this.call));
//        }
//        else{
//            System.out.println("Wrong Input");
//        }    
//    }

    @Override
    public void updateState(Call call) {
        System.out.println("Connecting");    
        call.setCurrentState(CallConnected.instance());    
    }
    
}
