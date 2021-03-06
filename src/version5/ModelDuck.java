package version5;

public class ModelDuck implements Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    Display display;
	
	public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, Display dispaly) { 
		// these properties are inherited from Duck
		setFlyBehavior(flyBehavior);
                setQuackBehavior(quackBehavior);
                setDisplay(dispaly);
                
	}
	
        /**
         *
         */
        @Override
	public void doDisplay() {
            	//display.addData("I'm a model duck");
                display.doDisplay("I'm a model duck");
	}

        @Override
        public void performQuack() {
            quackBehavior.quack();
        }

        @Override
        public void performFly() {
                    flyBehavior.fly();
        }

            public final FlyBehavior getFlyBehavior() {
            return flyBehavior;
        }

        @Override
        public final void setFlyBehavior(FlyBehavior flyBehavior) {
            //Object validation
            if (flyBehavior == null){
                throw new IllegalArgumentException("Please initialize the object");
            }
            this.flyBehavior = flyBehavior;
        }

        public final QuackBehavior getQuackBehavior() {
            return quackBehavior;
        }

        @Override
        public final void setQuackBehavior(QuackBehavior quackBehavior) {
            if (quackBehavior == null){
                throw new IllegalArgumentException("Please initialize the object");
            }
            this.quackBehavior = quackBehavior;
        }

        public Display getDisplay() {
            return display;
        }

        public final void setDisplay(Display display) {
            if (display == null){
                throw new IllegalArgumentException("Please initialize the object");
            }
            this.display = display;
        }    
}
