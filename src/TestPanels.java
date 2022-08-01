import javax.swing.*;
import java.awt.*;

public class TestPanels extends JFrame {
    public TestPanels(){
        JPanel p1 = new JPanel(new FlowLayout());
        for(int i =1; i<=9; i++){
            p1.add(new JButton(""+i));
        }

        p1.add(new JButton(""+0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));
        p1.add(new JTextField("Time to be displayed here"));
        p1.add(new JButton("Food to be placed here"));
        add(p1);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        TestPanels gui = new TestPanels();
    }
}
