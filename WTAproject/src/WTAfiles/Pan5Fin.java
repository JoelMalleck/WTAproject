/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WTAfiles;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Pan5Fin extends JPanel{
    JButton create;
    
    public Pan5Fin(ActionListener buttonListener){
        create = new JButton("Create!");
        add(create);
        create.addActionListener(buttonListener);
    }
    
    
    
}