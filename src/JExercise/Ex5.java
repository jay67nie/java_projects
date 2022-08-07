package JExercise;

import javax.swing.*;
import java.awt.*;

public class Ex5 extends JFrame {
    public JLabel name, password;
    public JTextField s_name, s_password;
    public JButton submit, retrieve;

    public Ex5() {
        JPanel panel = new JPanel(new GridLayout(3,1));
        name = new JLabel("Enter name:");
        password = new JLabel("Enter password:");
        s_name = new JTextField("");
        s_password = new JPasswordField();
        submit = new JButton("Submit");
        submit.addActionListener(e -> {
            String post_name = s_name.getText();
            String post_password = s_password.getText();
            if(post_name != null && post_password != null) {
                MysqlCon.postDetails(post_name, post_password);
            }

        });
        retrieve = new JButton("Retrieve");
        retrieve.addActionListener(e -> {
            String get_name = s_name.getText();
            String get_password = s_password.getText();
            if(get_name != null && get_password != null){
                MysqlCon.getDetails(get_name, get_password, name, password);
            }

        });

        panel.add(name);
        panel.add(s_name);
        panel.add(password);
        panel.add(s_password);
        panel.add(submit);
        panel.add(retrieve);

        add(panel);
    }

    public static void main(String[] args) {
        Ex5 frame = new Ex5();
        frame.setTitle("Credentials");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);
    }
    }