package tutorial;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.awt.Graphics;
public class SpiteSheet2 {
    private double x;
private double y;

private BufferedImage horizontal;

public SpiteSheet2 (double x, double y, Game game) {
    this.x = x;
    this.y = y;
SpiteSheet bb = new SpiteSheet (game.getspiteSheet2());
horizontal = bb.grabImage(1,1,29/*980 */, 80);
}
 public void tick() {
    
   
}
public void render (Graphics g) {
    g.drawImage(horizontal,(int)x,(int)y, null);

}
}
