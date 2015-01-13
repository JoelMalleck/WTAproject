/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WTAfiles;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Pan4Face extends JPanel{
    JButton btnNext, btnPrev;
    JLabel lblId;
    JRadioButton face0, face1, face2, face3;
    
    public Pan4Face(ActionListener buttonListener){
        lblId = new JLabel("Personality?");
        btnNext = new JButton("Next");
        btnPrev = new JButton("Previous");
        ButtonGroup group = new ButtonGroup();
        face0 = new JRadioButton("Killer");
        face1 = new JRadioButton("Violent");
        face2 = new JRadioButton("Evil");
        face3 = new JRadioButton("Psycho");
        add(lblId);
        add(face0);
        add(face1);
        add(face2);
        add(face3);
        group.add(face0);
        group.add(face1);
        group.add(face2);
        group.add(face3);
        add(btnNext);
        add(btnPrev);
        face0.addActionListener(buttonListener);
        face1.addActionListener(buttonListener);
        face2.addActionListener(buttonListener);
        face3.addActionListener(buttonListener);
        btnNext.addActionListener(buttonListener);
        btnPrev.addActionListener(buttonListener);
    }
    
    
    
}
