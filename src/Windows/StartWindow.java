package Windows;

import javax.swing.*;
import java.awt.*;

public class StartWindow {

    private JFrame window;

    public StartWindow() {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setTitle("Starting Window");
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);

        window.add(new JTextArea("Lol KEK"));
    }

    public void show() {
        window.setVisible(true);
    }

}
