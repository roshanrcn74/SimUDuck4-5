package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {

                Display displayMode1 = new GUIDisplay();
                Display displayMode = new ConsoleDisplay();
		Duck mallard = new MallardDuck(new FlyWithWings(displayMode), new Quack(displayMode1), displayMode);
		mallard.doDisplay();
		mallard.performQuack();
		mallard.performFly();
                
                System.out.println("================RunTimeChange=========================");
                
                mallard.setFlyBehavior(new FlyRocketPowered(displayMode));
                mallard.setQuackBehavior(new Squeak(displayMode1));
		mallard.performQuack();
		mallard.performFly();
//

                System.out.println("================Model Duck=========================");
                
		Duck model = new ModelDuck(new FlyNoWay(displayMode), new Quack(displayMode1), displayMode);
		model.doDisplay();
		model.performFly();
                model.performQuack();
                
		model.setFlyBehavior(new FlyRocketPowered(displayMode) );
		model.performFly();
                model.performQuack();
	}
}
