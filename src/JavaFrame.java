import javax.swing.*;
import java.awt.*;

public class JavaFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("example");
        Button x = new Button("Click");
        frame.add(x);
        frame.setSize(300,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}
