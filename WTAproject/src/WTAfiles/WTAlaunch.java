package WTAfiles;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  // Packages used in this program imported    

public class WTAlaunch extends JFrame 
{

    private static void setIcon(ImageIcon createImageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    JPanel panMaster;
    CardLayout cardLayout;
    String sDig1, sDig2, sDig3;
    String sCode;
    int nCode;

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
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = WTAlaunch.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    class ButtonListener implements ActionListener{
        

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("sj");
            String sAction;
            sAction = e.getActionCommand();
            if(sAction.equals("Next")){
                cardLayout.next(panMaster);                
            }
            else if(sAction.equals("Previous")){
                cardLayout.previous(panMaster);
            }
            else if(sAction.equals("Male")){
                sDig1 = "0";
            }
            else if(sAction.equals("Female")){
                sDig1 = "1";
            }
            else if (sAction.equals("wear0")){
                sDig2 = "0";
            }
            else if (sAction.equals("wear1")){
                sDig2 = "1";
            }
            else if (sAction.equals("wear2")){
                sDig2 = "2";
            }
            else if (sAction.equals("wear3")){
                sDig2 = "3";
            }
            else if (sAction.equals("face0")){
                sDig3 = "0";
            }
            else if (sAction.equals("face1")){
                sDig3 = "1";
            }
            else if (sAction.equals("face2")){
                sDig3 = "2";
            }
            else if (sAction.equals("face3")){
                sDig3 = "3";
            }
            else if (sAction.equals("Create!")) {
                sCode = sDig1 + sDig2 + sDig3;                
                System.out.println(sCode);
                WTAlaunch.setIcon(createImageIcon("H:\\vlgrcodes/"
                        + sCode
                        + ".png"));
            }
        }        
    }
    
    public static void main(String args[])
    {    
        WTAlaunch cardLayoutTest = new WTAlaunch(); // This calls the constructor and runs it    
    }
}