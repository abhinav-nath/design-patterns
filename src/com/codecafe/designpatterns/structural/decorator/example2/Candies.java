package com.codecafe.designpatterns.structural.decorator.example2;

public class Candies extends ChristmasTreeDecorator {

    public Candies(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.print(" Adding Candies.");
    }

}