/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5;

import javax.swing.JOptionPane;

/**
 *
 * @author roshann
 */
public class GUIDisplay implements Display{

    @Override
    public void doDisplay(String display) {
        JOptionPane.showMessageDialog(null, display);
    }
}
