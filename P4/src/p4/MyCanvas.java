/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import p4.MainWindow.FIGURE_TYPE;

/**
 *
 * @author jacortes
 */
public class MyCanvas extends JPanel implements MouseListener, MouseMotionListener {

    private Color activeColor;
    private MyFigure activeFigure = new MyFigure();
    private FIGURE_TYPE activeType;
    private Boolean isFilled = false;

    public MyCanvas() {
        super();
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(600, 500));
    }

    public MyCanvas(Color activeColor, MyFigure activeFigure, FIGURE_TYPE activeType, Boolean isFilled, LayoutManager layout) {
        super(layout);
        this.activeColor = activeColor;
        this.activeFigure = activeFigure;
        this.activeType = activeType;
        this.isFilled = isFilled;
    }

    public Color getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(Color activeColor) {
        this.activeColor = activeColor;
    }

    public MyFigure getActiveFigure() {
        return activeFigure;
    }

    public void setActiveFigure(MyFigure activeFigure) {
        this.activeFigure = activeFigure;
    }

    public FIGURE_TYPE getActiveType() {
        return activeType;
    }

    public void setActiveType(FIGURE_TYPE activeType) {
        this.activeType = activeType;
    }

    public Boolean getIsFilled() {
        return isFilled;
    }

    public void setIsFilled(Boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (activeType != null) {
            g.setColor(activeColor);
            int width, height;
            switch (activeType) {
                case OVAL:

                    if (isFilled) {
                        g.fillOval(activeFigure.getStart().x - 5, activeFigure.getStart().y - 5, 10, 10);

                    } else {
                        g.drawOval(activeFigure.getStart().x - 5, activeFigure.getStart().y - 5, 10, 10);
                    }
                    break;
                case SQUARE:
                    width = activeFigure.getFinish().x - activeFigure.getStart().x;
                    height = activeFigure.getFinish().y - activeFigure.getStart().y;
                    if (isFilled) {
                        g.fillRect(activeFigure.getStart().x, activeFigure.getStart().y, width, height);

                    } else {
                        g.drawRect(activeFigure.getStart().x, activeFigure.getStart().y, width, height);

                    }
                    break;
                case CIRCLE:
                    width = activeFigure.getFinish().x - activeFigure.getStart().x;
                    height = activeFigure.getFinish().y - activeFigure.getStart().y;
                    if (isFilled) {
                        g.fillOval(activeFigure.getStart().x, activeFigure.getStart().y, width, height);

                    } else {
                        g.drawOval(activeFigure.getStart().x, activeFigure.getStart().y, width, height);

                    }
                    break;
                case LINE:
                    g.drawLine(activeFigure.getStart().x, activeFigure.getStart().y, activeFigure.getFinish().x, activeFigure.getFinish().y);
                    break;
            }
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        System.out.println("Mouse pressed.");
        activeFigure.setStart(e.getPoint());
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        System.out.println("Mouse released.");
        activeFigure.setFinish(e.getPoint());
        this.repaint();
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        System.out.println("Mouse entered.");
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        System.out.println("Mouse exited.");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked.");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // activeFigure.setFinish(e.getPoint());
        //this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
