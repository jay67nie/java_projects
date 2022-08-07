package JExercise;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex8 extends JPanel {

    public Ex8() {

        try {
            File myObj = new File("C:\\Users\\Jerome\\IntelliJIDEAProjects\\Java Assignments\\src\\JExercise\\javax.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] components = data.split(", ");
                for (String s : components) {
                    String label = ++i+". " +s;
                    add(new JLabel(label));

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        setLayout(new GridLayout(5,11));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Ex8());
        frame.setTitle("JComponents");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,300);
        frame.setVisible(true);
    }
}