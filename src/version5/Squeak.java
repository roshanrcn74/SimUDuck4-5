package version5;

public class Squeak implements QuackBehavior {

    private Display display;

    public Squeak(Display display) {
        setDisplay(display);
    }

    @Override
    public void quack() {
        display.doDisplay("Squeak");
    }

    public void setDisplay(Display display) {
        if (display == null) {
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.display = display;
    }
}
