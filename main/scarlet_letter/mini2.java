package scarlet_letter;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.awt.Graphics;
public class mini2 {
    private double x;
private double y;

private BufferedImage mini;

public mini2 (double x, double y, Game game) {
    this.x = x;
    this.y = y;
SpiteSheet bb = new SpiteSheet (game.getmini2());
mini = bb.grabImage(1,1,5, 90);
}
 public void tick() {

   
}
public void render (Graphics g) {
    g.drawImage(mini,(int)x,(int)y, null);

}
}
