package WTAfiles;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  // Packages used in this program imported    

public class WTAlaunch extends JFrame {

    JPanel panMaster;
    CardLayout cardLayout;
    public static String sDig1 = "0", sDig2 = "0", sDig3 = "0";

    public WTAlaunch() //This is the CONSTRUCTOR method
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener buttonListener = new ButtonListener(); // defined below
        setLayout(new FlowLayout()); //Use this for now.
        setSize(810, 510); //Set the size of the JFrame
        setTitle("Welcome to Animal Crossing!"); //Put Title on top of JFrame
        setBackground(Color.yellow);
        setResizable(false);

        Pan1Name panOne = new Pan1Name(buttonListener);
        Pan2Gender panTwo = new Pan2Gender(buttonListener);
        Pan3Wear panThree = new Pan3Wear(buttonListener);
        Pan4Face panFour = new Pan4Face(buttonListener);
        Pan5Fin panFive = new Pan5Fin(buttonListener);
        //Pan6Char panSix = new Pan6Char(buttonListener);

        panMaster = new JPanel(new CardLayout());
        panMaster.add(panOne);
        panMaster.add(panTwo);
        panMaster.add(panThree);
        panMaster.add(panFour);
        panMaster.add(panFive);
        getContentPane().add(panMaster);
        setVisible(true); //Make JFrame visible
        cardLayout = (CardLayout) panMaster.getLayout();

    }

    

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println(sDig1 + sDig2 + sDig3);
            String sAction;
            sAction = e.getActionCommand();
            if (sAction.equals("Next")) {
                cardLayout.next(panMaster);
            } else if (sAction.equals("Previous")) {
                cardLayout.previous(panMaster);
            } else if (sAction.equals("Male")) {
                sDig1 = "0";
            } else if (sAction.equals("Female")) {
                sDig1 = "1";
            } else if (sAction.equals("wear0")) {
                sDig2 = "0";
            } else if (sAction.equals("wear1")) {
                sDig2 = "1";
            } else if (sAction.equals("wear2")) {
                sDig2 = "2";
            } else if (sAction.equals("wear3")) {
                sDig2 = "3";
            } else if (sAction.equals("face0")) {
                sDig3 = "0";
            } else if (sAction.equals("face1")) {
                sDig3 = "1";
            } else if (sAction.equals("face2")) {
                sDig3 = "2";
            } else if (sAction.equals("face3")) {
                sDig3 = "3";
            } else if (sAction.equals("Create!")) {                                
                JFrame charframe = new JFrame();
                charframe.setLayout(new FlowLayout()); //Use this for now.
                charframe.setSize(200, 200); //Set the size of the JFrame
                charframe.setTitle("Welcome to Animal Crossing!"); //Put Title on top of JFrame
                charframe.setBackground(Color.yellow);
                charframe.setResizable(false);
                charframe.setVisible(true);
                //ImageIcon icon = new ImageIcon("src/WTAfiles/images/" + sDig1
                //        + sDig2 + sDig3 + ".png");
                //piclabel.add(icon);
                //piclabel.setSize(100, 100);
                //add(piclabel);
                
                
                charframe.add(new JLabel(new ImageIcon("src/WTAfiles/images/" + sDig1
                        + sDig2 + sDig3 + ".png")));
                        
            }
        }
    }

    public static void main(String args[]) {
        WTAlaunch cardLayoutTest = new WTAlaunch(); // This calls the constructor and runs it    
    }
}
