
---

# Java 8 BiFunction Functional Interface

## What is BiFunction?

A **BiFunction** is a functional interface introduced in **Java 8** that **takes two input arguments and returns a result**.

It is mainly used when we want to **perform an operation on two inputs and produce a single output**.

It belongs to the package:

```java
java.util.function
```

Import statement:

```java
import java.util.function.BiFunction;
```

---

# Functional Method

The **BiFunction interface contains one abstract method**:

```java
R apply(T t, U u);
```

### Parameters

| Parameter | Description           |
| --------- | --------------------- |
| T         | First input argument  |
| U         | Second input argument |
| R         | Result type           |

### Return Type

```java
R
```

Returns a **result after processing two inputs**.

---

# Generic Form

```java
BiFunction<T, U, R>
```

Where:

| Type | Meaning           |
| ---- | ----------------- |
| T    | First input type  |
| U    | Second input type |
| R    | Result type       |

Example:

```java
BiFunction<Integer, Integer, Integer>
BiFunction<String, String, String>
BiFunction<Integer, String, String>
```

---

# Simple Example

### Add Two Numbers

```java
import java.util.function.BiFunction;

public class Example1 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add =
                (a, b) -> a + b;

        System.out.println(add.apply(10, 20));
    }
}
```

Output

```
30
```

---

# Example 2

### Concatenate Two Strings

```java
import java.util.function.BiFunction;

public class Example2 {

    public static void main(String[] args) {

        BiFunction<String, String, String> combine =
                (s1, s2) -> s1 + " " + s2;

        System.out.println(combine.apply("Hello", "World"));
    }
}
```

Output

```
Hello World
```

---

# Default Method in BiFunction

Java provides **one default method**.

| Method    | Description                                |
| --------- | ------------------------------------------ |
| andThen() | Performs an operation after the BiFunction |

---

# andThen() Method

The **andThen() method allows chaining another function after BiFunction execution**.

### Syntax

```java
biFunction.andThen(function)
```

---

# Example of andThen()

```java
import java.util.function.BiFunction;
import java.util.function.Function;

public class AndThenExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> multiply =
                (a, b) -> a * b;

        Function<Integer, Integer> square =
                x -> x * x;

        int result = multiply.andThen(square).apply(5, 4);

        System.out.println(result);
    }
}
```

### Explanation

1. `multiply.apply(5,4)` → `20`
2. `square.apply(20)` → `400`

Output

```
400
```

---

# Real-world Example

### Create a Student Object

```java
import java.util.function.BiFunction;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentExample {

    public static void main(String[] args) {

        BiFunction<Integer, String, Student> createStudent =
                (id, name) -> new Student(id, name);

        Student s1 = createStudent.apply(101, "Rajesh");

        System.out.println(s1.id + " " + s1.name);
    }
}
```

Output

```
101 Rajesh
```

---

# Difference Between Function and BiFunction

| Feature | Function   | BiFunction      |
| ------- | ---------- | --------------- |
| Inputs  | 1 argument | 2 arguments     |
| Method  | apply(T t) | apply(T t, U u) |
| Return  | Result     | Result          |

---

# When to Use BiFunction

Use **BiFunction** when:

* You need **two input values**
* You want to **produce a result**
* You want **clean functional programming code**

Common use cases:

* Mathematical calculations
* Object creation
* Combining two values
* Data transformation

---

# Summary

* **BiFunction** is a functional interface in **Java 8**.
* It **accepts two arguments and returns a result**.
* Abstract method:

```
apply(T t, U u)
```

* Default method:

```
andThen()
```

---
