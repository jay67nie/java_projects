package JExercise;

import javax.swing.*;
import java.awt.*;

public class Ex6 extends JPanel {
    public JLabel name, password;
    public JTextField s_name, s_password;
    public JButton submit, retrieve;

    public Ex6(){
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
        setLayout(new GridLayout(3,1));
        add(name);
        add(s_name);
        add(password);
        add(s_password);
        add(submit);
        add(retrieve);



    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Credentials");
        Ex6 myPanel = new Ex6();
        myFrame.add(myPanel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(300, 120);
        myFrame.setVisible(true);
    }

}
