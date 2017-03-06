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
public final class Squeak implements QuackBehavior{

private Voice squeakVoice;

    public Squeak(Voice squeakVoice) {
        setSqueakVoice(squeakVoice);
    }


    @Override
    public void quack() {
        squeakVoice.speak();
    }

    public void setSqueakVoice(Voice squeakVoice) {
        if (squeakVoice == null){
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.squeakVoice = squeakVoice;
    }    
}
