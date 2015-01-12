/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WTAfiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pan5Fin extends JPanel{

    static JButton create;
    static JLabel picture;
    static String sDig1 = "", sDig2 = "", sDig3 = "", sFinal;

    public Pan5Fin(ActionListener buttonListener) {
        create = new JButton("Create!");
        add(create);
        create.addActionListener(buttonListener);
        
    }
}