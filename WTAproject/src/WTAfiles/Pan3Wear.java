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

public class Pan3Wear extends JPanel{
    JButton btnNext, btnPrev;
    JLabel lblId;
    JRadioButton wear0, wear1, wear2, wear3;
    
    public Pan3Wear(ActionListener buttonListener){
        lblId = new JLabel("How do you look?");
        ButtonGroup group = new ButtonGroup();
        btnNext = new JButton("Next");
        btnPrev = new JButton("Previous");
        wear0 = new JRadioButton("Bright");
        wear1 = new JRadioButton("Sporty");
        wear2 = new JRadioButton("Casual");
        wear3 = new JRadioButton("Slacker");
        add(lblId);
        add(wear0);
        add(wear1);
        add(wear2);
        add(wear3);
        group.add(wear0);
        group.add(wear1);
        group.add(wear2);
        group.add(wear3);
        add(btnNext);
        add(btnPrev);
        wear0.addActionListener(buttonListener);
        wear1.addActionListener(buttonListener);
        wear2.addActionListener(buttonListener);
        wear3.addActionListener(buttonListener);
        btnNext.addActionListener(buttonListener);
        btnPrev.addActionListener(buttonListener);
    }
    
    
    
}
