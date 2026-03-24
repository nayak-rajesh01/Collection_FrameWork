

---

# Java 8 BinaryOperator Functional Interface

## What is BinaryOperator?

A **BinaryOperator** is a functional interface in **Java 8** that:

* Takes **two inputs**
* Both inputs are of the **same type**
* Returns a **result of the same type**

It is a **specialized form of BiFunction<T, T, T>**.

---

## Package

```java
import java.util.function.BinaryOperator;
```

---

## Functional Method

```java
T apply(T t1, T t2);
```

* Takes **two arguments**
* Returns **same type as input**

---

## Syntax

```java
BinaryOperator<T> operator = (a, b) -> {
    // operation
    return result;
};
```

---

## Example 1: Addition of Two Numbers

```java
import java.util.function.BinaryOperator;

public class Demo {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(10, 20)); // Output: 30
    }
}
```

---

## Example 2: Find Maximum

```java
import java.util.function.BinaryOperator;

public class Demo {
    public static void main(String[] args) {
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;

        System.out.println(max.apply(15, 25)); // Output: 25
    }
}
```

---

## Example 3: Concatenate Strings

```java
BinaryOperator<String> concat = (s1, s2) -> s1 + s2;

System.out.println(concat.apply("Java ", "8")); // Output: Java 8
```

---

## Useful Static Methods

### 1. maxBy()

Returns the maximum of two elements based on a Comparator.

```java
import java.util.Comparator;
import java.util.function.BinaryOperator;

BinaryOperator<Integer> maxOp = BinaryOperator.maxBy(Comparator.naturalOrder());

System.out.println(maxOp.apply(10, 50)); // Output: 50
```

---

### 2. minBy()

Returns the minimum of two elements based on a Comparator.

```java
BinaryOperator<Integer> minOp = BinaryOperator.minBy(Comparator.naturalOrder());

System.out.println(minOp.apply(10, 50)); // Output: 10
```

---

## Difference Between BiFunction and BinaryOperator

| Feature     | BiFunction<T, U, R>     | BinaryOperator<T>    |
| ----------- | ----------------------- | -------------------- |
| Input Types | T, U (can be different) | T, T (same type)     |
| Return Type | R                       | T (same as input)    |
| Use Case    | General purpose         | Same type operations |

---

## Real-Time Use Cases

* Arithmetic operations (add, multiply)
* Finding max/min values
* String concatenation
* Stream reduction operations

---

## Example with Streams (Reduction)

```java
import java.util.*;
import java.util.function.BinaryOperator;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        BinaryOperator<Integer> sum = (a, b) -> a + b;

        int result = list.stream().reduce(0, sum);

        System.out.println(result); // Output: 10
    }
}
```

---

## Key Points

* Part of **java.util.function**
* Takes **two inputs of same type**
* Returns **same type**
* Extends **BiFunction<T, T, T>**
* Commonly used in **Stream API (reduce)**

---

