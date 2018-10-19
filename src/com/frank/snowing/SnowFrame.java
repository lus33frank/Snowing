package com.frank.snowing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SnowFrame extends JFrame {

    SnowCanvas canvas = new SnowCanvas();


    public SnowFrame() {
        setSize(850, 650);
        setLocation(100, 100);
        add(canvas);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SnowFrame();
    }


    public class SnowCanvas extends JPanel {

        List<Snow> snows = new ArrayList<>();


        public SnowCanvas() {
            setBackground(Color.BLACK);

            for (int i = 0; i < 100; i++) {
                Snow snow = new Snow(this);
                snows.add(snow);
                snow.start();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (int i = 0; i < 100; i++) {
                Snow snow = snows.get(i);
                g.setColor(Color.WHITE);
                g.fillOval(snow.x, snow.y, 10, 10);
//                g.drawString("雪", snow.x, snow.y);
            }
        }

    }

}
