package com.codecafe.designprinciples.ocp.example1;

public interface Specification<T> {

  public boolean isSatisfied(T item);

}