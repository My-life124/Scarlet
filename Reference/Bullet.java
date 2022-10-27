package tutorial;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
public class Bullet {
    private double x;
private double y;

private BufferedImage bullet;

public Bullet (double x, double y, Game game) {
this.x = x;
this.y = y;

SpiteSheet bb = new SpiteSheet (game.getbullet());
bullet = bb.grabImage(1,1,32,32);
}
 public void tick() {
   x+= 5;

   
}
public void render (Graphics g) {
    g.drawImage(bullet,(int)x,(int)y, null);

}
}
