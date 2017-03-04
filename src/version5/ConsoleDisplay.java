/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5;
/**
 *
 * @author roshann
 */
public class ConsoleDisplay implements Display{

    /**
     *
     * @param display
     */
    @Override
    public final void doDisplay(String display) {
        System.out.println(display);
    }
    
}
