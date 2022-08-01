import javax.swing.*;
import java.awt.*;

public class JFrameExample2 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("My JFrame");
        frame.setSize(300,120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static class MyFrame extends JFrame {
        public MyFrame() {
            //super();
            setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
            add(new JButton("Button 1"));
            add(new JLabel("This is a JLabel"));
            add(new JButton("Button 2"));
            add(new JLabel("another Label"));
        }
    }
}
