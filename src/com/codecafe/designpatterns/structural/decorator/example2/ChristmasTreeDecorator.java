package com.codecafe.designpatterns.structural.decorator.example2;

public class ChristmasTreeDecorator implements ChristmasTree {

    private ChristmasTree tree;

    public ChristmasTreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public void decorate() {
        this.tree.decorate();
    }

}