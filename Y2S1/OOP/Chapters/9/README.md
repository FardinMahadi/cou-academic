# Chapter 9: Strings and Text I/O

## Overview

This chapter covers how to work with strings using the `String`, `StringBuilder`, and `StringBuffer` classes. It also introduces basic file handling using the `File` class and I/O using `Scanner` and `PrintWriter`.

## Table of Contents

1. [The String Class](#the-string-class)
2. [The Character Class](#the-character-class)
3. [StringBuilder and StringBuffer](#stringbuilder-and-stringbuffer)
4. [Command-Line Arguments](#command-line-arguments)
5. [The File Class](#the-file-class)
6. [File Input and Output](#file-input-and-output)

---

## The String Class

Strings are objects in Java. The `String` class is immutable, meaning its content cannot be changed once created.

**Common Methods:**
- `length()`: Returns the number of characters.
- `charAt(index)`: Returns character at specific index.
- `substring(begin, end)`: Returns a part of the string.
- `toUpperCase()` / `toLowerCase()`: Change case.
- `equals(otherString)`: Compares content (don't use `==`).
- `indexOf(char)` / `lastIndexOf(char)`: Search for characters.

## The Character Class

The `Character` class provides static methods for testing characters.

```java
Character.isDigit('a');    // false
Character.isLetter('a');   // true
Character.isUpperCase('A'); // true
```

## StringBuilder and StringBuffer

Unlike `String`, `StringBuilder` and `StringBuffer` are mutable. `StringBuilder` is more efficient but not thread-safe.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // Modifies the same object
sb.insert(5, ",");   // "Hello, World"
```

## Command-Line Arguments

Java programs can receive arguments when executed.

```java
public static void main(String[] args) {
    for (String arg : args) {
        System.out.println(arg);
    }
}
```

## The File Class

The `File` class is used to obtain file/directory properties (size, path, existence). It does **not** read or write content.

```java
java.io.File file = new java.io.File("test.txt");
System.out.println("Exists? " + file.exists());
```

## File Input and Output

- **PrintWriter**: Used to create a file and write data to it.
- **Scanner**: Used to read data from a file.

**Writing:**
```java
java.io.PrintWriter output = new java.io.PrintWriter(file);
output.println("John Doe");
output.close();
```

**Reading:**
```java
java.util.Scanner input = new java.util.Scanner(file);
while (input.hasNext()) {
    String name = input.next();
    System.out.println(name);
}
input.close();
```

---

## Summary

- `String` objects are immutable.
- Use `equals()` to compare string contents.
- `StringBuilder` is for mutable strings.
- `File` class manages file properties.
- `PrintWriter` and `Scanner` are for basic text I/O.
