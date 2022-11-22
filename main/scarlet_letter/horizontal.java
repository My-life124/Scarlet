package scarlet_letter;


import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.awt.Graphics;
public class horizontal {
    private double x;
private double y;

private BufferedImage horizontal;

public horizontal (double x, double y, Game game) {
    this.x = x;
    this.y = y;
SpiteSheet bb = new SpiteSheet (game.gethorizontal());
horizontal = bb.grabImage(1,1,980, 5);
}
 public void tick() {

   
}
public void render (Graphics g) {
    g.drawImage(horizontal,(int)x,(int)y, null);

}
}
