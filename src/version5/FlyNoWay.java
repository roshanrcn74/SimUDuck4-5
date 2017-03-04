package version5;

public class FlyNoWay implements FlyBehavior {
    Display guiDisplay;

    public FlyNoWay(Display guiDisplay) {
        setGuiDisplay(guiDisplay);
    }
    
    /**
     *
     */
    @Override
	public final void fly() {
		guiDisplay.doDisplay("I can't fly");
	}

    public final void setGuiDisplay(Display guiDisplay) {
        if (guiDisplay == null){
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.guiDisplay = guiDisplay;
    }

}
