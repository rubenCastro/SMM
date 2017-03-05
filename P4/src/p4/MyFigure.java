/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author jacortes
 */
public class MyFigure {

    private Point start;
    private Point finish;
    private Color color;
    private Boolean filled;

    public MyFigure(Point start, Point finish, Color color, Boolean filled) {
        this.start = start;
        this.finish = finish;
        this.color = color;
        this.filled = filled;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public MyFigure(Point start, Point finish, Color color) {
        this.start = start;
        this.finish = finish;
        this.color = color;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
