package WTAfiles;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  // Packages used in this program imported    

public class WTAlaunch extends JFrame 
{

    JPanel panMaster;
    CardLayout cardLayout;
    int nDig1, nDig2, nDig3;

    public WTAlaunch() //This is the CONSTRUCTOR method
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener buttonListener = new ButtonListener(); // defined below
        setLayout(new FlowLayout()); //Use this for now.
        setSize(810, 510); //Set the size of the JFrame
        setTitle("Generic Card Game"); //Put Title on top of JFrame
        setBackground(Color.yellow);
        setResizable(false);
        
        Pan1Name panOne = new Pan1Name(buttonListener);
        Pan2Gender panTwo = new Pan2Gender(buttonListener);
        Pan2Gender2 genFind = new Pan2Gender(digFinder);
        Pan3Face panThree = new Pan3Face(buttonListener);

        panMaster = new JPanel(new CardLayout());
        panMaster.add(panOne);
        panMaster.add(panTwo);
        panMaster.add(panThree);
        getContentPane().add(panMaster); 
        setVisible(true); //Make JFrame visible
        cardLayout = (CardLayout) panMaster.getLayout();
        
    }
    class ButtonListener implements ActionListener{
        

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button is pressed");
            String sAction;
            sAction = e.getActionCommand();
            if(sAction.equals("Next")){
                cardLayout.next(panMaster);                
            }
            if(sAction.equals("Previous")){
                cardLayout.previous(panMaster);
            }
        }
        
    }
        class DigFinder implements ActionListener{
        

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button is pressed");
            String sAction;
            sAction = e.getActionCommand();
            if(sAction.equals("Male0")){
                nDig1 = 0;               
            }
            else if(sAction.equals("Female1")){
                cardLayout.previous(panMaster);
            }
        }
        
    }
    
    public static void main(String args[])
    {    
        WTAlaunch cardLayoutTest = new WTAlaunch(); // This calls the constructor and runs it    
    }
}