package com.codecool.antsLife;


public class Colony {
    private int width;
    private int height;
    private Cell[][] cells;

    public Colony(int width, int height) {
        this.width = width;
        this.height = height;
        cells = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y] = new Cell(this, x, y);
            }
        }

    }



    public Cell getCell(int x, int y) {
        return cells[x][y];
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
