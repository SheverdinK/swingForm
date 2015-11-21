import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import static java.awt.BorderLayout.*;
import static javax.swing.WindowConstants.*;

/**
 * Created by sheverdinK on 20.11.2015.
 */

class MainFrame implements ActionListener, ItemListener, WindowListener {

    private final JFrame jFrame;
    private  JPanel southPanel;
    private  JPanel northPanel;
    private  JPanel westPanel;
    private  JPanel eastPanel;
    private  JPanel centerPanel;
    private  Panels panels;
    private String myStatus;

    public MainFrame (String title, boolean isVisible) {

        jFrame = new JFrame (title);
        this.panels = new Panels ();

// Create Panels
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
// Settings
        jFrame.setDefaultCloseOperation (DO_NOTHING_ON_CLOSE);
        jFrame.pack ();
        jFrame.setVisible (isVisible);
        jFrame.setResizable (true);

        addAction ();

        panels.jRadioButtonMarried.isSelected() ;
    }
    private void addAction(){

        panels.jButtonOK.addActionListener (this);
        panels.jButtonClose.addActionListener (this);
        panels.jRadioButtonMarried.addItemListener(this);
        panels.jRadioButtonSingle.addItemListener(this);
        panels.jRadioButtonDivorced.addItemListener(this);
        jFrame.addWindowListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent event) {
        if(event.getSource() == panels.jButtonClose) {
            Object[] options = { "Yes", "NOooo!" };
            int n = JOptionPane
                    .showOptionDialog(jFrame, "You are sure?",
                            "Accept", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options,
                            options[0]);
            if (n == 0) {
                jFrame.setVisible(false);
                System.exit(0);
            }
        }
        else // ok button
        {
            String hobbies = "";

            if(panels.jCheckBoxDance.isSelected())
                hobbies += panels.jCheckBoxDance.getText() + " || ";
            if(panels.jCheckBoxSport.isSelected())
                hobbies += panels.jCheckBoxSport.getText() + " || ";
            if(panels.jCheckBoxMusic.isSelected())
                hobbies += panels.jCheckBoxMusic.getText() + " || ";
            if(panels.jCheckBoxTV.isSelected())
                hobbies += panels.jCheckBoxTV.getText() + " || ";
            panels.jTextArea.setVisible(true);
            panels.jTextArea.setText(
                    "\n     Hello      " + "        --> " + panels.jTextFieldName.getText() + " <-- \n"
                    + "     You like   " + "     --> " + hobbies + " <-- \n"
                    + "     And You are" + " --> " + myStatus + " <--");
//            System.out.println("Hello " + ">>> " + panels.jTextFieldName.getText() + " <<<" + " you like " + ">>> "  + hobbies + " <<<" + " and you are " + ">>> " + myStatus + " <<<");
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
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent event) {
        Object[] options = { "Yes", "NOooo!" };
        int n = JOptionPane
                .showOptionDialog(event.getWindow(), "You are sure?",
                        "Accept", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options,
                        options[0]);
        if (n == 0) {
            event.getWindow().setVisible(false);
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        jFrame.setState(JFrame.ICONIFIED);
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       // jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
