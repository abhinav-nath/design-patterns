package com.codecafe.designprinciples.isp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Document {

    private int numberOfPages;
    private String text;

    @Override
    public String toString() {
        return "Document [numberOfPages=" + numberOfPages + ", text=" + text + "]";
    }

}