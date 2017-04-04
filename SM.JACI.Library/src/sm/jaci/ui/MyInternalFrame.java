/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jaci.ui;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author jacortes
 */
public class MyInternalFrame extends JInternalFrame {

    MyCanvas2DImage canvas2d;
    JScrollPane scroll;

    public MyInternalFrame() {
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setSize(400, 300);
        this.canvas2d = new MyCanvas2DImage();
        this.scroll = new JScrollPane();
        scroll.setViewportView(canvas2d);
        this.add(scroll);
    }

    public MyCanvas2DImage getCanvas2d() {
        return canvas2d;
    }

    public void setCanvas2dImage(MyCanvas2DImage canvas2d) {
        this.canvas2d = canvas2d;
    }

}
