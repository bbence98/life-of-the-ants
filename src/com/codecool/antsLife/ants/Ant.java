package com.codecool.antsLife.ants;

import com.codecool.antsLife.*;


public abstract class Ant {
    protected Cell cell;
    public int stepsToOrigo = 0;


    public Ant(Cell cell) {
        this.cell = cell;
        this.cell.setAnt(this);
        this.stepsToOrigo = calculateStepsToOrigo(cell.getX(), cell.getY());

    }

    protected int calculateStepsToOrigo(int x, int y) {
        return x + y;
    }

    protected int calculateStepsToOrigo(Cell cell) {
        return cell.getX() + cell.getY();
    }

    public abstract void move();

}
