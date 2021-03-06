/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5.sol1;

/**
 *
 * @author roshann
 */
public final class FlyWithRocketPowered implements FlyBehavior {

    private DisplayType flyDisplay;

    public FlyWithRocketPowered(DisplayType flyDisplay) {
        setFlyDisplay(flyDisplay);
    }
    
    /**
     *
     */
    @Override
    public final void fly() {
        flyDisplay.display("Flying with Rocket powered");
        
    }

    public void setFlyDisplay(DisplayType flyDisplay) {
        
        if (flyDisplay == null){
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.flyDisplay = flyDisplay;
    }
    
}
