package com.codecool.antsLife;


import com.codecool.antsLife.ants.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        loadColony();
    }

    public static void loadColony() {
        Colony colony = new Colony(150, 150);
        Queen queen = new Queen(colony.getCell(0,0));
        Worker worker = new Worker(colony.getCell(4, 4));
        Soldier soldier = new Soldier(colony.getCell(2, 2));
        Drone drone = new Drone(colony.getCell(5, 4));
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                worker.move();
                soldier.move();
                drone.move();
                printMap(colony);
            }
        }, 0, 5000);
    }

    public static void printMap(Colony colony) {
        List<Cell> map = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                map.add(colony.getCell(x, y));
            }
        }
        for (Cell cell: map) {
            Ant currentAnt = cell.getAnt();
            if (currentAnt == null) System.out.print(" | x |" );
            if (cell.getY() == 9) System.out.println("");
            if (currentAnt != null) System.out.print(" | " + currentAnt.getClass().getSimpleName() + " x:" + cell.getX() + " y:" + cell.getY() + " steps:" + currentAnt.stepsToOrigo + " |");
        }
        System.out.println("\n");
    }
}
