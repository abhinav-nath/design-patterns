## Open-Closed Principle

Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

It means the entity that we create should be extensible.

By implementing this principle we are able to create a new feature/behavior without breaking the existing code.


Lets say we need to calculate areas of various shapes.

We start with creating a class for our first shape `Rectangle` which has 2 attributes length & width:

```
public class Rectangle {
	public double length;
	public double width;
}
```

Next we create a class to calculate area of this `Rectangle` which has a method `calculateRectangleArea()` which takes the `Rectangle` as an input parameter and calculates its area:

```
public class AreaCalculator {
	public double calculateRectangleArea(Rectangle rectangle) {
		return rectangle.length * rectangle.width;
	}
}
```

So far so good.
Now lets say we get our second shape circle. So we promptly create a new class `Circle` with a single attribute radius:

```
public class Circle {
	public double radius;
}
```

Then we modify `AreaCalculator` class to add circle calculations through a new method `calculateCircleArea()`:

```
public class AreaCalculator {

	public double calculateRectangleArea(Rectangle rectangle) {
		return rectangle.length * rectangle.width;
	}

	public double calculateCircleArea(Circle circle) {
		return (22/7) * circle.radius * circle.radius;
	}
}
```

However, note that there were flaws in the way we designed our solution above.

Lets say we have a new shape pentagon next.

In that case we will again end up modifying `AreaCalculator` class.

As the types of shapes grows this becomes messier as `AreaCalculator` keeps on changing and any consumers of this class will have to keep on updating their libraries which contain `AreaCalculator`.
As a result, `AreaCalculator` class will not be baselined(finalized) with surety as every time a new shape comes it will be modified.

So, this design is not closed for modification.

Also, note that this design is not extensible, i.e what if complicated shapes keep coming, AreaCalculator will need to keep on adding their computation logic in newer methods. We are not really expanding the scope of shapes; rather we are simply doing piece-meal(bit-by-bit) solution for every shape that is added.


### Modification of above design to comply with Open/Closed Principle:

Let us now see a more elegant design which solves the flaws in the above design by adhering to the Open/Closed Principle.
We will first of all make the design extensible.

For this we need to first define a base type `Shape` and have `Circle` & `Rectangle` implement `Shape` interface:


```
public interface Shape {
	public double calculateArea();
}
```

```
public class Rectangle implements Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

}
```

```
public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (22 / 7) * radius * radius;
    }

}
```

The design has now undergone the following important changes to become extensible in nature:

- There is a base interface Shape. All shapes now implement the base interface `Shape`


- `Shape` interface has an abstract method calculateArea(). Both circle & rectangle provide their own overridden implementation of `calculateArea()` method using their own attributes.


- We have brought-in a degree of extensibility as shapes are now an instance of `Shape` interfaces. This allows us to use `Shape` instead of individual classes wherever these classes are used by any consumer.

The last point above mentioned consumer of these shapes. In our case consumer will be the `AreaCalculator` class which would now look like this:

```
public class AreaCalculator {

	public double calculateShapeArea(Shape shape) {
		return shape.calculateArea();
	}
}
```

This `AreaCalculator` class now fully removes our design flaws noted above and gives a clean solution which adheres to the Open-Closed Principle.

The design is now correct as per Open-Closed Principle due to the following reasons:

- The design is open for extension as more shapes can be added without modifying the existing code. We just need to create a new class for the new shape and implement the calculateArea() method with a formula specific to that new shape.


- This design is also closed for modification. AreaCalculator class is complete w.r.t area calculations. It now caters to all the shapes which exists now, as well as to those that may be created later.
