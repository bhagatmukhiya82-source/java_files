import java.awt.*;
import java.awt.event.*;

class GenderSelection {
    public static void main(String[] args) {
        Label label = new Label("SELECT YOUR GENDER");
        Frame frame = new Frame("Gender");
        frame.setSize(800, 650);
        frame.setLayout(new FlowLayout());

        CheckboxGroup group = new CheckboxGroup();
        Checkbox male = new Checkbox("MALE", group, false);
        Checkbox female = new Checkbox("FEMALE", group, false);
        Checkbox other = new Checkbox("other", group, false);

        frame.add(label);
        frame.add(male);
        frame.add(female);
        frame.add(other);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}