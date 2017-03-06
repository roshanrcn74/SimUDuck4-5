package version5.sol1;

/**
 * The main difference with this 5th version is that the class
 * provides methods for setting fly and quack behaviors at runtime.
 * Otherwise, everything else is the same.
 * 
 * @author jlombardo
 *
 */
public interface Duck {

	
	public abstract void display();
	
	public abstract void performQuack();
	
	public abstract void performFly();
        
        public abstract void swim();
        
        public abstract void setQuackBehavior(QuackBehavior quackBehavior);
        
        public abstract void setSwimBehavior(SwimBehavior swimBehaviour);
        
        public abstract void setFlyBehavior(FlyBehavior flyBehavior);
        
        public abstract void setDisplay(DisplayType display);
        
        
}
