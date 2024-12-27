package ex1;

import javax.swing.*;

public class GameWindow {
    private JFrame jframe;

    public  GameWindow(GamePanel gamePanel){
        jframe = new JFrame();

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.pack();
        jframe.setResizable(false);
        jframe.setVisible(true);
    }
}
