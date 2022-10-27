package tutorial;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Game extends Canvas implements Runnable {
    
    private boolean running = false;
    private Thread thread;
    private BufferedImage  image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

    private BufferedImage player;
    private BufferedImage bullet;

    private BufferedImage spiteSheet = null;
    
    private Player p;
    private Bullet b;
    private Bullet c;

    public void init() {
    
    requestFocus();
    try {
         spiteSheet = ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\cricle-removebg-preview.png"));
         bullet = ImageIO.read(new File("C:\\Users\\abrar\\Downloads\\cricle-removebg-preview.png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    addKeyListener(new KeyInput(this));
    p = new Player(200, 200,this);
    b =  new Bullet(300, 300, this);
   
    // for (int x= 5000;  x > System.currentTimeMillis();) {
        
    //     }
    if (System.currentTimeMillis()  > 1000000) {
        c =  new Bullet(400, 400, this);
    }
   
    
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
		timer +=1000;
		System.out.println("FPS:"+ frames +"TICKS:" +updates);
        System.out.println(System.currentTimeMillis()  - timer);
		frames = 0;
		updates = 0;
}
}
    }

    private void tick() {
        p.tick();
        b.tick();
        c.tick();
      
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
       // g.drawImage(player, 100, 100, this);
/////
        g.dispose();
        bs.show();
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_D) {
            p.setVelX(1.1);
        } 
         if (key == KeyEvent.VK_A) {
            p.setVelX(-1.1);
        } 
        if (key == KeyEvent.VK_S) {
            p.setVelY(1.1);

        }
         if (key == KeyEvent.VK_W) {
            p.setVelY(-1.1);

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
        new window(800, 600, "Game", new Game());
    }

    public BufferedImage getspiteSheet() {
        return spiteSheet;
        }
        public BufferedImage getbullet() {
            return bullet;
            }
    }