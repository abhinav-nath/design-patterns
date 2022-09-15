# SOLID Principles

## Single Responsibility Principle

### What does it say ?
> Classes should have a single responsibility and thus only a single reason to change.
> The classes you write, should not be a swiss army knife. They should do one thing, and to that one thing well.

### Problem:
`Text` class having 3 attributes - text, author and length
`Text` class also has a `printText()` method to print the text -> **this breaks SRP**

### Solution:
Move out `printText()` method to another class `Printer` (separation of concerns)
`Text` class should not care about printing the text


## Open Closed Principle

### What does it say ?
> Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

### Problem:
`Rectangle` class having 2 attributes - length and width
`AreaCalculator` class having method - `calculateRectangleArea(Rectangle rectangle)`
In future, if we want to calculate area of a Circle then create a `Circle` class with attribute - radius
Add another method in `AreaCalculator` - `calculateCircleArea(Circle circle)`
If new shape needs to be added then `AreaCalculator` has to be modified **again and again!**

### Solution:
Create an interface `Shape` with method - `double calculateArea()`
Now add as many shapes as you want and have the area calculation logic in the classes implementing the Shape interface

```java
Rectangle implements Shape
```

```java
Circle implements Shape
```

```java
Pentagon implements Shape
```

And the `AreaCalculator` class changes now has one method which takes the Shape as an argument :

```java
public double calculateShapeArea(Shape shape) {
  return shape.calculateArea();
}
```


## Liskov Substitution Principle

### What does it say ?
> Sub-types must be behaviorally substitutable for their base types.
> That means objects of the derived class must behave in a manner consistent with the promises made in the base class' contract.

### Problem:
**The Circle-Ellipse Problem or The Square-Rectangle Problem**
A `Square` is ideally a `Rectangle` with equal `width` and `height`
So `Square` can inherit `Rectangle` class having attributes - `width` and `height`
Through `setWidth()` and `setHeight()` methods, `width` and `height` can altered
Calling any of these two methods on an object of type `Square` inside a reference of type `Rectangle` would lead to a `Square` no longer being a `Square`.
Therefore a `Square` is behaviorally not a correct substitution for `Rectangle`!

### Solution:
Correct the inheritance hierarchy by introducing a `Shape` interface

```
	             .------------------.
	             |Shape             |
	             |------------------|
	             |------------------|
	             |+int computeArea()|
	             '------------------'
	                  '         '
	                 '           '
	.---------------'---.  .------'---------------.
	|Square             |  |Rectangle             |
	|-------------------|  |----------------------|
	|-------------------|  |----------------------|
	|+setSides(int side)|  |+setWidth(int width)  |
	|+int computeArea() |  |+setHeight(int height)|
	'-------------------'  |+int computeArea()    |
	                       '----------------------'
```

## Interface Segregation Principle

### What does it say ?
> Many client specific interfaces are better than one general purpose interface.
> Clients should not be forced to depend upon interfaces that they don't use.
> YAGNI - You Ain't Going to Need It.

### Problem:
An old-fashioned printer which can just print will also have to implement unnecessary methods `scan()` and `fax()`
So this interface violates ISP - it is a **"polluted"** or a **"fat"** interface

```java
public interface MachineViolatingISP {
  void print(Document d);
  void scan(Document d);
  void fax(Document d);
}
```

### Solution:
Segregate the general purpose interface into multiple specific (and cohesive) interfaces:
- `Printer : print()`
- `Scanner : scan()`
- `Faxer   : fax()`

```java
Photocopier implements Printer, Scanner
```

```java
Scanner implements Scanner
```

```java
OldFashionedPrinter implements Printer
```

```java
ModernPrinter implements Printer, Scanner, Faxer
```


## Dependency Inversion Principle

### What does it say ?

> High-level modules should not depend on low-level modules.
> Both should depend on abstractions.

> Abstractions should not depend on details.
> Details should depend on abstractions.

### Problem:

```java
LightBulb (class)

void turnOn()
void turnOff()
```

```java
ElectricPowerSwitch (class)

LightBulb lightBulb
boolean on

ElectricPowerSwitch(LightBulb lightBulb)

boolean isOn()
void press()
```

If you see in the code, the `LightBulb` class is hard-coded in `ElectricPowerSwitch`. But, a `switch` should not be tied to a `bulb`.
It should be able to turn on and off other appliances and devices too, say a fan or an AC.


### Solution:

```java
Switch (interface)

boolean isOn()
void press()
```

```java
Switchable (interface)

void turnOn()
void turnOff()
```

```java
ElectricPowerSwitch implements Switch

Switchable device
boolean on
```

```java
ElectricPowerSwitch(Switchable device)

boolean isOn()
void press()
```

```java
LightBulb implements Switchable

@Override turnOn()
@Override turnOff()
```

```java
Fan implements Switchable

@Override turnOn()
@Override turnOff()
```

```java
Client

Switchable bulb = new LightBulb();
Switch bulbSwitch = new ElectricPowerSwitch(bulb);
bulbSwitch.press();
bulbSwitch.press();

Switchable fan = new Fan();
Switch fanSwitch = new ElectricPowerSwitch(fan);
fanSwitch.press();
fanSwitch.press();
```
