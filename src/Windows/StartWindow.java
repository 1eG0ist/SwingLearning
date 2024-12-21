package Windows;

import javax.swing.*;

public class StartWindow {

    private JFrame window;

    public StartWindow() {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setTitle("Starting Window");
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
    }

    public void show() {
        window.setVisible(true);
    }

}
