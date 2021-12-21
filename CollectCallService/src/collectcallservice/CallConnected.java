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
public class CallConnected implements CallState{


    private static CallConnected instance = new CallConnected();
 
    private CallConnected() {}
 
    public static CallConnected instance() {
        return instance;
    }

    
    
    @Override
    public void updateState(Call call) {
        System.out.println("Call Connected");
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to end the call");
        int choice = input.nextInt();
        if(choice == 1)
        {
            call.setCurrentState(CallHangedUp.instance());
        }
        else{
            call.setCurrentState(CallHangedUp.instance());
        }
        

    }
    
}
