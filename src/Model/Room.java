/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Color;
import java.awt.Graphics;
import javax.accessibility.AccessibleContext;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author Hp
 */
public class Room extends JPanel{
    public Room() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawLine(80, 150, 800, 150);
        g.drawLine(80, 150, 0, 400);
        g.drawLine(80, 150, 80, 0);
        g.drawLine(50, 130, 0, 270);
        g.drawLine(50, 130, 50, 50);
        g.drawLine(50, 50, 0, 185);
    }
}
