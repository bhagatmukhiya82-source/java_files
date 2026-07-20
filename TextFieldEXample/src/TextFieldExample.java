iimport java.awt.*;
import java.awt.event.*;

public class TextFieldExample {
    public static void main(String[] args) {
        // Create the main frame window
        Frame frame = new Frame("TextField Example");
        frame.setLayout(new FlowLayout());

        // Create the label
        Label lbl = new Label("Enter Name:");

        // ADDED: Create a TextField with a width capacity of 20 columns
        TextField tf = new TextField(20);

        // Add the components to the window layout
        frame.add(lbl);
        frame.add(tf);

        // Configure frame size and window listener to allow closing
        frame.setSize(400, 150);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Render the frame visible on your desktop screen
        frame.setVisible(true);
    }
}