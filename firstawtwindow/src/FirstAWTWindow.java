import java.awt.*;

public class FirstAWTWindow {
    public static void main(String[] args){
        Frame frame = new Frame("Label Demo");

        Label label = new Label("Welcome to Java GUI Programming", Label.CENTER);
        Button button = new Button("Click ME");

        Font customFont = new Font("Courier New", Font.BOLD, 20);

        label.setFont(customFont);
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLACK);

        button.setFont(customFont);
        button.setForeground(Color.BLACK);

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(button);

        frame.setSize(600, 350);
        frame.setBackground(Color.PINK);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
