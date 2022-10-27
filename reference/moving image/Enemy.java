package tutorial;

import java.awt.Graphics;

public class Enemy {
    private double x, y;
private texture tx;

public Enemy(double x, double y, texture tx) {
this.x =x;
this.y =y;
this.tx = tx;
}
public void tick(){
y-=5;
}
public void render(Graphics g) {
g.drawImage(tx.enemy, (int)x, (int)y, null);
}
public int getY() {
    return 0;
}
}
