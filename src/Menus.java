import javax.swing.*;

/**
 * Created by sheverdinK on 21.11.2015.
 */
class Menus {
    final JMenuBar jMenuBar = new JMenuBar ();
    private JMenu fileMenu;
    private JMenu helpMenu;
    private JMenu editMenu;

    public Menus () {
        mainMenu ();
        setFileMenu ();
        setHelpMenu ();
    }

    private void mainMenu() {
        this.fileMenu = new JMenu ("File");
        this.helpMenu = new JMenu ("Help");
        this.editMenu = new JMenu ("Edit");
        jMenuBar.add (fileMenu);
        jMenuBar.add (helpMenu);
    }

    private void setFileMenu() {
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

    private void setHelpMenu() {
        JMenuItem helpItem = new JMenuItem ("Help");
        JMenuItem aboutItem = new JMenuItem ("About");
        this.helpMenu.add (helpItem);
        this.helpMenu.add (aboutItem);
    }

    private void setEditMenu() {
        JMenuItem cutItem = new JMenuItem ("Cut");
        JMenuItem copyItem = new JMenuItem ("Copy");
        JMenuItem pasteItem = new JMenuItem ("Paste");
        this.editMenu.add (cutItem);
        this.editMenu.add(copyItem);
        this.editMenu.add (pasteItem);
    }

}
