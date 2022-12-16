package scarlet_letter;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
//import java.SpiteSheet2;

public class Game extends Canvas implements Runnable {
    
    private boolean running = false;
    private Thread thread;
    private BufferedImage  image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

    private BufferedImage player;
    private BufferedImage verticalm;
    private BufferedImage horizontal;
    private BufferedImage Bullet1;
    private BufferedImage mini, minivertical, mini2;
    private BufferedImage spiteSheet = null;
    private BufferedImage spiteSheet2,spiteSheet3, spiteSheet4; 

    
    private Player p;
    private Bullet1 b;
    private Bullet1 c, f, h;
    private horizontal d, e;
    private mini i, j, k, l, m;
    private minivertical n, r, s, t;
    private mini2 o, q;
    //private SpiteSheet2 Up;
    private SpiteSheet3 down;
    private SpiteSheet4 right;
    long timer = System.currentTimeMillis();
    public void init() {
    
    requestFocus();
    //move them to download file work change file location
    try {
         spiteSheet = ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\image-2.png"));
         verticalm = ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\Capture-removebg-preview_1_5x190.png"));
         horizontal= ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\frame_0_delay-0.01s-removebg-preview_1_980x5.png"));
         mini= ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\frame_0_delay-0.01s-removebg-preview_1_980x5_392x5_1_405x5 (1).png"));
         mini2= ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\Capture-removebg-preview_1_1_5x170 (2).png"));
         minivertical= ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\Capture-removebg-preview_1_1_5x170 (3).png"));
         spiteSheet2 = ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\IMG_7041-removebg-preview (1).png"));
         spiteSheet3 = ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\image (1).png"));
         spiteSheet4 = ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\IMG_7039-removebg-preview (1).png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    addKeyListener(new KeyInput(this));
    p = new Player(87, 267,this);
    //vertical
    b =  new Bullet1(130, 70, this);
    c =  new Bullet1(130, 310, this);
    f =  new Bullet1(1110, 70, this);
    h =  new Bullet1(1110, 310, this);

    //horizontal
    d = new horizontal(130, 70, this);
    e = new horizontal(130, 500, this);

    //mini
    i = new mini (410, 156, this);
    j = new mini(130, 242, this);
    l = new mini(550, 328, this);
    k = new mini (270, 416, this);
    m = new mini (550, 416, this);
    //minivertical
    n = new minivertical (830, 70, this);
    o = new mini2 (410, 242, this);
    q = new mini2(550, 242, this);
    r = new minivertical (970, 156, this);
    s = new minivertical (690, 242, this);
    t = new minivertical (270, 328, this);

   // Up = new SpiteSheet2(550, 545, this);
    down = new SpiteSheet3(550, -5, this);
    right= new SpiteSheet4(1170, 260, this);


    
    
    //SpiteSheet  SpiteSheet  = new SpiteSheet(spiteSheet);
    // player = SpiteSheet.grabImage(1,1,12,12);
    }
public synchronized void start() {
    if (running) 
    return;
running = true;
thread = new Thread(this);
thread.start();
}
    public void run() {
    init();
    long lastTIme = System.nanoTime();
    double amountofTicks = 31.0;
    double ns = 1000000000 / amountofTicks;
    double delta = 0;
    long timer = System.currentTimeMillis();
    int updates = 0;
    int frames = 0;
    while (running) {
	long now =  System.nanoTime();
	delta+= (now-lastTIme)/ ns;
	lastTIme = now;
	while (delta>=1) {
	tick();
	updates++;
	delta--;
}
	render();
	frames++;
	
	if (System.currentTimeMillis() - timer > 1000) {
		timer +=2000;
		System.out.println("FPS:"+ frames +"TICKS:" +updates);
        System.out.println(p.getX());
        System.out.println(p.getY());

        
        
        // System.out.println(timer);
		frames = 0;
		updates = 0;
}
}
    }

    private void tick() {
        p.tick();
        b.tick();
        c.tick();
        d.tick();
        e.tick();
        f.tick();
        h.tick();
        i.tick();
        j.tick();
        k.tick();
        l.tick();
        m.tick();
        n.tick();
        o.tick();
        q.tick();
        r.tick();
        s.tick();
        t.tick();
      //  Up.tick();
        down.tick();
        right.tick();
      
    }
    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
	        this.createBufferStrategy(3);
	        return;
        }
        Graphics g =bs.getDrawGraphics();
        //////////
        g.setColor(Color.white);
        g.fillRect(0,0, getWidth(), getHeight());
        
        p.render(g);
        b.render(g);
        c.render(g);
        d.render(g);
        e.render(g);
        f.render(g);
        h.render(g);
        i.render(g);
        j.render(g);
        k.render(g);
        l.render(g);
        m.render(g);
        n.render(g);
        o.render(g);
        q.render(g);
        r.render(g);
        s.render(g);
        t.render(g);
       // Up.render(g);
        down.render(g);
        right.render(g);
        
       // g.drawImage(player, 100, 100, this);
/////
        g.dispose();
        bs.show();
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_D) {
            p.setVelX(3);
        } 
         if (key == KeyEvent.VK_A) {
            p.setVelX(-3);
        } 
        if (key == KeyEvent.VK_S) {
            p.setVelY(3);

        }
         if (key == KeyEvent.VK_W) {
            p.setVelY(-3);

        } 
    }
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();

            if(key == KeyEvent.VK_D) {
                p.setVelX(0);
            } 
             if (key == KeyEvent.VK_A) {
                p.setVelX(0);
            } 
            if (key == KeyEvent.VK_S) {
                p.setVelY(0);
    
            }
             if (key == KeyEvent.VK_W) {
                p.setVelY(0);
    
            } 
        }
    public static void main(String args[]) {
        new window(1250, 650, "Game", new Game());
    }

    public BufferedImage getspiteSheet() {
        return spiteSheet;
        }
        public BufferedImage getbullet() {
            return verticalm;
            }
            public BufferedImage gethorizontal() {
                return horizontal;
                }
            public BufferedImage getmini() {
                return mini;
                }
            public BufferedImage getminivertical() {
                return minivertical;
                }
                public BufferedImage getmini2() {
                    return mini2;
                    }
                    public BufferedImage getspiteSheet2() {
                        return spiteSheet2;
                        }
                        public BufferedImage getspiteSheet3() {
                            return spiteSheet3;
                            }
                            public BufferedImage getspiteSheet4() {
                                return spiteSheet4;
                                }
    }
