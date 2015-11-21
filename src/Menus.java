import javax.swing.*;

/**
 * Created by sheverdinK on 21.11.2015.
 */
public class Menus {
    JMenuBar jMenuBar = new JMenuBar ();
    JMenu fileMenu, helpMenu, editMenu;

    public Menus () {
        mainMenu ();
        setFileMenu ();
        setHelpMenu ();
    }

    public void mainMenu () {
        this.fileMenu = new JMenu ("File");
        this.helpMenu = new JMenu ("Help");
        this.editMenu = new JMenu ("Edit");
        jMenuBar.add (fileMenu);
        jMenuBar.add (helpMenu);
    }

    public void setFileMenu () {
        JMenuItem newItem = new JMenuItem ("New");
        JMenuItem openItem = new JMenuItem ("Open");
        JMenuItem saveItem = new JMenuItem ("Save");
        JMenuItem closeItem = new JMenuItem ("Close");

        this.fileMenu.add (newItem);
        this.fileMenu.add (openItem);
        this.fileMenu.add (saveItem);
        this.fileMenu.add (closeItem);
        setEditMenu ();
        this.fileMenu.add (editMenu);
    }

    public void setHelpMenu () {
        JMenuItem helpItem = new JMenuItem ("Help");
        JMenuItem aboutItem = new JMenuItem ("About");
        this.helpMenu.add (helpItem);
        this.helpMenu.add (aboutItem);
    }

    public void setEditMenu () {
        JMenuItem cutItem = new JMenuItem ("Cut");
        JMenuItem copyItem = new JMenuItem ("Copy");
        JMenuItem pasteItem = new JMenuItem ("Paste");
        this.editMenu.add (cutItem);
        this.editMenu.add(copyItem);
        this.editMenu.add (pasteItem);
    }

}
