package version5.sol2;


import java.io.File;

public class StartUpDuckSimulator {

    public static void main(String[] args) {
        
        File quackAudio = new File("/Users/roshann/Java/SimDuck/"
                + "SimUDuck-Versions1-5/SimUDuck4-5/animals039.wav");
        File squekAudio = new File("/Users/roshann/Java/SimDuck/SimUDuck-Versio"
                + "ns1-5/SimUDuck4-5/130011__ermfilm__rubber-duck-small-2.wav");
        File noAudio = new File("");
        
        DisplayType displayMode = new GUIDisplay();
        FlyBehavior flywithWings = new FlyWithWings(displayMode);
        QuackBehavior quack = new Voice(quackAudio);
        SwimBehavior swimming = new Swimming(); 
        //quack.quack();

        Duck mallard = new Duck("MallardDuck", flywithWings, quack, swimming, displayMode);
       
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
        QuackBehavior squeak = new Voice(squekAudio);
        //squeak.quack();
        
        Duck rubberDuck = new Duck("RubberDuck", flyWithRocketPower, squeak, floating, displayMode);
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
        
        System.out.println("======================Model Duck =====================");
        SwimBehavior drowning = new Drowning();
        QuackBehavior noVoice = new Voice(noAudio);
        Duck modelDuck = new Duck("ModelDuck", flyWithRocketPower, noVoice, drowning, displayMode);
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.swim();

    }
}
