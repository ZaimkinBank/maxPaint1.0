package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class Main extends JPanel {
    ArrayList<cell> mass = new ArrayList<>();
    Main () {
        JFrame fr = new JFrame("paint");
        fr.add(this);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setSize(1000,1000);
        fr.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mass.add(new cell(e.getX() - 5,e.getY()- 30));
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mass.add(new cell(e.getX() - 5,e.getY()- 30));
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mass.add(new cell(e.getX() - 5,e.getY()- 30));
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                mass.add(new cell(e.getX() - 5,e.getY() - 30));
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mass.add(new cell(e.getX() - 5,e.getY() - 30));
                repaint();
            }
        });

        fr.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                mass.add(new cell(e.getX() - 5,e.getY() - 30));
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                //     mass.add(new cell(e.getX(),e.getY()));
                //    repaint();
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        for (int i = 0; i < mass.size(); i++)
            g.fillRect(mass.get(i).x, mass.get(i).y, 5, 5);
    }
}