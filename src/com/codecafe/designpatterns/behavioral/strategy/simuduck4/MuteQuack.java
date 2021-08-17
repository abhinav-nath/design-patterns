package com.codecafe.designpatterns.behavioral.strategy.simuduck4;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }

}