
---

# Java 8 UnaryOperator Functional Interface

## What is UnaryOperator?

A **UnaryOperator** is a functional interface introduced in **Java 8** that **takes one input and returns a result of the same type**.

It is a **specialized form of Function<T, T>**.

---

## Package

```java
import java.util.function.UnaryOperator;
```

---

## Functional Method

```java
T apply(T t);
```

* Takes **one argument**
* Returns **same type as input**

---

## Syntax

```java
UnaryOperator<T> operator = (T t) -> {
    // operation
    return result;
};
```

---

## Example 1: Square a Number

```java
import java.util.function.UnaryOperator;

public class Demo {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;

        System.out.println(square.apply(5)); // Output: 25
    }
}
```

---

## Example 2: Convert String to Uppercase

```java
import java.util.function.UnaryOperator;

public class Demo {
    public static void main(String[] args) {
        UnaryOperator<String> toUpper = str -> str.toUpperCase();

        System.out.println(toUpper.apply("java")); // Output: JAVA
    }
}
```

---

## Example 3: Increment Value

```java
UnaryOperator<Integer> increment = x -> x + 1;

System.out.println(increment.apply(10)); // Output: 11
```

---

## Why Use UnaryOperator?

* When **input and output types are the same**
* Cleaner than using `Function<T, T>`
* Improves **code readability**
* Useful in **streams and transformations**

---

## Difference Between Function and UnaryOperator

| Feature     | Function<T, R>       | UnaryOperator<T>         |
| ----------- | -------------------- | ------------------------ |
| Input Type  | T                    | T                        |
| Return Type | R (can be different) | T (same as input)        |
| Use Case    | General purpose      | Same type transformation |

---

## Real-Time Use Case

* Modifying list elements
* Data transformation pipelines
* String formatting
* Mathematical operations

---

## Example with List

```java
import java.util.*;
import java.util.function.UnaryOperator;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        UnaryOperator<Integer> doubleValue = x -> x * 2;

        list.replaceAll(doubleValue);

        System.out.println(list); // Output: [2, 4, 6, 8]
    }
}
```

---

## Key Points

* Part of **java.util.function**
* Takes **one argument**
* Returns **same type**
* Used for **data transformation**
* Works well with **Streams API**

---
