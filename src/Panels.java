import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.FlowLayout.*;

/**
 * Created by sheverdinK on 20.11.2015.
 */
class Panels {

    private JPanel jPanel;
//    Components
    JButton jButtonOK, jButtonClose;
    JTextField jTextFieldName;
    JCheckBox jCheckBoxDance, jCheckBoxMusic, jCheckBoxSport, jCheckBoxTV;
    private ButtonGroup buttonGroup;
    JRadioButton  jRadioButtonMarried, jRadioButtonSingle, jRadioButtonDivorced;
    JTextArea jTextArea;
    private JLabel jLabel;
//    URL
    private  static final String USER_ICON  = "img\\icon.png";
    private  static final String OK_ICON    = "img\\ok.jpg";
    private  static final String CLOSE_ICON = "img\\close.jpg";

    public JPanel  southPanel () {
        Icon iconButtonOK = new ImageIcon (OK_ICON);
        Icon iconButtonClose = new ImageIcon (CLOSE_ICON);
        this.jButtonOK = new JButton ("",iconButtonOK );
        this.jButtonClose = new JButton ("",iconButtonClose);
        this.jPanel =  buildPanel (
                new FlowLayout (RIGHT),
                new LineBorder (black),
                new TitledBorder ("Control"), "Control",
                true);
        jPanel.add (jButtonOK);
        jPanel.add (jButtonClose);
        return jPanel;
    }

    public JPanel northPanel () {
        this.jTextFieldName = new JTextField ("", 50);

        jPanel = buildPanel (
                new FlowLayout (CENTER),
                new LineBorder (black),
                new TitledBorder ("Name"), "Name",
                true);

        jPanel.add (jTextFieldName);
        return jPanel;
    }

    public  JPanel westPanel () {

        jCheckBoxDance = new JCheckBox ("DANCE");
        jCheckBoxMusic = new JCheckBox ("MUSIC");
        jCheckBoxSport = new JCheckBox ("SPORT");
        jCheckBoxTV = new JCheckBox (" T V  ");

        this.jPanel = buildPanel (
                new GridLayout (10, 1),
                new LineBorder (black),
                new TitledBorder ("Hobbies"), "Hobbies",
                true);

        jPanel.add (jCheckBoxDance);
        jPanel.add (jCheckBoxMusic);
        jPanel.add (jCheckBoxSport);
        jPanel.add (jCheckBoxTV);

        return jPanel;
    }

    public JPanel eastPanel () {
        jRadioButtonMarried  = new JRadioButton ("Married");
        jRadioButtonSingle   = new JRadioButton ("Single");
        jRadioButtonDivorced = new JRadioButton ("Divorced");

        buttonGroup = new ButtonGroup ();
        buttonGroup.add (jRadioButtonMarried);
        buttonGroup.add(jRadioButtonSingle);
        buttonGroup.add (jRadioButtonDivorced);

        jPanel= buildPanel (
                new GridLayout (10,1),
                new LineBorder (black),
                new TitledBorder ("State"), "State",
                true);

        jPanel.add (jRadioButtonMarried);
        jPanel.add (jRadioButtonSingle);
        jPanel.add (jRadioButtonDivorced);

        return  jPanel;
    }

    public JPanel centerPanel () {

        Icon iconCenterPanel = new ImageIcon (USER_ICON);

        jLabel = new JLabel (iconCenterPanel);
        jTextArea = new JTextArea("ANSWER: \n");
        jTextArea.setLineWrap(true);
        jTextArea.setVisible(false);
        jPanel= buildPanel(
                new GridLayout (2,1),
                new LineBorder (black),
                new TitledBorder ("Profile Icon"), "Icon",
                true);

        jPanel.add (jLabel);
        jPanel.add(jTextArea);
        return jPanel;
    }

    private JPanel buildPanel(LayoutManager layoutManager,
                              LineBorder lineBorder,
                              TitledBorder titledBorder,
                              String name,
                              boolean isVisible) {
        this.jPanel = new JPanel ();
        jPanel.setLayout (layoutManager);
        jPanel.setBorder (lineBorder);
        jPanel.setBorder (titledBorder);
        jPanel.setName (name);
        jPanel.setVisible (isVisible);
        return jPanel;
    }
}
