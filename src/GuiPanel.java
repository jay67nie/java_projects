import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JPanel {
    JCheckBox b1, b2, b3, b4;
    JRadioButton b5, b6, b7;

    public GuiPanel(){
        b1 =new JCheckBox("Option1");
        b2 =new JCheckBox("Option2");
        b3 =new JCheckBox("Option3");
        b4 =new JCheckBox("Option4");

        b5 = new JRadioButton("Selection a");
        b6 = new JRadioButton("Selection b");
        b7 = new JRadioButton("Selection c");

        ButtonGroup rads =  new ButtonGroup();
        rads.add(b5);
        rads.add(b6);
        rads.add(b7);

        JPanel p1 = new JPanel(new GridLayout(4,1));
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);

        JPanel p2 = new JPanel(new GridLayout(3,1));
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);

        JPanel whole = new JPanel();
        whole.add(p1);
        whole.add(p2);
        add(whole);


    }


    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My Frame");
        GuiPanel gui = new GuiPanel();
        myFrame.add(gui);
        myFrame.setSize(300,300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    }
}
