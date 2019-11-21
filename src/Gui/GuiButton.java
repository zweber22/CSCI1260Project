package Gui;

import GameOfUr.Game;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiButton
{
    private State currentState = State.RELEASED;
    private Rectangle clickableBox;
    private ArrayList<ActionListener> actionListeners;
    private String text = ""; //This will be the text that is displayed on the button

    private Color pressed;
    private Color released;
    private Color hover;
    private Font font = Game.main.deriveFont(20f);

    //Constructor that creates a  new rectangle for our buttons
    public GuiButton(int x, int y, int width, int height)
    {
        clickableBox = new Rectangle(x, y, width, height);
        actionListeners = new ArrayList<ActionListener>();
        pressed = new Color (119, 119, 119);
        released = new Color(195, 195, 195);
        hover = new Color(145, 145, 145 );

    }

    public void update() {}

    //checks to see what the current state of the button is and sets the appropriate color to the rectangle clickableBox
    public void render(Graphics2D g)
    {
        if(currentState == State.PRESSED)
        {
            g.setColor(pressed);
            g.fill(clickableBox);
        }
        else if(currentState == State.RELEASED)
        {
            g.setColor(released);
            g.fill(clickableBox);
        }
        else
        {
            g.setColor(hover);
            g.fill(clickableBox);
        }
        g.setColor(Color.white); //We are resetting the color back to white in order to draw the text
        g.setFont(font);
        g.drawString(text, clickableBox.x + clickableBox.width / 2 - TextUtils.getMessageWidth(text, font, g) / 2);
    }



    //This enum holds a list of all the different possible states that a button can have
    private enum State
    {
        RELEASED,
        HOVER,
        PRESSED
    }

}
