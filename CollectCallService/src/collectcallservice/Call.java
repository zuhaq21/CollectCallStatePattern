/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectcallservice;

/**
 *
 * @author Zorays
 */
public class Call {
    CallState state;
    
    public Call(CallState currentState)
    {
        super();
        this.state = currentState;
        
         
        if(currentState == null) {
            this.state = BPartyPickup.instance();
        }
    }
    //
    
    public CallState getCurrentState() {
        return state;
    }
    public void setCurrentState(CallState currentState) {
        this.state = currentState;
    }
    
    public void update() {
        state.updateState(this);
    }
    
}
