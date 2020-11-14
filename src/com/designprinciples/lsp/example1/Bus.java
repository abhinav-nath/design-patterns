package com.designprinciples.lsp.example1;

import lombok.Getter;
import lombok.Setter;

enum BusType {
    SLEEPER, SEMISLEEPER, SEATER
}

@Getter
@Setter
public class Bus extends Vehicle {

    private int maxNumberOfPassengers;
    private BusType busType;

}