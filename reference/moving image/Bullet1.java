import java.awt.Graphics;
import java.awt.image.BufferedImage;

import tutorial.Game;
import tutorial.SpiteSheet;
public class SpiteSheet2 {
    private double x;
private double y;

private BufferedImage verticalm;

public SpiteSheet2 (double x, double y, Game game) {
    this.x = x;
    this.y = y;
SpiteSheet bb = new SpiteSheet (game.getbullet());
verticalm = bb.grabImage(1,1,5, 190);
}
 public void tick() {
    
   
}
public void render (Graphics g) {
    g.drawImage(vert,(int)x,(int)y, null);

}
}
