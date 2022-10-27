package tutorial;

import javax.swing.JFrame;

import tutorial.Game;

import java.awt.Dimension;

public class window {
    
    window (int w, int h, String title, Game game){
        game.setPreferredSize(new Dimension(w,h));
        game.setMaximumSize(new Dimension(w,h));
        game.setMinimumSize(new Dimension(w,h));

        JFrame frame = new JFrame(title);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);

        game.start();
    }
 
}
