package com.designprinciples.lsp.example1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int computeArea() {
        return width * height;
    }

}