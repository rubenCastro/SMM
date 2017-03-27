/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jaci.ui;

import javax.swing.JInternalFrame;

/**
 *
 * @author jacortes
 */
public class MyInternalFrame extends JInternalFrame {

    MyCanvas2D canvas2d;

    public MyInternalFrame() {
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setSize(400, 300);
        this.canvas2d = new MyCanvas2D();
        this.add(canvas2d);
    }

    public MyCanvas2D getCanvas2d() {
        return canvas2d;
    }

    public void setCanvas2d(MyCanvas2D canvas2d) {
        this.canvas2d = canvas2d;
    }

}
