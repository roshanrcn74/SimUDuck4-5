package version5;

public class Quack implements QuackBehavior {
    private Display display;

    public Quack(Display display) {
        setDisplay(display);
    }
    
    

        @Override
	public void quack() {
		display.doDisplay("Quack");
	}

    public void setDisplay(Display display) {
        if (display == null){
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.display = display;
    }        

}
