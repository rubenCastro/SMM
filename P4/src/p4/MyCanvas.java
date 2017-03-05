/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author jacortes
 */
public class MyCanvas extends JPanel implements MouseListener {

    private Color activeColor;
    private MyFigure activeFigure;
    private String activeType;
    private Boolean isFilled;

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

    }

    public MyCanvas(LayoutManager layout) {
        super(layout);
    }

    public MyCanvas(Color activeColor, MyFigure activeFigure, String activeType, Boolean isFilled, LayoutManager layout) {
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

    public String getActiveType() {
        return activeType;
    }

    public void setActiveType(String activeType) {
        this.activeType = activeType;
    }

    public Boolean getIsFilled() {
        return isFilled;
    }

    public void setIsFilled(Boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
