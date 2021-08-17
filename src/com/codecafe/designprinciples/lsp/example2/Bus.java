package com.codecafe.designprinciples.lsp.example2;

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