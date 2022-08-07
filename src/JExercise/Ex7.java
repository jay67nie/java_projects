package JExercise;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex7 extends JFrame {

    public Ex7() {
        JPanel panel = new JPanel(new GridLayout(5,1));

        try {
            File myObj = new File("C:\\Users\\Jerome\\IntelliJIDEAProjects\\Java Assignments\\src\\JExercise\\javax.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] components = data.split(", ");
                for (String s : components) {
                    String label = ++i+". " +s;
                    panel.add(new JLabel(label));

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        add(panel);
    }

    public static void main(String[] args) {
        Ex7 frame = new Ex7();
        frame.setTitle("JComponents");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,300);
        frame.setVisible(true);
    }
}