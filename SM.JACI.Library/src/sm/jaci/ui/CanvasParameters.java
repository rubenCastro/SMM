/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jaci.ui;

import java.awt.Color;

/**
 *
 * @author jacortes
 */
public class CanvasParameters {

    Color active_color;
    FigureTypes figureType;
    Integer thickness;
    Boolean alpha;
    Boolean filled;
    Boolean aliasing;
    Boolean edit;

    public CanvasParameters() {
        active_color = Color.BLACK;
        figureType = FigureTypes.DOT;
        thickness = 1;
        alpha = false;
        filled = false;
        aliasing = false;
        edit = false;
    }

    public Color getActive_color() {
        return active_color;
    }

    public void setActive_color(Color active_color) {
        this.active_color = active_color;
    }

    public FigureTypes getFigureType() {
        return figureType;
    }

    public void setFigureType(FigureTypes figureType) {
        this.figureType = figureType;
    }

    public Integer getThickness() {
        return thickness;
    }

    public void setThickness(Integer thickness) {
        this.thickness = thickness;
    }

    public Boolean getAlpha() {
        return alpha;
    }

    public void setAlpha(Boolean alpha) {
        this.alpha = alpha;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
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
