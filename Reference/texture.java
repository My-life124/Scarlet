package tutorial;
import java.awt.image.BufferedImage;

import tutorial.SpiteSheet;

import tutorial.Game;
public class texture {
private SpiteSheet ss;
public BufferedImage player, enemy;

public texture(Game game) {
ss = new SpiteSheet(game.getspiteSheet());
getTexture();
}

public void getTexture() {
player = ss.grabImage(1,1,32,32);
enemy =ss.grabImage(3,1,32,32);
}

}
