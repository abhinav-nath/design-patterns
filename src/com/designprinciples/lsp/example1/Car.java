package com.designprinciples.lsp.example1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends Vehicle {

    private String color;
    private boolean isHatchBack;

    @Override
    public String toString() {
        return "Car [color=" + color + ", isHatchBack=" + isHatchBack + "]";
    }

}