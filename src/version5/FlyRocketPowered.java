package version5;

import version5.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
        Display display;

    public FlyRocketPowered(Display display) {
        this.display = display;
    }
        
        
    
        @Override
	public void fly() {
		display.doDisplay("I'm flying with a rocket");
	}

    public void setDisplay(Display display) {
        if (display == null){
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.display = display;
    }
        
        
}
