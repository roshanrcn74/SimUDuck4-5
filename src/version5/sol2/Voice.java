/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5.sol2;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author roshann
 */
public class Voice implements QuackBehavior{
//private Voice quackVoice;
    private File voice;

    public Voice(File quackVoice) {
        setQuackVoice(quackVoice);
    }

    /**
     *
     */
    @Override
    public final void quack() {
        //quackVoice.speak();
       try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(voice));
            clip.start();
            
            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (Exception e) {
            e.fillInStackTrace();
        } 
    }

    public final void setQuackVoice(File quackVoice) {
        if (quackVoice == null){
            throw new IllegalArgumentException("Please initialize the object");
        }
        this.voice = quackVoice;
    }
    
}
