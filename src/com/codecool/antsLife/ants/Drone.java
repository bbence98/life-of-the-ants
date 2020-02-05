package com.codecool.antsLife.ants;

import com.codecool.antsLife.Cell;

public class Drone extends Ant {
    public Drone(Cell cell) {
        super(cell);
    }

    @Override
    public void move() {

        System.out.println(stepsToOrigo);
    }
}
