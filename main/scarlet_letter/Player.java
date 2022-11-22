package scarlet_letter;

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
    int gra2 = 4;
    int gra3 = 29;
    int gra4 = 3;

    
    x+=velX;
    y+=velY;
    if (x <0) {
        x = 1200;
        }
        if (x>= 1250-gra) {
        x=1250-gra;
        }
        if (y<=0) {
        y=0;
        }
        if (y>=650-gra) {
        y=650-gra;
        }
        //maze border
        if (130-gra2 <= x  & x <=  1115-gra2  & 70-gra2 <=  y  &  y <= 75-gra2) {
            y = 71;
        }  if (130-gra2 <= x  & x <=  1115-gra2  & 480-gra2 <=  y  &  y <= 485-gra2) {
            y = 475;
        }  if (130-gra2 <= x  & x <=  135-gra2  & 70-gra2 <=  y  &  y <= 250-gra2) {
            x = 135;
        }  if (130-gra2 <= x  & x <=  135-gra2  & 285-gra2 <=  y  &  y <= 505-gra2) {
            x = 135;
        } if (1090-gra2 <= x  & x <=  1095-gra2  & 70-gra2 <=  y  &  y <= 250-gra2) {
            x = 1085;
        }  if (1090-gra2 <= x  & x <=  1095-gra2  & 285-gra2 <=  y  &  y <= 505-gra2) {
            x = 1085;
        } 
        //mini vertical
     if (830-gra3 <= x  & x <=  832-gra3  & 70-gra2 <=  y  &  y <= 255-gra2) {
        x = 823-gra;
    }  if (830-gra2 <= x  & x <=  832-gra2  & 70-gra2 <=  y  &  y <= 255-gra2) {
        x = 832;
    }
    if (970-gra3 <= x  & x <=  975-gra3  & 156-gra2 <=  y  &  y <= 330-gra2) {
            x = 969-gra;
        }  if (970-gra2 <= x  & x <=  975-gra2  & 156-gra2 <=  y  &  y <= 330-gra2) {
            x = 976;
        }
        if (690-gra3 <= x  & x <=  695-gra3  & 242-gra2 <=  y  &  y <= 242+180-gra2) {
            x = 689-gra;
        }  if (690-gra2 <= x  & x <=  695-gra2  & 242-gra2 <=  y  &  y <= 242+180-gra2) {
            x = 696;
        }
        if (270-gra3 <= x  & x <=  275-gra3  & 328-gra2 <=  y  &  y <= 335+180-gra2) {
            x = 269-gra;
        }  if (270-gra2 <= x  & x <=  275-gra2  & 328-gra2 <=  y  &  y <= 335+180-gra2) {
            x = 276;
        } if (410-gra3 <= x  & x <=  415-gra3  & 242-gra2 <=  y  &  y <= 247+90-gra2) {
            x = 409-gra;
        }  if (410-gra2 <= x  & x <=  415-gra2  & 242-gra2 <=  y  &  y <= 247+90-gra2) {
            x = 416;
        } if (550-gra3 <= x  & x <=  555-gra3  & 242-gra2 <=  y  &  y <= 247+90-gra2) {
            x = 549-gra;
        }  if (550-gra2 <= x  & x <=  555-gra2  & 242-gra2 <=  y  &  y <= 247+90-gra2) {
            x = 556;
        }
        //mini 
        if (410-gra3 <= x  & x <=  410+420+5-gra3  & 156-gra <=  y  &  y <= 156+5-gra) {
            y = 155-gra;
        }  if (410-gra2 <= x  & x <=  410+420+5-gra2  & 156-gra2 <=  y  &  y <= 156+5-gra2) {
            y = 162+gra4;
        }
        if (130-gra3 <= x  & x <=  130+420+5-gra3  & 242-gra <=  y  &  y <= 242+5-gra) {
            y = 242-gra-1;
        }  if (130-gra2 <= x  & x <=  130+420+5-gra2  & 242-gra2 <=  y  &  y <= 242+5-gra2) {
            y = 242+5+1+gra4;
        }
        if (550-gra3 <= x  & x <=  550+420+5-gra3  & 328-gra <=  y  &  y <= 328+5-gra) {
            y = 328-gra-1;
        }  if (550-gra2 <= x  & x <=  550+420+5-gra2  & 328-gra2 <=  y  &  y <= 328+5-gra2) {
            y = 328+5+1+gra4;
        }
        if (270-gra3 <= x  & x <=  270+420+5-gra3  & 416-gra <=  y  &  y <= 416+5-gra) {
            y = 416-gra-1;
        }  if (270-gra2 <= x  & x <=  270+420+5-gra2  & 416-gra2 <=  y  &  y <= 416+5-gra2) {
            y = 416+5+1+gra4;
        }
        if (550-gra3 <= x  & x <=  550+420+5-gra3  & 416-gra <=  y  &  y <= 416+5-gra) {
            y = 416-gra-1;
        }  if (550-gra2 <= x  & x <=  550+420+5-gra2  & 416-gra2 <=  y  &  y <= 416+5-gra2) {
            y = 416+5+1+gra4;
        }

        //image 
        if (450-gra3 <= x  & x <=  650-gra3  & 0 <=  y  &  y <= 70-gra2) {
            x = 450-gra;
        }  if (450-gra2 <= x  & x <=  650-gra2  & 0 <=  y  &  y <= 70-gra2) {
            x = 650;
        } if (450-gra3 <= x  & x <=  655-gra3  & 500-gra2 <=  y  &  y <= 650-gra2) {
            x = 450-gra;
        }  if (450-gra2 <= x  & x <=  655-gra2  & 500-gra2 <=  y  &  y <= 650-gra2) {
            x = 650;
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
