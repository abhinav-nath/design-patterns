package com.codecafe.designpatterns.structural.decorator.example2;

public class Main {

  public static void main(String[] args) {

    ChristmasTree basicTree = new BasicChristmasTree();
    basicTree.decorate();

    System.out.println();

    ChristmasTree treeWithStars = new Stars(new BasicChristmasTree());
    treeWithStars.decorate();

    System.out.println();

    ChristmasTree treeWithStarsAndCandies = new Candies(new Stars(new BasicChristmasTree()));
    treeWithStarsAndCandies.decorate();

    System.out.println();

    ChristmasTree treeWithStarsCandiesAndGiftBoxes = new GiftBoxes(new Candies(new Stars(new BasicChristmasTree())));
    treeWithStarsCandiesAndGiftBoxes.decorate();

  }

}