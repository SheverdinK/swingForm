import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.FlowLayout.*;
import static java.awt.FlowLayout.CENTER;

/**
 * Created by sheverdinK on 20.11.2015.
 */
public class Panels {
    JPanel jPanel, bagPanel;
    JButton jButtonOK, jButtonClose;
    JTextField jTextFieldName;
    JCheckBox jCheckBoxDance, jCheckBoxMusic, jCheckBoxSport, jCheckBoxTV;
    ButtonGroup buttonGroup;
    JRadioButton  jRadioButtonMarried, jRadioButtonSingle, jRadioButtonDivorced;
    JLabel jLabel;
public static  String myStatus;

    public JPanel  southPanel () {
        Icon iconButtonOK = new ImageIcon ("D:\\Limudim\\JhonBrice\\JAVA\\myProjectIdea\\swingForm\\img\\ok6.jpg");
        Icon iconButtonClose = new ImageIcon ("D:\\Limudim\\JhonBrice\\JAVA\\myProjectIdea\\swingForm\\img\\close6.jpg");

        this.jButtonOK = new JButton ("",iconButtonOK );
        this.jButtonClose = new JButton ("",iconButtonClose);
        this.jPanel =  buildPanel (new FlowLayout (RIGHT), new LineBorder (black), new TitledBorder ("Name"), "Name", true);
        jPanel.add (jButtonOK);
        jPanel.add (jButtonClose);
        return jPanel;
    }

    public JPanel northPanel () {
        this.jTextFieldName = new JTextField ("", 50);

        jPanel = buildPanel (new FlowLayout (CENTER), new LineBorder (black), new TitledBorder ("Name"), "Name", true);

        jPanel.add (jTextFieldName);

        return jPanel;
    }

    public  JPanel westPanel () {

        this.jPanel = buildPanel (new GridLayout (10, 1), new LineBorder (black), new TitledBorder ("Hobbies"), "Hobbies", true);

        jCheckBoxDance = new JCheckBox ("DANCE");
        jCheckBoxMusic = new JCheckBox ("MUSIC");
        jCheckBoxSport = new JCheckBox ("SPORT");
        jCheckBoxTV = new JCheckBox (" T V  ");

        jPanel.add (jCheckBoxDance);
        jPanel.add (jCheckBoxMusic);
        jPanel.add (jCheckBoxSport);
        jPanel.add (jCheckBoxTV);

        return jPanel;
    }

    public JPanel eastPanel () {

       /* jRadioButtonMarried     = new JRadioButton ("Married", true);
        myStatus = "Married";
        jRadioButtonSingle      = new JRadioButton ("Single", false);
        jRadioButtonDivorced    = new JRadioButton ("Divorced", false);*/



        jRadioButtonMarried     = new JRadioButton ("Married");
        jRadioButtonSingle      = new JRadioButton ("Single");
        jRadioButtonDivorced    = new JRadioButton ("Divorced");

        buttonGroup = new ButtonGroup ();
        buttonGroup.add (jRadioButtonMarried);
        buttonGroup.add(jRadioButtonSingle);
        buttonGroup.add (jRadioButtonDivorced);

        jPanel= buildPanel (new GridLayout (10,1), new LineBorder (black), new TitledBorder ("State"), "State", true);

        jPanel.add (jRadioButtonMarried);
        jPanel.add (jRadioButtonSingle);
        jPanel.add (jRadioButtonDivorced);

        return  jPanel;
    }

    public JPanel centerPanel () {

        Icon iconCenterPanel = new ImageIcon ("D:\\Limudim\\JhonBrice\\JAVA\\myProjectIdea\\swingForm\\img\\icon.png");

        jLabel = new JLabel (iconCenterPanel);

        jPanel= buildPanel( new FlowLayout (), new LineBorder (black), new TitledBorder ("Profile Icon"), "Icon", true);

        jPanel.add (jLabel);

        return jPanel;
    }

    public JPanel buildPanel (LayoutManager layoutManager, LineBorder lineBorder, TitledBorder titledBorder, String name, boolean isVisible) {
        this.jPanel = new JPanel ();
        jPanel.setLayout (layoutManager);
        jPanel.setBorder (lineBorder);
        jPanel.setBorder (titledBorder);
        jPanel.setName (name);
        jPanel.setVisible (isVisible);
        return jPanel;
    }
}
