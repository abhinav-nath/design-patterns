package com.codecafe.designpatterns.structural.decorator.example2;

public class GiftBoxes extends ChristmasTreeDecorator {

    public GiftBoxes(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.print(" Adding Gift Boxes.");
    }

}