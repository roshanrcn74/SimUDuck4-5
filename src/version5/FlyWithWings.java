package version5;

public class FlyWithWings implements FlyBehavior{
    
    Display display;

    public FlyWithWings(Display display) {
        setDisplay(display);
    }
    
    

        @Override
	public void fly() {
		display.doDisplay("I'm flying!");
	}

    public void setDisplay(Display display) {
        if (display == null){
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.display = display;
    }
        
        

}
