package scarlet_letter;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
public class mini {
    private double x;
private double y;

private BufferedImage mini;

public mini (double x, double y, Game game) {
    this.x = x;
    this.y = y;
SpiteSheet bb = new SpiteSheet (game.getmini()); //save this file
mini = bb.grabImage(1,1,420, 5);
}
 public void tick() {

   
}
public void render (Graphics g) {
    g.drawImage(mini,(int)x,(int)y, null);

}
}
