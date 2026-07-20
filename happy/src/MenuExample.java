import java.awt.*;
import java.awt.event.*;

class MenuExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Menu Example");

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        MenuItem saveFile = new MenuItem("Save");
        MenuItem closeFile = new MenuItem("Close");

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.addSeparator();
        fileMenu.add(closeFile);

        Menu editMenu = new Menu("Edit");
        MenuItem cutText = new MenuItem("Cut");
        MenuItem copyText = new MenuItem("Copy");
        MenuItem pasteText = new MenuItem("Paste");

        editMenu.add(cutText);
        editMenu.add(copyText);
        editMenu.add(pasteText);

        Menu helpMenu = new Menu("Help");
        MenuItem aboutUs = new MenuItem("About");
        helpMenu.add(aboutUs);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setMenuBar(menuBar);

        frame.setSize(400, 300);
        frame.setLayout(null);

        closeFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}