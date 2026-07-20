import javax.swing.*;
import java.awt.*;

class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        frame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Standard Text Label");

        JLabel label2 = new JLabel("Welcome to Java swing");
        label2.setForeground(Color.RED);
        label2.setFont(new Font("Arial", Font.BOLD, 16));

        frame.add(label1);
        frame.add(label2);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}