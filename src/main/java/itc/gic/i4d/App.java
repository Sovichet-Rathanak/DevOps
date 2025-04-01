package itc.gic.i4d;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Hello JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
        
        // Create a label with text
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
