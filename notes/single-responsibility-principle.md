# Single Responsibility Principle

> "Every **software component** should have one and only one responsibility and only one reason to change."

Component can be a class, a method, or a module.

In terms of Java classes:

> Classes should have a single responsibility and thus only a single reason to change.

A class should

* provide focused, single functionality only
* address a specific concern

Formulated by Robert Martin

* The classes you write, should not be a swiss army knife. They should do one thing, and do that one thing well.
* A class should only have one responsibility, which is further defined by Martin as "one reason to change".
* Gather together the things that change for the same reasons. Separate those things that change for different reasons.

> **The SRP is about limiting the impact of change.**

From : https://hackernoon.com/you-dont-understand-the-single-responsibility-principle-abfdd005b137

The SRP is a widely quoted justification for refactoring. This is often done without full understanding of the point of
the SRP and its context, leading to fragmentation of code bases with a range of negative consequences. Instead of being
a one-way street to minimally sized classes, the SRP is actually proposing a balance point between aggregation and
division.

If we keep our classes just with one responsibility, it does the following:

1. Makes the class easier to maintain
2. Potentially make class reusable (depending on whatever your class is dealing with)
3. Easier to test

```java
public class Service {

  public void insertStudent(Student student) {
    // insert student
  }

  public void updateStudent(Student student) {
    // update student
  }

  public void deleteStudent(Student student) {
    // delete student
  }

  public void insertCourse(Course course) {
    // insert course
  }

  public void updateCourse(Course course) {
    // update course
  }

  public void deleteCourse(Course course) {
    // delete course
  }
}
```

In code above shows violation of SRP because `Service.java` handle the business logic for `Student` and `Course` class.

In the future `Service.java` can become bloaters or even become our **nightmare** because we put everything
in `Service.java`.

The solution is we need to split `Service.java` into specific class to handle business logic
for `Student (StudentService.java)` and `Course (CourseService.java)`.

```java
public class CourseService {

  public void insert(Course course) {
    // insert course
  }

  public void update(Course course) {
    // update course
  }

  public void delete(Course course) {
    // delete course
  }
}
```

```java
public class StudentService {

  public void insert(Student student) {
    // insert student
  }

  public void update(Student student) {
    // update student
  }

  public void delete(Student student) {
    // delete student
  }
}
```

---

## (Bad) Example

Let's consider this classic example in Java **objects that can print themselves**:

```java
class Text {

  String text;
  String author;
  int length;

  String getText() { ... }

  void setText(String s) { ... }

  String getAuthor() { ... }

  void setAuthor(String s) { ... }

  int getLength() { ... }

  void setLength(int k) { ... }

  // methods that change the text
  void allLettersToUpperCase() { ... }

  void findSubTextAndDelete(String s) { ... }

  // method for formatting output
  void printText() { ... }

}
```

At first glance, this class might look correctly written. However, it contradicts the single responsibility principle,
in that it has multiple reasons to change:
we have two methods which change the text itself, and one which prints the text for the user. If any of these methods is
called, the class will change. This is also not good because it mixes the logic of the class with the presentation.

---

## Better Example

One way of fixing this is writing another class whose only concern is to print text. This way, we will separate the
functional and the "cosmetic" parts of the class.

```java
class Text {

    String text;
    String author;
    int length;

    String getText() { ... }

    void setText(String s) { ... }

    String getAuthor() { ... }

    void setAuthor(String s) { ... }

    int getLength() { ... }

    void setLength(int k) { ... }

    // methods that change the text
    void allLettersToUpperCase() { ... }

    void findSubTextAndDelete(String s) { ... }

}
```

```java
class Printer {

    Text text;

    Printer(Text t) {
        this.text = t;
    }

    void printText() { ... }

}
```

---

## Summary

In the second example we have divided the responsibilities of editing text and printing text between two classes. You
can notice that, if an error occurred, the debugging would be easier, since it wouldn't be that difficult to recognize
where the mistake is. Also, there is less risk of accidentally introducing software bugs, since you're modifying a
smaller portion of code. Even though it's not that noticeable in this example (since it is small), this kind of approach
allows you to see the **bigger picture** and not lose yourself in the code; it makes programs easier to upgrade and
expand, without the classes being too extensive, and the code becoming confusing.

---

# Cohesion and Coupling

Cohesion and Coupling are two important aspects of SRP.

To achieve SRP:

* **Aim for High Cohesion**
* **Aim for Low Coupling**

## Cohesion

> *Cohesion is the degree to which the various parts of a software components are related*

![Cohesion](https://github.com/abhinav-nath/design-patterns/blob/master/images/srp_cohesion.png "Cohesion in General")

* The contents of the garbage have low cohesion
* The contents of each bin have high cohesion because those are related items

```java
public class Square {

    int side = 5;

    public int calculateArea() {
        return side * side;
    }

    public int calculatePerimeter() {
        return side * 4;
    }

    public void draw(boolean isHighResolutionMonitor) {
        if (isHighResolutionMonitor) {
            // Render a high resolution image of a square
        } else {
            // Render a normal image of a square
        }
    }

    public void rotate(int degree) {
        // Rotate the image of the square to the input degree
    }

}
```

In the above example:

* `calculateArea()` and `calculatePerimeter()` are cohesive (closely related) because they deal with the measurements of
  a square
* `draw()` and `rotate()` are cohesive because they deal with rendering of the image

BUT

* The overall degree of cohesion of `Square` class is low because there are unrelated methods inside the same class

> To increase the level of cohesion, we should segregate the code based on the responsibilities.

Aiming for higher cohesion helps us to move towards Single Responsibility Principle.

```java
public class Square {

    int side = 5;

    public int calculateArea() {
        return side * side;
    }

    public int calculatePerimeter() {
        return side * 4;
    }

}
```

```java
public class SquareUI {

    public void draw(boolean isHighResolutionMonitor) {
        if (isHighResolutionMonitor) {
            // Render a high resolution image of a square
        } else {
            // Render a normal image of a square
        }
    }

    public void rotate(int degree) {
        // Rotate the image of the square to the input degree
    }

}
```

## Coupling

> *Coupling is defined as the level of inter-dependency between various software components*

Tight coupling is bad in softwares!

```java
@Getter
@Setter
public class Student {

    private String id;
    private Date dob;
    private String address;

    public void save() {
        // open JDBC connection
        // insert Student into DB
        // close connection
    }

}
```

In the above example:

* The `save()` method is tightly coupled with `Student` object
* `Student` class should be contained only to carry the details of a student
* The `Student` class should not be dealing with low level details of dealing with database
* We can solve this problem by creating a `StudentRepository` class and hand over the database save part to that class

```java
@Getter
@Setter
public class Student {

    private String id;
    private Date dob;
    private String address;

}
```

```java
public class StudentRepository {

    public void save(Student student) {
        // open JDBC connection
        // insert Student into DB
        // close connection
    }

}
```