/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WTAfiles;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pan1Name extends JPanel{
    JButton btnNext, btnPrev;
    JLabel lblId;
    JTextField txtBox;
    String sName;
    
    public Pan1Name(ActionListener buttonListener){
        lblId = new JLabel("Enter your character's name!");
        btnNext = new JButton("Next");
        txtBox = new JTextField(12);
        add(lblId);
        add(txtBox);
        add(btnNext);
        btnNext.addActionListener(buttonListener);       
        sName = txtBox.getText();
        
    }
    
    
    
}
