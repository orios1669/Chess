import javax.swing.*;
import java.awt.*;

class Gui {
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(8, 8));
        Box box = Box.createHorizontalBox();
        box.setBackground(Color.black);frame.add(box);

        //JButton button = new JButton("Press");
        //frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
}