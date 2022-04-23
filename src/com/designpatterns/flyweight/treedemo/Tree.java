package com.designpatterns.flyweight.treedemo;

import java.awt.*;

// Extrinsic properties
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics graphics) {
        type.draw(graphics, x, y);
    }
}
