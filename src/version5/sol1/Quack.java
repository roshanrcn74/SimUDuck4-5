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
public final class Quack implements QuackBehavior{
private Voice quackVoice;

    public Quack(Voice quackVoice) {
        setQuackVoice(quackVoice);
    }


    @Override
    public void quack() {
        quackVoice.speak();
    }

    public void setQuackVoice(Voice quackVoice) {
        if (quackVoice == null){
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.quackVoice = quackVoice;
    }
    
}
