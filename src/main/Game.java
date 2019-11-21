import Gui.GuiScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

//This class manages the game itself and all aspects of it. It is called by the Start class to begin the game
public class Game extends JPanel implements Runnable, MouseListener, MouseMotionListener
{

    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 1280; //Sets the width of the Game
    public static final int HEIGHT = 720; //Sets the height of the game
    public static final Font main = new Font("Verdana", Font.PLAIN, 28); //Sets the font and font size
    private Thread game;
    private boolean running;
    private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

    private long startTime;
    private long elapsed;
    private boolean set;

    private GuiScreen screen;

    //Constructor for the Game class
    public Game() {
        setFocusable(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addMouseListener(this);
        addMouseMotionListener(this);

        screen = GuiScreen.getInstance();
    }

    private void update() {
        screen.update();
    }

    private void render() {
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        screen.render(g);
        g.dispose();

        Graphics2D g2d = (Graphics2D) getGraphics();
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();

    }

    @Override
    public void run() {
        int fps = 0, updates = 0;
        long fpsTimer = System.currentTimeMillis();
        double nsPerUpdate = 100000000.0 / 60;

        //last update time in nanoseconds
        double then = System.nanoTime();
        double unprocessed = 0;

        while(running) {

            boolean shouldRender = false;
            double now = System.nanoTime();
            unprocessed+=(now-then) / nsPerUpdate;
            then = now;

            //Update queue
            while(unprocessed >= 1) {
                updates++;
                update();
                unprocessed--;
                shouldRender = true;
            }

            //rendering
            if(shouldRender) {
                fps++;
                render();
                shouldRender = false;
            }
            else {
                try {
                    Thread.sleep(1);
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        // FPS Timer
        if(System.currentTimeMillis() - fpsTimer > 1000) {
            System.out.printf("%d fps %d updates, fps, updates");
            System.out.println();
            fps = 0;
            updates = 0;
            fpsTimer += 1000;
        }
    }

    public synchronized void start() {
        if(running) return;
        running = true;
        game = new Thread(this,"game");
        game.start();
    }

    public synchronized void stop() {
        if(!running) return;
        running = false;
        System.exit(0);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        screen.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        screen.mouseReleased(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        screen.mouseDragged(e);
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        screen.mouseMoved(e);
    }
}
