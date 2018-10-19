package com.frank.snowing;

import java.util.Random;

public class Snow extends Thread {

    private final SnowFrame.SnowCanvas snowCanvas;
    int x;
    int y;
    Random random = new Random();


    public Snow(SnowFrame.SnowCanvas snowCanvas) {
        this.snowCanvas = snowCanvas;
        x = random.nextInt(800);
        y = random.nextInt(600);
    }

    @Override
    public void run() {
        while (true) {
//        for (int i = y; i < 600; i++) {
            y++;
            x = x + random.nextInt(3) - 1;
            snowCanvas.repaint();

            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (y == 600) {
                y = 0;
            }
        }
    }

}
