import java.awt.*;
import java.awt.event.*;

public class  LoginInterface{
    public static void main(String[] args) {

        Frame frame = new Frame("Secure Gateway");
        frame.setLayout(new FlowLayout());


        Label lblWelcome = new Label("Welcome to Java GUI");


        Label lblPass = new Label("Password: ");
        TextArea tfPass = new TextArea(5,20);


        Checkbox chkRemember = new Checkbox("Remember Me");
        Checkbox chkSignup = new Checkbox("SignUP");

        Button btnSubmit = new Button("Submit");


        frame.add(lblWelcome);
        frame.add(lblPass);
        frame.add(tfPass);
        frame.add(chkRemember);
        frame.add(btnSubmit);
        frame.add(chkSignup);



        frame.setSize(300, 250);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        frame.setVisible(true);
    }
}