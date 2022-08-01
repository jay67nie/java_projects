import javax.swing.*;
import java.awt.*;

public class GuiPanel2 extends JPanel {
    private JButton activate, clear, quit;
    private JTextField jtf;
    private JLabel lab;

    public GuiPanel2() {
        activate = new JButton("Activate");
        clear = new JButton("Clear");
        quit = new JButton("Quit");
        jtf = new JTextField("", 15);
        lab = new JLabel("                          ");
        JPanel buttons = new JPanel(new GridLayout(3, 1));
        buttons.add(activate);
        buttons.add(clear);
        buttons.add(quit);
        JPanel fields = new JPanel(new GridLayout(2, 1));
        fields.add(jtf);
        fields.add(lab);
        JPanel whole = new JPanel(new BorderLayout());
        whole.add(buttons, BorderLayout.EAST);
        whole.add(fields, BorderLayout.CENTER);
        add(whole);
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My Frame");
        GuiPanel2 gui = new GuiPanel2();
        myFrame.add(gui);
        myFrame.setSize(300, 300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
