package com.designprinciples.lsp.example2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {

    private int speed;
    private int cubicCapacity;

    @Override
    public String toString() {
        return "Vehicle [speed=" + speed + ", cubicCapacity=" + cubicCapacity + "]";
    }

}