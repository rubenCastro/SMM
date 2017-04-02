/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jaci.graphics;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author jacortes
 */
public class MyLine2D extends Line2D.Float {

    public MyLine2D(Point2D p1, Point2D p2) {
        super(p1, p2);
    }

    public boolean isNear(Point2D p) {
        return this.ptLineDist(p) <= 2.0;
    }

    @Override
    public boolean contains(Point2D p) {
        return isNear(p);
    }

    public void setLocation(Point2D pos) {
        double dx = pos.getX() - this.getX1();
        double dy = pos.getY() - this.getY1();
        Point2D newp2 = new Point2D.Double(this.getX2() + dx, this.getY2() + dy);
        this.setLine(pos, newp2);

    }

    public void setLine(Point2D p1, Point2D p2) {
        super.setLine(p1, p2);
    }
}
