package scarlet_letter;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import scarlet_letter.Game;
import scarlet_letter.SpiteSheet;
public class Bullet1 {
    private double x;
private double y;

private BufferedImage verticalm;

public Bullet1 (double x, double y, Game game) {
    this.x = x;
    this.y = y;
SpiteSheet bb = new SpiteSheet (game.getbullet());
verticalm = bb.grabImage(1,1,5, 190);
}
 public void tick() {
    
   
}
public void render (Graphics g) {
    g.drawImage(verticalm,(int)x,(int)y, null);

}
}
