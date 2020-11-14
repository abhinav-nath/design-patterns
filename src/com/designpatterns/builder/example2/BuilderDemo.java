package com.designpatterns.builder.example2;

/*
 * Builder Pattern
 * ===============
 * Build your object piece-by-piece.
 * 
 * The Builder Pattern separates the construction of a complex object
 * from its representation so that the same construction process can create 
 * different representations. - Gof
 * 
 * --------------------------------------------------------------------------------------------------------------------------------
 * The Builder Pattern consists of :
 * 
 * 1. Builder - The Builder object specifies the interface for creating parts of the complex object.
 * 
 * 2. ConcreteBuilder - The ConcreteBuilder objects create and assemble the parts that make up the Product through the Builder interface.
 * 
 * 3. Director - The Director object is responsible for the construction process of the complex object but
 *               delegates the actual creation and assembly to the Builder interface.
 *               
 * 4. Product - The Product represents the complex object that is created by the ConcreteBuilder objects.
 *              The Product consists of multiple parts that are created separately by the ConcreteBuilder objects.
 * --------------------------------------------------------------------------------------------------------------------------------
 * The construction of the Complex object (Product) is hidden by the Builder objects from the Client and Director objects.
 * 
 */

public class BuilderDemo {

    public static void main(String[] args) {

        MealBuilder mb = new ItalianMealBuilder();
        MealDirector md = new MealDirector(mb);
        md.constructMeal();
        Meal meal = md.getMeal();
        System.out.println("Meal is : " + meal);

        mb = new JapaneseMealBuilder();
        md = new MealDirector(mb);
        md.constructMeal();
        meal = md.getMeal();
        System.out.println("Meal is : " + meal);

        mb = new IndianMealBuilder();
        md = new MealDirector(mb);
        md.constructMeal();
        meal = md.getMeal();
        System.out.println("Meal is : " + meal);

    }

}