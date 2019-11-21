package Gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class GuiPanel
{
    private static ArrayList<GuiButton> buttons; //Creates an array list that will hold all of our buttons

    public GuiPanel()
    {
        buttons = new ArrayList<GuiButton>();

    }

    //rendering is doing all the drawing and updating is doing all the logic in the "Game" class
    public void update()
    {
        for (GuiButton b: buttons )
        {
            b.update;
        }
    }

    public void render(Graphics2D g)
    {
        for (GuiButton b: buttons)
        {
            b.render(g);
        }
    }

    public void add(GuiButton button)
    {
        buttons.add(button);
    }

    public void remove(GuiButton button)
    {
        buttons.remove(button);
    }

    public void mousePressed(MouseEvent e)
    {
        for (GuiButton b: buttons )
        {
            b.mousePressed(e);
        }
    }

    public void mouseReleased(MouseEvent e)
    {
        for (GuiButton b: buttons )
        {
            b.mouseReleased(e);
        }
    }

    public void mouseMoved(MouseEvent e)
    {
        for (GuiButton b: buttons )
        {
            b.mouseMoved(e);
        }
    }

    public void mouseDragged(MouseEvent e)
    {
        for (GuiButton b: buttons )
        {
            b.mouseDragged(e);
        }
    }
}
