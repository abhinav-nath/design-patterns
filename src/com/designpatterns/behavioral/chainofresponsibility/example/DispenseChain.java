package com.designpatterns.behavioral.chainofresponsibility.example;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);

}