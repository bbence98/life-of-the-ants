package com.codecool.antsLife.ants;

import com.codecool.antsLife.Cell;

import java.util.concurrent.ThreadLocalRandom;

public class Worker extends Ant {

    public Worker(Cell cell) {
        super(cell);
    }

    @Override
    public void move() {
        int randomDirection = ThreadLocalRandom.current().nextInt(0, 4);
        switch (randomDirection) {
            case 0:
                Cell nextCellN = cell.getNeighbor(0, 1);
                this.cell.setAnt(null);
                nextCellN.setAnt(this);
                this.cell = nextCellN;
                this.stepsToOrigo = calculateStepsToOrigo(this.cell);
                break;
            case 1:
                Cell nextCellE = cell.getNeighbor(1, 0);
                this.cell.setAnt(null);
                nextCellE.setAnt(this);
                this.cell = nextCellE;
                this.stepsToOrigo = calculateStepsToOrigo(this.cell);
                break;
            case 2:
                Cell nextCellS = cell.getNeighbor(0, -1);
                this.cell.setAnt(null);
                nextCellS.setAnt(this);
                this.cell = nextCellS;
                this.stepsToOrigo = calculateStepsToOrigo(this.cell);
                break;
            case 3:
                Cell nextCellW = cell.getNeighbor(-1, 0);
                this.cell.setAnt(null);
                nextCellW.setAnt(this);
                this.cell = nextCellW;
                this.stepsToOrigo = calculateStepsToOrigo(this.cell);
                break;
        }
    }


}
