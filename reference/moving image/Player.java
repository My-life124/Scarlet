package tutorial;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
public class Player {
    private double x;
private double y;

private BufferedImage player;
private double velX = 0;
private double velY = 0;
public Player (double x, double y, Game game) {
this.x = x;
this.y = y;

SpiteSheet ss = new SpiteSheet (game.getspiteSheet());
player = ss.grabImage(1,1,32,32);
}
 public void tick() {
    int gra = 32;
    
    x+=velX;
    y+=velY;
    if (x <0) {
        x = 0;
        }
        if (x>= 800-gra) {
        x=800-gra;
        }
        if (y<=0) {
        y=0;
        }
        if (y>=600-gra) {
        y=600-gra;
        }
}
public void render (Graphics g) {
    g.drawImage(player,(int)x,(int)y, null);

}
public double getX() {
    return x;
    }
public double getY() {
    return y;
}
    public void setX(double x) {
    this.x = x;
    }
    public void setY(double y) {
    this.y = y;
    }
    public void setVelX(double velX) {
        this.velX = velX;
}
    public void setVelY(double velY) {
        this.velY = velY;
}
}
