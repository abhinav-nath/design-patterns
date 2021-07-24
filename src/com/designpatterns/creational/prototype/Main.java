package com.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally Hashcode : " + System.identityHashCode(sally));
        System.out.println("Clone Hashcode : " + System.identityHashCode(clonedSheep));

        System.out.println();

        Tiger simba = new Tiger();
        Tiger clonedTiger = (Tiger) animalMaker.getClone(simba);

        System.out.println(simba);
        System.out.println(clonedTiger);

        System.out.println("Simba Hashcode : " + System.identityHashCode(simba));
        System.out.println("Clone Hashcode : " + System.identityHashCode(clonedTiger));
    }

}