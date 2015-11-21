/*
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



/**
 * Created by sheverdinK on 21.11.2015.
 */

/*

public class PerfomAction extends MainFrame implements ActionListener, ItemListener {
    Panels panels;
    String myStatus;

    */
/*public  void addAction () {
        this.panels  = new Panels ();
        panels.jButtonOK.addActionListener (this);
        panels.jButtonClose.addActionListener (this);

        panels.jRadioButtonMarried.addItemListener(this);
        panels.jRadioButtonSingle.addItemListener(this);
        panels.jRadioButtonDivorced.addItemListener(this);

    }*//*


    @Override
    public void actionPerformed (ActionEvent event) {
        if(event.getSource() == panels.jButtonClose) {
            System.out.println (">>>Close<<<");
            MainFrame mainFrame = new MainFrame ();
            mainFrame.jFrame.dispose ();
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

            System.out.println("Hello " + panels.jTextFieldName.getText() + " you like " + hobbies + " and you are " + myStatus);
        }
    }

    @Override
    public void itemStateChanged (ItemEvent event) {
        if(event.getStateChange() == ItemEvent.SELECTED)
        {
            JRadioButton selectedRadio = (JRadioButton)event.getItem();
            this.myStatus = selectedRadio.getText();
        }

    }
}
*/
