import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import static java.awt.BorderLayout.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Created by sheverdinK on 20.11.2015.
 */
public class MainFrame implements ActionListener, ItemListener {

    JPanel southPanel, northPanel, westPanel, eastPanel, centerPanel;
    JFrame jFrame;
    Panels panels;
    String myStatus = Panels.myStatus;
  public MainFrame () {}

    public MainFrame (String title, boolean isVisible) {
        jFrame = new JFrame (title);
        this.panels = new Panels ();

        southPanel  = panels.southPanel ();
        northPanel  = panels.northPanel ();
        westPanel   = panels.westPanel ();
        eastPanel   = panels.eastPanel ();
        centerPanel = panels.centerPanel ();


        jFrame.add (southPanel,  BorderLayout.SOUTH);
        jFrame.add (northPanel,  NORTH);
        jFrame.add (westPanel,   WEST);
        jFrame.add (eastPanel,   EAST);
        jFrame.add (centerPanel, CENTER);

        Menus menus = new Menus ();
        jFrame.setJMenuBar (menus.jMenuBar);

        jFrame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        jFrame.pack ();
        jFrame.setVisible (isVisible);
        jFrame.setResizable (false);

        addAction ();

        panels.jRadioButtonMarried.isSelected() ;
    }
    public void addAction (){

        panels.jButtonOK.addActionListener (this);
        panels.jButtonClose.addActionListener (this);
        panels.jRadioButtonMarried.addItemListener(this);
        panels.jRadioButtonSingle.addItemListener(this);
        panels.jRadioButtonDivorced.addItemListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent event) {
        if(event.getSource() == panels.jButtonClose) {
           jFrame.dispose ();
        }
        else // ok button
        {
            String hobbies = "";

            if(panels.jCheckBoxDance.isSelected())
                hobbies += panels.jCheckBoxDance.getText() + " ";
            if(panels.jCheckBoxSport.isSelected())
                hobbies += panels.jCheckBoxSport.getText() + " ";
            if(panels.jCheckBoxMusic.isSelected())
                hobbies += panels.jCheckBoxMusic.getText() + " ";
            if(panels.jCheckBoxTV.isSelected())
                hobbies += panels.jCheckBoxTV.getText() + " ";

            System.out.println("Hello " + ">>> " + panels.jTextFieldName.getText() + " <<<" + " you like " + ">>> "  + hobbies + " <<<" + " and you are " + ">>> " + myStatus + " <<<");
        }
    }

    @Override
    public void itemStateChanged (ItemEvent event) {

        if(event.getStateChange() == ItemEvent.SELECTED)
        {
          JRadioButton   selectedRadio = (JRadioButton)event.getItem();
           myStatus = selectedRadio.getText();
        }
    }
}
