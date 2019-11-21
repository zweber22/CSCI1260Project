package Gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class GuiScreen
{
    private static GuiScreen screen;
    private static HashMap<String, GuiPanel> panels;
    private String currentPanel = ""; //String is used to identify which panel to give focus to in the HashMap
                                      //when the click events are updated, rendered and passed

    //Constructor for the gui screen
    private GuiScreen()
    {
        panels = new HashMap<String, GuiPanel>();

    }

    //Gets instance of the the screen and calls the constructor to make a new gui
    //if there isn't one already made
    public static GuiScreen getInstance()
    {
        if(screen == null) //If the screen is null...
        {
            screen = new GuiScreen(); //...then create a new screen
        }
        return screen;
    }

    //rendering is doing all the drawing and updating is doing all the logic in the "Game" class
    public void update()
    {
        if (panels.get(currentPanel) != null) //If the panel is not null..
        {
            panels.get(currentPanel).update(); //...then update the current panel
        }
    }

    public void render(Graphics2D g)
    {
        if (panels.get(currentPanel) != null) //If the panel is not null..
        {
            panels.get(currentPanel).render(g); //...then render the graphics on the current panel
        }
    }

    //Allows users to add or set the current panel (Try making enum class to hold all the panels?)
    public void add(String panelName, GuiPanel panel)
    {
        panels.put(panelName, panel);
    }

    public void setCurrentPanel(String panelName)
    {
        currentPanel = panelName;
    }

    public void mousePressed(MouseEvent e)
    {
        if(panels.get(currentPanel) != null)
        {
            panels.get(currentPanel).mousePressed(e);
        }
    }

    public void mouseReleased(MouseEvent e)
    {
        if(panels.get(currentPanel) != null)
        {
            panels.get(currentPanel).mouseReleased(e);
        }
    }

    public void mouseMoved(MouseEvent e)
    {
        if(panels.get(currentPanel) != null)
        {
            panels.get(currentPanel).mouseMoved(e);
        }
    }

    public void mouseDragged(MouseEvent e)
    {
        if(panels.get(currentPanel) != null)
        {
            panels.get(currentPanel).mouseDragged(e);
        }
    }
    
}
