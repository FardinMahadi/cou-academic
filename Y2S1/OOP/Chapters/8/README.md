# Chapter 8: Objects and Classes

## Overview

This chapter introduces Object-Oriented Programming (OOP), focusing on how to define classes and create objects. OOP is a paradigm that uses objects to design applications and computer programs.

## Table of Contents

1. [Defining Classes and Creating Objects](#defining-classes-and-creating-objects)
2. [Constructors](#constructors)
3. [Accessing Objects via Reference Variables](#accessing-objects-via-reference-variables)
4. [Using Classes from the Java Library](#using-classes-from-the-java-library)
5. [Static Variables, Constants, and Methods](#static-variables-constants-and-methods)
6. [Visibility Modifiers](#visibility-modifiers)
7. [Data Field Encapsulation](#data-field-encapsulation)
8. [Array of Objects](#array-of-objects)

---

## Defining Classes and Creating Objects

A **class** is a blueprint for objects. An **object** is an instance of a class.

**Example:**
```java
class SimpleCircle {
    double radius;

    double getArea() {
        return radius * radius * Math.PI;
    }
}
```

To create an object:
```java
SimpleCircle myCircle = new SimpleCircle();
myCircle.radius = 5.0;
```

## Constructors

Constructors are special methods invoked to create a new object. They must have the same name as the class and no return type.

```java
public class SimpleCircle {
    double radius;

    // Default constructor
    SimpleCircle() {
        radius = 1.0;
    }

    // Parameterized constructor
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }
}
```

## Accessing Objects via Reference Variables

Objects are accessed via the object's reference variable, which contains a reference to the object.

```java
SimpleCircle c1 = new SimpleCircle(); // c1 is a reference variable
```

## Using Classes from the Java Library

Java provides many useful classes like `Date`, `Random`, and `Point2D`.

```java
java.util.Date date = new java.util.Date();
System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
```

## Static Variables, Constants, and Methods

- **Instance variables**: Tied to a specific instance of the class.
- **Static variables**: Shared by all instances of the class.

```java
public class Circle {
    double radius; // instance variable
    static int numberOfObjects = 0; // static variable

    Circle() {
        radius = 1.0;
        numberOfObjects++;
    }
}
```

## Visibility Modifiers

- `public`: Accessible from any class.
- `private`: Accessible only within its own class.
- (Default): Accessible by any class in the same package.

## Data Field Encapsulation

Encapsulation makes data fields private and provides public getter and setter methods to access and update them.

```java
public class Student {
    private int id; // private data field

    public int getId() { // getter
        return id;
    }

    public void setId(int newId) { // setter
        id = newId;
    }
}
```

## Array of Objects

An array of objects is actually an array of reference variables.

```java
Circle[] circleArray = new Circle[10];
for (int i = 0; i < circleArray.length; i++) {
    circleArray[i] = new Circle();
}
```

---

## Summary

- A class defines properties and behaviors for objects.
- Objects are instances of classes.
- Constructors are used to initialize objects.
- Static members belong to the class, while instance members belong to the object.
- Encapsulation protects data via visibility modifiers and accessors/mutators.
