package itc.gic.i4d;

import java.awt.*;
import javax.swing.*;

/**
 * Hello world!
 */
public final class App {
    // Private constructor to prevent instantiation
    private App() {
    }

    /** Width of the application window in pixels. */
    private static final int FRAME_WIDTH = 300;

    /** Height of the application window in pixels. */
    private static final int FRAME_HEIGHT = 200;

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Hello JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(new BorderLayout());

        // Create a label with text
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}
