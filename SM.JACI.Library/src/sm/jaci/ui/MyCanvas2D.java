/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jaci.ui;

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
    CanvasParameters parameters;

    Point startingPoint;

    public MyCanvas2D() {
        parameters = new CanvasParameters();
        this.figuresList = new ArrayList<>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(parameters.getActive_color());
        for (Shape s : figuresList) {
            if (parameters.getFilled()) {
                g2d.fill(s);
            }
            g2d.draw(s);
        }
        g2d.draw(new Rectangle(100, 100));
        repaint();
    }

    private void createShape(Point2D p) {
        switch (parameters.getFigureType()) {
            case RECTANGLE:
                figuresList.add(new Rectangle(startingPoint));
        }
    }

    public CanvasParameters getParameters() {
        return parameters;
    }

    public void setParameters(CanvasParameters parameters) {
        this.parameters = parameters;
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
        if (parameters.getEdit()) {
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
}
