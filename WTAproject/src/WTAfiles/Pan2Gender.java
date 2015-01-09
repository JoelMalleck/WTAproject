/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WTAfiles;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Pan2Gender extends JPanel{
    JButton btnNext, btnPrev;
    JLabel lblId;
    JRadioButton Male0, Female1;
    
    public Pan2Gender(ActionListener buttonListener){
        lblId = new JLabel("Choose your gender!");
        btnNext = new JButton("Next");
        btnPrev = new JButton("Previous");
        add(lblId);
        add(btnNext);
        add(btnPrev);
        btnNext.addActionListener(buttonListener);
        btnPrev.addActionListener(buttonListener);      
    }
    public Pan2Gender2(ActionListener digFinder){
        lblId = new JLabel("Choose your gender!");
        btnNext = new JButton("Next");
        btnPrev = new JButton("Previous");
        Male0 = new JRadioButton("Male");
        Female1 = new JRadioButton("Female");
        add(lblId);
        add(Male0);
        add(Female1);
        add(btnNext);
        add(btnPrev);
        
        Male0.addActionListener(digFinder);
    }
    
    
    
}
