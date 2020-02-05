package com.codecool.antsLife;

import com.codecool.antsLife.ants.*;

public class Cell {
    private Ant ant;
    private Colony colony;
    private int x, y;

    public Cell(Colony colony, int x, int y) {
        this.colony = colony;
        this.x = x;
        this.y = y;
    }

    public void setAnt(Ant ant) {
        this.ant = ant;
    }

    public Ant getAnt() {
        return ant;
    }

    public Cell getNeighbor(int dx, int dy) {
        return colony.getCell(x + dx, y + dy);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

}
