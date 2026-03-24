
---

# Java 8 Function Functional Interface

## What is Function?

A **Function** is a **functional interface** in Java 8 that **takes one input and returns one output**.

It is used when we want to **transform or convert data from one type to another**.

It belongs to the package:

```java
java.util.function.Function;
```

Generic form:

```java
Function<T, R>
```

Where:

* **T** → Input type
* **R** → Return type (Result)

---

# Abstract Method

The main method in `Function` is:

```java
R apply(T t)
```

* Takes **input `T`**
* Returns **result `R`**

---

# Basic Example

```java
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(5));
    }
}
```

Output

```
25
```

Explanation:

Input → `5`
Output → `25`

---

# Function with String

Example: Get length of a string.

```java
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

        Function<String, Integer> length = str -> str.length();

        System.out.println(length.apply("Java"));
    }
}
```

Output

```
4
```

---

# Function with Object

Example using a **Student class**.

```java
class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}
```

Function Example:

```java
Function<Student, Integer> getMarks = s -> s.marks;

Student s = new Student(85);

System.out.println(getMarks.apply(s));
```

Output

```
85
```

---

# Default Methods in Function

Java 8 provides **useful default methods**.

| Method      | Purpose                                   |
| ----------- | ----------------------------------------- |
| `andThen()` | Perform another function after the first  |
| `compose()` | Perform another function before the first |

---

# Example using `andThen()`

```java
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

        Function<Integer, Integer> multiply = n -> n * 2;
        Function<Integer, Integer> square = n -> n * n;

        System.out.println(multiply.andThen(square).apply(5));
    }
}
```

Steps

```
5 * 2 = 10
10 * 10 = 100
```

Output

```
100
```

---

# Example using `compose()`

```java
Function<Integer,Integer> multiply = n -> n * 2;
Function<Integer,Integer> square = n -> n * n;

System.out.println(multiply.compose(square).apply(5));
```

Steps

```
5 * 5 = 25
25 * 2 = 50
```

Output

```
50
```

---

# Primitive Function Types

Java provides specialized interfaces for primitive data types.

| Interface           | Description  |
| ------------------- | ------------ |
| `IntFunction<R>`    | Input int    |
| `LongFunction<R>`   | Input long   |
| `DoubleFunction<R>` | Input double |

Example

```java
import java.util.function.IntFunction;

public class Test {

    public static void main(String[] args) {

        IntFunction<Integer> square = n -> n * n;

        System.out.println(square.apply(6));
    }
}
```

Output

```
36
```

---

# Predicate vs Function (Important Interview Question)

| Feature | Predicate          | Function            |
| ------- | ------------------ | ------------------- |
| Input   | One input          | One input           |
| Output  | Boolean            | Any type            |
| Method  | `test()`           | `apply()`           |
| Use     | Condition checking | Data transformation |

Example

```
Predicate → check condition
Function → transform data
```

---

# Real Example

Convert a list of names to uppercase.

```java
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("rajesh","amit","ravi");

        List<String> result = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
```

Output

```
[RAJESH, AMIT, RAVI]
```

---

# Summary

| Feature   | Description          |
| --------- | -------------------- |
| Interface | Function             |
| Package   | `java.util.function` |
| Method    | `apply()`            |
| Input     | One parameter        |
| Output    | Any type             |

---


---

In **Java 8**, the **`Function<T, R>` functional interface** can accept **many types of input data**.
The input type is defined by the **generic parameter `T`**.

General form:

```java
Function<T, R>
```

* **T** → Input data type
* **R** → Return (result) data type

So the **Function interface can take almost any data type as input**.

---

# 1️⃣ Function with Integer Input

```java
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(5));
    }
}
```

Output

```
25
```

Input type → `Integer`

---

# 2️⃣ Function with String Input

```java
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        Function<String, Integer> length = str -> str.length();

        System.out.println(length.apply("Java"));
    }
}
```

Output

```
4
```

Input type → `String`

---

# 3️⃣ Function with Double Input

```java
Function<Double, Double> half = d -> d / 2;

System.out.println(half.apply(10.0));
```

Output

```
5.0
```

Input type → `Double`

---

# 4️⃣ Function with Custom Object

Example:

```java
class Student {
    int marks;

    Student(int marks){
        this.marks = marks;
    }
}
```

Function Example:

```java
Function<Student, Integer> getMarks = s -> s.marks;

Student s = new Student(80);

System.out.println(getMarks.apply(s));
```

Output

```
80
```

Input type → `Student object`

---

# 5️⃣ Primitive Special Function Types

Java also provides **special functional interfaces for primitive inputs** to improve performance.

| Interface           | Input Type |
| ------------------- | ---------- |
| `IntFunction<R>`    | int        |
| `LongFunction<R>`   | long       |
| `DoubleFunction<R>` | double     |

Example:

```java
import java.util.function.IntFunction;

public class Test {
    public static void main(String[] args) {

        IntFunction<Integer> square = n -> n * n;

        System.out.println(square.apply(6));
    }
}
```

Output

```
36
```

---

# Summary

`Function` can accept:

| Input Type | Example                                         |
| ---------- | ----------------------------------------------- |
| Integer    | `Function<Integer,Integer>`                     |
| String     | `Function<String,Integer>`                      |
| Double     | `Function<Double,Double>`                       |
| Object     | `Function<Student,Integer>`                     |
| Primitive  | `IntFunction`, `LongFunction`, `DoubleFunction` |

✔ **Important:**
`Function` always takes **one input** and returns **one output**.

---
