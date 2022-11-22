package scarlet_letter;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import scarlet_letter.Game;

import java.awt.Dimension;
import java.io.IOException;
import java.net.URL;

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
