package com.codecool.antsLife.ants;

import com.codecool.antsLife.Cell;

import java.util.ArrayList;
import java.util.List;


public class Soldier extends Ant {
    List<Cell> neighborCells = prepareForMove();
    private static int counter = 0;

    public Soldier(Cell cell) {
        super(cell);
        prepareForMove();
    }

    private List<Cell> prepareForMove() {
    List<Cell> neighborCells = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            neighborCells.add(cell.getNeighbor(0, 1)); // 2 3
            cell = cell.getNeighbor(0, 1);
            neighborCells.add(cell.getNeighbor(1, 0)); // 3 3
            cell = cell.getNeighbor(1, 0);
            neighborCells.add(cell.getNeighbor(0, -1)); // 3 2
            cell = cell.getNeighbor(0, -1);
            neighborCells.add(cell.getNeighbor(-1, 0)); // 2 2
            cell = cell.getNeighbor(-1, 0);
        }
        return neighborCells;
    }

    private Cell getNextCell() {
        Cell result = neighborCells.get(counter);
        counter++;
        if (counter == 4) counter = 0;
        return result;
    }


    @Override
    public void move() {
        Cell nextCell = getNextCell();
        this.cell.setAnt(null);
        this.cell = nextCell;
        nextCell.setAnt(this);
        this.stepsToOrigo = calculateStepsToOrigo(nextCell);
    }
}
