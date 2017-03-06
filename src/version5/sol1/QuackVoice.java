/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5.sol1;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author roshann
 */
public class QuackVoice implements Voice{
    private final File file;

    public QuackVoice(File file) {
        this.file = file;
    }
    
    
    @Override
    public final void speak(){
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
            
            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (Exception e) {
            e.fillInStackTrace();
        }        
    }   
}
