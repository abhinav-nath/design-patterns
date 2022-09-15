# Liskov Substitution Principle

> Objects should be replaceable with their subtypes without affecting the correctness of the program"

Sub-types must be behaviorally substitutable for their base types.

"Derived class objects must be substitutable for the base class objects. That means objects of the derived class must
behave in a manner consistent with the promises made in the base class' contract."

![Liskov Substitution Principle](https://github.com/abhinav-nath/design-patterns/blob/master/images/lsp.png "Liskov Substitution Principle")

### Why is the Liskov Substitution Principle important?

1. Because if not, then class hierarchies would be a mess. Mess being that whenever a subclass instance was passed as
   parameter to any method, strange behavior would occur.
2. Because if not, unit tests for the superclass would never succeed for the subclass.

As the name suggests, Liskov Substitution Principle prescribes substitutability of a class by its subclass. Broadly
put, *a class can be replaced by its subclass in all practical usage scenarios*.

This is actually in line with what Java also allows. A superclass reference can hold a subclass object i.e. superclass
can be replaced by subclass in a superclass reference at any time. So, Java inheritance mechanism follows Liskov
Substitution Principle.

## Liskov Violation Scenario Example : The Circle-Ellipse Problem

All circles are inherently ellipses with their major and minor axes being equal. In terms of classes if we make a
class `Ellipse` then `Circle` class will be a child of `Ellipse` class i.e. it will extend `Ellipse` class. Nothing
wrong in it so far.

Lets now use the Liskov Substitution Principle.

In this case an object of type `Circle` can be assigned to a reference of type `Ellipse`. So, all the methods
in `Ellipse` can/could be invoked on this object of `Circle` which is stored in it.

One inherent functionality of an ellipse is that its stretchable, i.e. the length of the two axes of an ellipse can be
changed. Lets say we have methods `setLengthOfAxisX()` and `setLengthOfAxisY()` through which the length of the two axes
X & Y of an ellipse can altered.

However, calling any of these two methods on an object of type circle inside a reference of type ellipse would lead to a
circle no longer being a circle as in a circle the length of the major and minor axes have to be equal. This is known as
the **Circle-Ellipse Problem**.

This is a typical violation scenario of Liskov Substitution Principle as assigning a sub-type object to a super type
reference doesn't work which is not in line with the principle. The principle actually expects it to work smoothly.

Same is the case with the classic *Rectangle-Sqaure example* where a Square is inherently a Rectangle with equal width
and height.

## Relation of Liskov Substitution Principle with Open Closed Principle

* Open Closed Principle says that a class should be open for extension and closed for modification. i.e. to modify what
  a class does, we should not change the original class.


* Rather, we should override the original class and implement the functionality to be changed in the overriding class.


* This way when the derived class's(or the sub-type's) object is used in place of the parent/super-class, then the
  overridden functionality is executed on executing the same functionality. This is exactly in line with the Liskov
  Principle we just saw above.

```java

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
```

```java
public class Square extends Rectangle {

  public Square(int side) {
    super(side, side);
  }

  @Override
  public void setHeight(int height) {
    setSide(height);
  }

  @Override
  public void setWidth(int width) {
    setSide(width);
  }

  public void setSide(int side) {
    super.setWidth(side);
    super.setHeight(side);
  }

}
```

`setHeight()` and `setWidth()` are overridden in order to set both dimensions to the same value so that instances of
Square remain mathematically valid squares.

This model is self-consistent !

We can pass `Square` whenever `Rectangle` is expected.

But, by doing so we may break assumptions that clients of `Rectangle` make about the "behavior" of a `Rectangle.

```java
public class LSPViolation {

  public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(10, 20);
    clientMethod(rectangle);

    Square square = new Square(10);
    clientMethod(square);
  }

  private static void clientMethod(Rectangle rectangle) {
    rectangle.setWidth(5);
    rectangle.setHeight(4);

    if (rectangle.computeArea() == 20)
      System.out.println("Area is 20");
    else
      System.out.println("Area is not equal to 20");
  }
}
```

The `clientMethod()` makes an assumption that is true for Rectangle: setting the width respectively height has no effect
on the other attribute. This assumption does not hold for Square!

The Rectangle/Square hierarchy violates the Liskov Substitution Principle (LSP)!

> Square is behaviorally not a correct substitution for Rectangle.

A Square does not comply with the behavior of a rectangle: Changing the height/width of a square behaves differently
from changing the height/width of a rectangle. Actually, it doesn't make sense to distinguish between the width and the
height of a square.

---


## Rectangle and Square - LSP Compliant Solution

```
             .------------------.
             |Shape             |
             |------------------|
             |+int computeArea()|
             '------------------'
                  '         '
                 '           '
.---------------'---.   .------'---------------.
|Square             |   |Rectangle             |
|-------------------|   |----------------------|
|+setSides(int side)|   |+setWidth(int width)  |
|+int computeArea() |   |+setHeight(int height)|
'-------------------'   |+int computeArea()    |
                        '----------------------'
```

* Clients of `Shape` cannot make any assumptions about the behavior of setter methods.
* When clients want to change properties of the shapes, they have to work with the concrete classes.
* When clients work with the concrete classes, they can make true assumptions about the computation of the area.

### So what does LSP add to the common Object-Oriented subtyping rules?

**It is not enough that instances of `SomeSubClass1` and `SomeSubClass2` provide all the methods declared
in `SomeBaseClass`.**

#### THESE METHODS SHOULD ALSO BEHAVE LIKE THEIR HEIRS.

A client method should not be able to distinguish the behavior of objects of `SomeSubClass1` and `SomeSubClass2` from
that of objects of `SomeBaseClass`.

#### LSP ADDITIONALLY REQUIRES BEHAVIORAL SUBSTITUTABILITY.

```
S is a behavioral sub-type of T

if

objects of type T in a program P may be replaced by objects of type S without altering any of the properties of P
```

---


## Another Example of LSP violation

```java
class TrasportationDevice {
  String name;

  String getName() { ...}

  void setName(String n) { ...}

  double speed;

  double getSpeed() { ...}

  void setSpeed(double d) { ...}

  Engine engine;

  Engine getEngine() { ...}

  void setEngine(Engine e) { ...}

  void startEngine() { ...}
}
```

```java
class Car extends TransportationDevice {

  @Override
  void startEngine() { ...}
}
```

There is no problem here, right?

A car is definitely a transportation device, and here we can see that it overrides the `startEngine()` method of its
superclass.

Let's add another transportation device:

```java
class Bicycle extends TransportationDevice {

  @Override
  void startEngine()  /* problem !! */
}
```

Everything isn't going as planned now!
Yes, a bicycle is a transportation device, however, it does not have an engine and hence, the method `startEngine()`
cannot be implemented.

These are the kinds of problems that violation of Liskov Substitution Principle leads to, and they can most usually be
recognized by a method that does nothing, or even can't be implemented.

The solution to these problems is a **correct inheritance hierarchy**, and in our case we would solve the problem by
differentiating classes of transportation devices with and without engines. Even though a bicycle is a transportation
device, it doesn't have an engine. In this example our definition of transportation device is wrong. It should not have
an engine.

![LSP Violation](https://github.com/abhinav-nath/design-patterns/blob/master/images/lsp_violation.png "LSP Violation")

We can refactor our `TransportationDevice` class as follows:

```java
class TrasportationDevice {

  String name;
  double speed;

  String getName() { ... }

  void setName(String n) { ... }

  double getSpeed() { ... }

  void setSpeed(double d) { ... }
}
```

Now we can extend `TransportationDevice` for non-motorized devices.

```java
class DeviceWithoutEngine extends TransportationDevice {
  void startMoving() { ...}
}
```

And extend `TransportationDevice` for motorized devices. Here is is more appropriate to add the `Engine` object.

```java
class DeviceWithEngine extends TransportationDevice {

  Engine engine;

  Engine getEngine() { ...}

  void setEngine(Engine e) { ...}

  void startEngine() { ...}

}
```

Thus our `Car` class becomes more specialized, while adhering to the Liskov Substitution Principle.

```java
class Car extends DeviceWithEngine {

  @Override
  void startEngine() { ...}

}
```

And our `Bicycle` class is also in compliance with the Liskov Substitution Principle.

```java
class Bicycle extends DeviceWithoutEngine {

  @Override
  void startMoving() { ...}

}
```

![LSP Compliance](https://github.com/abhinav-nath/design-patterns/blob/master/images/lsp_compliance.png "LSP Compliance")