import javax.swing.*;
import java.awt.*;

public class JavaFrame2 {
    public static void main(String[] args) {
        Checkbox frame = new Checkbox();
        JFrame frame2 = new JFrame();
        frame2.add(frame);
        frame2.setSize(300,100);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

    }
}
