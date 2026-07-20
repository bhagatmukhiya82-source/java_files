import java.awt.*;
import java.awt.event.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Frame frame = new Frame("Library Management System");
        frame.setLayout(new FlowLayout());
        Label welcomeLabel = new Label("Welcome to the Library");
        Button btnIssue = new Button("Issue Book");
        Button btnReturn = new Button("Return Book");
        frame.add(welcomeLabel);
        frame.add(btnIssue);
        frame.add(btnReturn);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setResizable(false);
        frame.setSize(400, 150);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        frame.setVisible(true);
    }
}