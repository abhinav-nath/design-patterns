package com.designpatterns.structural.decorator.example2;

public class Stars extends ChristmasTreeDecorator {

    public Stars(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.print(" Adding Stars.");
    }

}