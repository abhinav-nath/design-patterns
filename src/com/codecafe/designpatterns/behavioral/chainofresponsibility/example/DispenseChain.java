package com.codecafe.designpatterns.behavioral.chainofresponsibility.example;

public interface DispenseChain {

    public void setNextChain(DispenseChain nextChain);

    public void dispense(Currency cur);

}