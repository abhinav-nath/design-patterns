package com.designprinciples.isp;

public class Document {

	private int numberOfPages;
	private String text;
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public String getText() {
		return text;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Document [numberOfPages=" + numberOfPages + ", text=" + text + "]";
	}
	
}
