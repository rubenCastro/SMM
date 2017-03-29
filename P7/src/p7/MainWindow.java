/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import sm.jaci.ui.CanvasParameters;
import sm.jaci.ui.FigureTypes;
import sm.jaci.ui.MyInternalFrame;

/**
 *
 * @author jacortes
 */
public class MainWindow extends javax.swing.JFrame {

    CanvasParameters currentParameters = new CanvasParameters();

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        ((SpinnerNumberModel) thicknessSpinner.getModel()).setMinimum(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        figuresButtonGroup = new javax.swing.ButtonGroup();
        colorsButtonGroup = new javax.swing.ButtonGroup();
        figuresToolBar = new javax.swing.JToolBar();
        dotToggleButton = new javax.swing.JToggleButton();
        lineToggleButton = new javax.swing.JToggleButton();
        rectanbleToggleButton = new javax.swing.JToggleButton();
        ellipseToggleButton = new javax.swing.JToggleButton();
        canvasDesktopPanel = new javax.swing.JDesktopPane();
        bottomPanel = new javax.swing.JPanel();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        bottomToolBar = new javax.swing.JToolBar();
        colorsPanel = new javax.swing.JPanel();
        blackToggleButton = new javax.swing.JToggleButton();
        redToggleButton = new javax.swing.JToggleButton();
        blueToggleButton = new javax.swing.JToggleButton();
        whiteToggleButton = new javax.swing.JToggleButton();
        yellowToggleButton = new javax.swing.JToggleButton();
        greenToggleButton = new javax.swing.JToggleButton();
        thicknessPanel = new javax.swing.JPanel();
        thicknessSpinner = new javax.swing.JSpinner();
        optionsPanel = new javax.swing.JPanel();
        filledCheckBox = new javax.swing.JCheckBox();
        smoothCheckBox = new javax.swing.JCheckBox();
        alphaCheckBox = new javax.swing.JCheckBox();
        editCheckBox = new javax.swing.JCheckBox();
        topMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        statusMenuItem = new javax.swing.JMenuItem();
        figuresMenuItem = new javax.swing.JMenuItem();
        attributesMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basic 2D Paint");
        setPreferredSize(new java.awt.Dimension(1024, 768));

        figuresToolBar.setRollover(true);

        figuresButtonGroup.add(dotToggleButton);
        dotToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/punto.png"))); // NOI18N
        dotToggleButton.setFocusable(false);
        dotToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dotToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dotToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotToggleButtonActionPerformed(evt);
            }
        });
        figuresToolBar.add(dotToggleButton);

        figuresButtonGroup.add(lineToggleButton);
        lineToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/linea.png"))); // NOI18N
        lineToggleButton.setFocusable(false);
        lineToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lineToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lineToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineToggleButtonActionPerformed(evt);
            }
        });
        figuresToolBar.add(lineToggleButton);

        figuresButtonGroup.add(rectanbleToggleButton);
        rectanbleToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rectangulo.png"))); // NOI18N
        rectanbleToggleButton.setFocusable(false);
        rectanbleToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rectanbleToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rectanbleToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanbleToggleButtonActionPerformed(evt);
            }
        });
        figuresToolBar.add(rectanbleToggleButton);

        figuresButtonGroup.add(ellipseToggleButton);
        ellipseToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/elipse.png"))); // NOI18N
        ellipseToggleButton.setFocusable(false);
        ellipseToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ellipseToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ellipseToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ellipseToggleButtonActionPerformed(evt);
            }
        });
        figuresToolBar.add(ellipseToggleButton);

        getContentPane().add(figuresToolBar, java.awt.BorderLayout.NORTH);
        getContentPane().add(canvasDesktopPanel, java.awt.BorderLayout.CENTER);

        bottomPanel.setLayout(new java.awt.BorderLayout());

        statusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        statusPanel.setLayout(new java.awt.BorderLayout());

        statusLabel.setText("Waiting...");
        statusPanel.add(statusLabel, java.awt.BorderLayout.CENTER);

        bottomPanel.add(statusPanel, java.awt.BorderLayout.SOUTH);

        bottomToolBar.setRollover(true);

        colorsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Colors"));
        colorsPanel.setPreferredSize(new java.awt.Dimension(120, 100));
        colorsPanel.setLayout(new java.awt.GridLayout(2, 3, 1, 1));

        blackToggleButton.setBackground(java.awt.Color.black);
        colorsButtonGroup.add(blackToggleButton);
        blackToggleButton.setMaximumSize(new java.awt.Dimension(34, 34));
        blackToggleButton.setPreferredSize(new java.awt.Dimension(34, 34));
        blackToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackToggleButtonActionPerformed(evt);
            }
        });
        colorsPanel.add(blackToggleButton);

        redToggleButton.setBackground(java.awt.Color.red);
        colorsButtonGroup.add(redToggleButton);
        redToggleButton.setPreferredSize(new java.awt.Dimension(34, 34));
        redToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redToggleButtonActionPerformed(evt);
            }
        });
        colorsPanel.add(redToggleButton);

        blueToggleButton.setBackground(java.awt.Color.blue);
        colorsButtonGroup.add(blueToggleButton);
        blueToggleButton.setPreferredSize(new java.awt.Dimension(34, 34));
        blueToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueToggleButtonActionPerformed(evt);
            }
        });
        colorsPanel.add(blueToggleButton);

        whiteToggleButton.setBackground(java.awt.Color.white);
        colorsButtonGroup.add(whiteToggleButton);
        whiteToggleButton.setPreferredSize(new java.awt.Dimension(34, 34));
        whiteToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteToggleButtonActionPerformed(evt);
            }
        });
        colorsPanel.add(whiteToggleButton);

        yellowToggleButton.setBackground(java.awt.Color.yellow);
        colorsButtonGroup.add(yellowToggleButton);
        yellowToggleButton.setPreferredSize(new java.awt.Dimension(34, 34));
        yellowToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowToggleButtonActionPerformed(evt);
            }
        });
        colorsPanel.add(yellowToggleButton);

        greenToggleButton.setBackground(java.awt.Color.green);
        colorsButtonGroup.add(greenToggleButton);
        greenToggleButton.setPreferredSize(new java.awt.Dimension(34, 34));
        greenToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenToggleButtonActionPerformed(evt);
            }
        });
        colorsPanel.add(greenToggleButton);

        bottomToolBar.add(colorsPanel);

        thicknessPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Thickness"));
        thicknessPanel.setPreferredSize(new java.awt.Dimension(120, 100));

        thicknessSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                thicknessSpinnerStateChanged(evt);
            }
        });
        thicknessPanel.add(thicknessSpinner);

        bottomToolBar.add(thicknessPanel);

        optionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));
        optionsPanel.setPreferredSize(new java.awt.Dimension(200, 100));
        optionsPanel.setLayout(new java.awt.GridLayout(2, 2));

        filledCheckBox.setText("Filled");
        filledCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filledCheckBoxActionPerformed(evt);
            }
        });
        optionsPanel.add(filledCheckBox);

        smoothCheckBox.setText("Smooth");
        smoothCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smoothCheckBoxActionPerformed(evt);
            }
        });
        optionsPanel.add(smoothCheckBox);

        alphaCheckBox.setText("Alpha");
        alphaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphaCheckBoxActionPerformed(evt);
            }
        });
        optionsPanel.add(alphaCheckBox);

        editCheckBox.setText("Edit");
        editCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCheckBoxActionPerformed(evt);
            }
        });
        optionsPanel.add(editCheckBox);

        bottomToolBar.add(optionsPanel);

        bottomPanel.add(bottomToolBar, java.awt.BorderLayout.CENTER);

        getContentPane().add(bottomPanel, java.awt.BorderLayout.SOUTH);

        fileMenu.setText("File");

        newMenuItem.setText("New");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newMenuItem);

        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        topMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        statusMenuItem.setText("Show status bar");
        statusMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(statusMenuItem);

        figuresMenuItem.setText("Show figures bar");
        figuresMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                figuresMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(figuresMenuItem);

        attributesMenuItem.setText("Show attributes bar");
        attributesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attributesMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(attributesMenuItem);

        topMenuBar.add(editMenu);

        setJMenuBar(topMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed
        MyInternalFrame mif = new MyInternalFrame();
        if (canvasDesktopPanel.getAllFrames().length != 0) {
            CanvasParameters currentParametersAux = new CanvasParameters();
            currentParametersAux.setActive_color(currentParameters.getActive_color());
            currentParametersAux.setFigureType(currentParameters.getFigureType());
            currentParametersAux.setThickness(currentParameters.getThickness());
            currentParametersAux.setAlpha(currentParameters.getAlpha());
            currentParametersAux.setFilled(currentParameters.getFilled());
            currentParametersAux.setAliasing(currentParameters.getAliasing());
            currentParametersAux.setEdit(currentParameters.getEdit());
            mif.getCanvas2d().setParameters(currentParametersAux);
        }

        canvasDesktopPanel.add(mif);
        mif.setVisible(true);
    }//GEN-LAST:event_newMenuItemActionPerformed

    private void statusMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusMenuItemActionPerformed
        if (statusPanel.isVisible()) {
            statusPanel.setVisible(false);
        } else {
            statusPanel.setVisible(true);
        }
    }//GEN-LAST:event_statusMenuItemActionPerformed

    private void figuresMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figuresMenuItemActionPerformed
        if (figuresToolBar.isVisible()) {
            figuresToolBar.setVisible(false);
        } else {
            figuresToolBar.setVisible(true);
        }
    }//GEN-LAST:event_figuresMenuItemActionPerformed

    private void attributesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attributesMenuItemActionPerformed
        if (bottomToolBar.isVisible()) {
            bottomToolBar.setVisible(false);
        } else {
            bottomToolBar.setVisible(true);
        }
    }//GEN-LAST:event_attributesMenuItemActionPerformed

    private void dotToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setFigureType(FigureTypes.DOT);
            mif.getCanvas2d().getParameters().setFigureType(FigureTypes.DOT);
        }
    }//GEN-LAST:event_dotToggleButtonActionPerformed

    private void lineToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setFigureType(FigureTypes.LINE);
            mif.getCanvas2d().getParameters().setFigureType(FigureTypes.LINE);
        }
    }//GEN-LAST:event_lineToggleButtonActionPerformed

    private void rectanbleToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanbleToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setFigureType(FigureTypes.RECTANGLE);
            mif.getCanvas2d().getParameters().setFigureType(FigureTypes.RECTANGLE);
        }
    }//GEN-LAST:event_rectanbleToggleButtonActionPerformed

    private void ellipseToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ellipseToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setFigureType(FigureTypes.ELLIPSE);
            mif.getCanvas2d().getParameters().setFigureType(FigureTypes.ELLIPSE);
        }
    }//GEN-LAST:event_ellipseToggleButtonActionPerformed

    private void filledCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filledCheckBoxActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            if (filledCheckBox.isSelected()) {
                currentParameters.setFilled(true);
                mif.getCanvas2d().getParameters().setFilled(true);
            } else {
                currentParameters.setFilled(false);
                mif.getCanvas2d().getParameters().setFilled(false);
            }
        }
    }//GEN-LAST:event_filledCheckBoxActionPerformed

    private void redToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setActive_color(Color.RED);
            mif.getCanvas2d().getParameters().setActive_color(Color.RED);
        }
    }//GEN-LAST:event_redToggleButtonActionPerformed

    private void blueToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setActive_color(Color.BLUE);
            mif.getCanvas2d().getParameters().setActive_color(Color.BLUE);
        }
    }//GEN-LAST:event_blueToggleButtonActionPerformed

    private void whiteToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setActive_color(Color.WHITE);
            mif.getCanvas2d().getParameters().setActive_color(Color.WHITE);
        }
    }//GEN-LAST:event_whiteToggleButtonActionPerformed

    private void yellowToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setActive_color(Color.YELLOW);
            mif.getCanvas2d().getParameters().setActive_color(Color.YELLOW);
        }
    }//GEN-LAST:event_yellowToggleButtonActionPerformed

    private void greenToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setActive_color(Color.GREEN);
            mif.getCanvas2d().getParameters().setActive_color(Color.GREEN);
        }
    }//GEN-LAST:event_greenToggleButtonActionPerformed

    private void blackToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackToggleButtonActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            currentParameters.setActive_color(Color.BLACK);
            mif.getCanvas2d().getParameters().setActive_color(Color.BLACK);
        }
    }//GEN-LAST:event_blackToggleButtonActionPerformed

    private void smoothCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smoothCheckBoxActionPerformed
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            if (smoothCheckBox.isSelected()) {
                currentParameters.setAliasing(true);
                mif.getCanvas2d().getParameters().setAliasing(true);
            }

        }
    }//GEN-LAST:event_smoothCheckBoxActionPerformed

    private void alphaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphaCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alphaCheckBoxActionPerformed

    private void editCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCheckBoxActionPerformed

    private void thicknessSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_thicknessSpinnerStateChanged
        MyInternalFrame mif;
        mif = (MyInternalFrame) canvasDesktopPanel.getSelectedFrame();
        if (mif != null) {
            Integer thickness = Integer.parseInt(thicknessSpinner.getModel().getValue().toString());
            currentParameters.setThickness(thickness);
            mif.getCanvas2d().getParameters().setThickness(thickness);
        }
    }//GEN-LAST:event_thicknessSpinnerStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alphaCheckBox;
    private javax.swing.JMenuItem attributesMenuItem;
    private javax.swing.JToggleButton blackToggleButton;
    private javax.swing.JToggleButton blueToggleButton;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JToolBar bottomToolBar;
    private javax.swing.JDesktopPane canvasDesktopPanel;
    private javax.swing.ButtonGroup colorsButtonGroup;
    private javax.swing.JPanel colorsPanel;
    private javax.swing.JToggleButton dotToggleButton;
    private javax.swing.JCheckBox editCheckBox;
    private javax.swing.JMenu editMenu;
    private javax.swing.JToggleButton ellipseToggleButton;
    private javax.swing.ButtonGroup figuresButtonGroup;
    private javax.swing.JMenuItem figuresMenuItem;
    private javax.swing.JToolBar figuresToolBar;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JCheckBox filledCheckBox;
    private javax.swing.JToggleButton greenToggleButton;
    private javax.swing.JToggleButton lineToggleButton;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JToggleButton rectanbleToggleButton;
    private javax.swing.JToggleButton redToggleButton;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JCheckBox smoothCheckBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JMenuItem statusMenuItem;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JPanel thicknessPanel;
    private javax.swing.JSpinner thicknessSpinner;
    private javax.swing.JMenuBar topMenuBar;
    private javax.swing.JToggleButton whiteToggleButton;
    private javax.swing.JToggleButton yellowToggleButton;
    // End of variables declaration//GEN-END:variables
}
