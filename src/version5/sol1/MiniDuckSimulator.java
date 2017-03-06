package version5.sol1;

import java.io.File;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        
        File quackAudio = new File("/Users/roshann/Java/SimDuck/SimUDuck-Versions1-5/SimUDuck4-5/animals039.wav");
        File squekAudio = new File("/Users/roshann/Java/SimDuck/SimUDuck-Versions1-5/SimUDuck4-5/130011__ermfilm__rubber-duck-small-2.wav");
        Voice duckQuack = new QuackVoice(quackAudio);
        Voice duckSqueak = new SqeakVoice(squekAudio);
        Voice duckMute = new MuteVoice();
        
        
        DisplayType displayMode = new ConsoleDisplayType();
        FlyBehavior flywithWings = new FlyWithWings(displayMode);
        QuackBehavior quack = new Quack(duckQuack);
        SwimBehavior swimming = new Swimming(); 
        
        Duck mallard = new MallardDuck(flywithWings, quack, swimming, displayMode);
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        System.out.println("================RunTimeChange=========================");
        
        FlyBehavior flyWithRocketPower = new FlyWithRocketPowered(displayMode);
        mallard.setFlyBehavior(flyWithRocketPower);
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        
        System.out.println("========================Rubber Duck===================");
        
        SwimBehavior floating = new Floating();
        QuackBehavior squeak = new Quack(duckSqueak);
        
        Duck rubberDuck = new RubberDuck(flyWithRocketPower, squeak, floating, displayMode);
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
        
        System.out.println("======================Model Duck ======================");
        SwimBehavior drowning = new Drowning();
        QuackBehavior noVoice = new Quack(duckMute);
        Duck modelDuck = new ModelDuck(flyWithRocketPower, noVoice, drowning, displayMode);
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.swim();

        
//        mallard.setQuackBehavior(new Squeak(duckVoice));
//        mallard.performQuack();
//        mallard.performQuack();
//
//        System.out.println("================Model Duck=========================");
//
//        Duck model = new ModelDuck(new FlyNoWay(displayMode), new MuteQuack(duckVoice), displayMode);
//        model.doDisplay();
//        model.performFly();
//        model.performQuack();
//
//        model.setFlyBehavior(new FlyRocketPowered(displayMode));
//        model.performFly();
//        model.performQuack();
    }
}
