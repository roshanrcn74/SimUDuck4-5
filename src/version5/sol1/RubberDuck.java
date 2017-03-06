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
public class RubberDuck implements Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private SwimBehavior swimBehavior;
    private DisplayType displayType; // 2D, 3D , Line , Vedio
    

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, 
            SwimBehavior swimBehavior, DisplayType display) {
        // these properties are inherited from Duck
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
        setDisplay(display);
        setSwimBehavior(swimBehavior);

    }
    /**
     *
     */
    @Override
    public final void display() {
        //"I'm a Mallard Duck"
        displayType.display("I'm a Rubber Duck");
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
    
    @Override
    public final void setSwimBehavior(SwimBehavior swimBehaviour){
        if (swimBehaviour == null) {
            throw new IllegalArgumentException("Please initialize the object");
        }
        
        this.swimBehavior = swimBehaviour;
    }

    @Override
    public final void setDisplay(DisplayType display) {
        if (display == null) {
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.displayType = display;
    }

    @Override
    public final void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public final void performFly() {
        flyBehavior.fly();
    }

    @Override
    public final void swim() {
        swimBehavior.swim();
    }   
}
