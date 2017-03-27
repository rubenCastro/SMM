/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jaci.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author jacortes
 */
public class MyCanvas2D extends JPanel implements MouseListener, MouseMotionListener {

    ArrayList<Shape> figuresList;
    Color active_color;
    Boolean filled = false;
    FigureTypes figureType;
    Double alpha;
    Boolean aliasing;
    Boolean edit = false;
    Point startingPoint;

    public MyCanvas2D() {
        this.figuresList = new ArrayList<>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(active_color);
        for (Shape s : figuresList) {
            if (filled) {
                g2d.fill(s);
            }
            g2d.draw(s);
        }
        g2d.draw(new Rectangle(100, 100));
        repaint();
    }

    private void createShape(Point2D p) {
        switch (figureType) {
            case RECTANGLE:
                figuresList.add(new Rectangle(startingPoint));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        startingPoint = e.getPoint();
        createShape(startingPoint);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (edit) {
        } else {
            ((Rectangle) figuresList.get(figuresList.size() - 1)).setFrameFromDiagonal(startingPoint, e.getPoint());
        }
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public ArrayList<Shape> getFiguresList() {
        return figuresList;
    }

    public void setFiguresList(ArrayList<Shape> figuresList) {
        this.figuresList = figuresList;
    }

    public Color getActive_color() {
        return active_color;
    }

    public void setActive_color(Color active_color) {
        this.active_color = active_color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public FigureTypes getFigureType() {
        return figureType;
    }

    public void setFigureType(FigureTypes figureType) {
        this.figureType = figureType;
    }

    public Double getAlpha() {
        return alpha;
    }

    public void setAlpha(Double alpha) {
        this.alpha = alpha;
    }

    public Boolean getAliasing() {
        return aliasing;
    }

    public void setAliasing(Boolean aliasing) {
        this.aliasing = aliasing;
    }

    public Boolean getEdit() {
        return edit;
    }

    public void setEdit(Boolean edit) {
        this.edit = edit;
    }

}
