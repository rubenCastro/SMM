/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jaci.ui;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import javax.swing.JPanel;
import sm.jaci.graphics.MyLine2D;

/**
 *
 * @author jacortes
 */
public class MyCanvas2D extends JPanel implements MouseListener, MouseMotionListener {

    ArrayList<Shape> figuresList;
    CanvasParameters parameters;
    Point startingPoint;
    Point finishPoint;
    Shape grabbed_s;

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
        g2d.setStroke(new BasicStroke(parameters.getThickness()));
        if (parameters.getAliasing()) {
            RenderingHints rh = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHints(rh);
        }
        if (parameters.getAlpha()) {
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
        }
        g2d.setPaint(parameters.getActive_color());
        for (Shape s : figuresList) {
            if (parameters.getFilled()) {
                g2d.fill(s);
            }
            g2d.draw(s);
        }
        repaint();
    }

    private Shape getSelectedShape(Point startinPoint) {
        for (Shape s : figuresList) {
            if (s.contains(startingPoint)) {
                return s;
            }
        }
        return null;
    }

    private void setLocation(Shape s, Point newPosition) {
        if (s instanceof Rectangle) {
            ((Rectangle) s).setLocation(newPosition);
        }
        if (s instanceof Ellipse2D) {
            Shape sAux;
            sAux = s.getBounds();
            ((Rectangle) sAux).setLocation(newPosition);
            ((Ellipse2D) s).setFrame((Rectangle2D) sAux);
        }
        if (s instanceof MyLine2D) {
            ((MyLine2D) s).setLocation(newPosition);
        }
    }

    private void createShape(Point startingPoint) {
        Shape s = null;
        switch (parameters.getFigureType()) {
            case DOT:
                s = new Line2D.Float(startingPoint.x - 5, startingPoint.y - 5, startingPoint.x - 5, startingPoint.y - 5);
                break;
            case RECTANGLE:
                s = new Rectangle(startingPoint);
                break;
            case LINE:
                s = new MyLine2D(startingPoint, startingPoint);
                break;
            case ELLIPSE:
                s = new Ellipse2D.Float(startingPoint.x, startingPoint.y, 0, 0);
                break;
        }
        figuresList.add(s);
    }

    private void updateShape(Point startingPoint, Point finishPoint) {
        Shape s = figuresList.get(figuresList.size() - 1);
        if (s instanceof RectangularShape) {
            ((RectangularShape) s).setFrameFromDiagonal(startingPoint, finishPoint);
        }
        if (s instanceof MyLine2D) {
            ((MyLine2D) s).setLine(startingPoint, finishPoint);
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
        finishPoint = null;
        startingPoint = e.getPoint();
        if (parameters.getEdit()) {
            grabbed_s = getSelectedShape(startingPoint);
        } else {
            createShape(startingPoint);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.mouseDragged(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        finishPoint = e.getPoint();
        if (parameters.getEdit()) {
            setLocation(grabbed_s, finishPoint);
        } else {
            updateShape(startingPoint, finishPoint);
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
