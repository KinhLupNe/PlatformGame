package ex1;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static ex1.Game.GAME_HEIGHT;
import static ex1.Game.GAME_WIDTH;
import static utilz.Constants.Directions.*;
import static utilz.Constants.PlayerConstants.*;
// nơi render giao diện , thao tác người ddung
public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private Game game;

    public GamePanel(Game game){
         mouseInputs = new MouseInputs(this);
         this.game = game;

         setPanelSize();
         addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void setPanelSize() {
        Dimension size= new Dimension(GAME_WIDTH,GAME_HEIGHT);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void updateGame(){

    }

    public  Game getGame() {
        return game;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.render(g);
    }
}
