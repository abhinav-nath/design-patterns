package com.designprinciples.ocp.example1;

public interface Specification<T> {

	boolean isSatisfied(T item);
}
