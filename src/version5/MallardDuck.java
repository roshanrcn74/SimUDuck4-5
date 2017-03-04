package version5;

/*
 * Wait a second, didn't we say we should NOT program
 * to an implementation? But what are we doing in that
 * constructor? We're making a new instance of a concrete
 * Quack implementation class!
 * 
 * Good catch! That's exactly what we're doing ... for now!
 * Later, we'll have more design patterns that can help fix
 * this problem.
 * 
 * Still, notice that while we are setting the behaviors
 * to concrete classes, we could easily change that at runtime.
 * So we still have lots of flexibility here, but we're doing a
 * poor job of initializing the instance variables in a flexible
 * way. But think about it, since the quackBehavior instance
 * variable is an interface type, we could, through the magic
 * of polymorphism, dynamically asign a different QuackBehavior
 * implementation at runtime. We'll see this later.
 */
public class MallardDuck implements Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    Display display;

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, Display display) {
        // these properties are inherited from Duck
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
        setDisplay(display);

    }

    /**
     *
     */
    @Override
    public final void doDisplay() {
        display.doDisplay("I'm a Mallard Duck");
    }

    /**
     *
     * @return
     */
    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    /**
     *
     * @param flyBehavior
     */
    @Override
    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        //Object validation
        if (flyBehavior == null) {
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.flyBehavior = flyBehavior;
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    /**
     *
     * @param quackBehavior
     */
    @Override
    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        if (quackBehavior == null) {
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.quackBehavior = quackBehavior;
    }

    public final void setDisplay(Display display) {
        if (display == null) {
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.display = display;
    }

    @Override
    public final void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public final void performFly() {
        flyBehavior.fly();
    }
}
