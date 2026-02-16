# Chapter 10: Thinking in Objects

## Overview

This chapter explores deeper object-oriented design principles, including class abstraction, encapsulation, composition, and the effective use of the `this` reference.

## Table of Contents

1. [Immutable Objects and Classes](#immutable-objects-and-classes)
2. [Scope of Variables](#scope-of-variables)
3. [The `this` Reference](#the-this-reference)
4. [Class Abstraction and Encapsulation](#class-abstraction-and-encapsulation)
5. [Object Composition](#object-composition)
6. [Designing Classes (Course, Stack)](#designing-classes)
7. [Class Design Guidelines](#class-design-guidelines)

---

## Immutable Objects and Classes

An immutable object is one whose contents cannot be changed after creation.
**Requirements for Immutability:**
1. All data fields must be private.
2. No mutator (setter) methods provided.
3. No accessor methods return references to mutable objects.

## Scope of Variables

- **Instance/Static variables**: Scope is the entire class (can be declared anywhere).
- **Local variables**: Scope is from declaration to the end of the block.

## The `this` Reference

The `this` keyword refers to the object itself.
**Uses:**
1. Reference an instance member hidden by a local variable.
2. Invoke one constructor from another (constructor chaining).

```java
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name; // 'this.name' refers to instance variable
    }
}
```

## Class Abstraction and Encapsulation

- **Abstraction**: Separating class implementation from use. The user only needs the class contract (public methods).
- **Encapsulation**: Hiding implementation details (private fields).

## Object Composition

Composition (the "has-a" relationship) is where a class contains a reference to an object of another class.

```java
public class Student {
    private String name;
    private Address address; // Composition: Student has an Address
}
```

---

## Designing Classes

### Course Class
Encapsulates course name and student enrollment logic.

### Stack Class
Implementation of a stack data structure for integers.

---

## Class Design Guidelines

1. **Cohesion**: A class should describe a single entity.
2. **Consistency**: Follow Java naming conventions and patterns.
3. **Encapsulation**: Use `private` fields and only provide necessary accessors.
4. **Clarity**: Design intuitive methods and relationships.
5. **Completeness**: Provide a variety of constructors and methods for flexibility.

---

## Summary

- Use `this` to resolve naming conflicts and chain constructors.
- Design classes with high cohesion and low coupling.
- Abstraction separates 'what' a class does from 'how' it does it.
- Composition represents relationships between objects.
