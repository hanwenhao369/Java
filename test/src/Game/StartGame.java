package Game;

import javax.swing.*;
import java.awt.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePanel gamePanel =new GamePanel();

        frame.setBounds(400,20,800,500);

        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePanel);
        frame.setVisible(true);

    }
}
