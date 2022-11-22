package tutorial;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.awt.Graphics;
public class minivertical {
    private double x;
private double y;

private BufferedImage mini;

public minivertical (double x, double y, Game game) {
    this.x = x;
    this.y = y;
SpiteSheet bb = new SpiteSheet (game.getminivertical());
mini = bb.grabImage(1,1,5, 180);
}
 public void tick() {

   
}
public void render (Graphics g) {
    g.drawImage(mini,(int)x,(int)y, null);

}
}
