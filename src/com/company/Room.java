package com.company;

/**
 * Created by MattBrown on 12/1/15.
 */
public class Room {
    int row;
    int col;
    boolean wasVisisted = false;
    boolean hasBottom  = true;
    boolean hasRight = true;

    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
