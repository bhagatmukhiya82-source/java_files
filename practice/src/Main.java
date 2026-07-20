import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JLabel label = new JLabel();
        label.setText("bro do you even code");

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV boli",Font.PLAIN,20));
        label.setIconTextGap(-25);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}