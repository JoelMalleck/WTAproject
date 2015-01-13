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
import javax.swing.JTextField;

public class Pan2Gender extends JPanel{
    JButton btnNext, btnPrev;
    JLabel lblId;
    JRadioButton Male, Female;
    
    public Pan2Gender(ActionListener buttonListener){
        lblId = new JLabel("What is your gender?");
        ButtonGroup group = new ButtonGroup();
        Male = new JRadioButton("Male");
        Female = new JRadioButton("Female");
        btnNext = new JButton("Next");
        btnPrev = new JButton("Previous");
        add(lblId);
        add(Male);
        add(Female);
        group.add(Male);
        group.add(Female);
        add(btnNext);
        add(btnPrev);
        Male.addActionListener(buttonListener);
        Female.addActionListener(buttonListener);
        btnNext.addActionListener(buttonListener);
        btnPrev.addActionListener(buttonListener);      
    }         
}
