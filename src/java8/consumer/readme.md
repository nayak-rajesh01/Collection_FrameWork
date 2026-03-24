
---

# Java 8 Consumer Functional Interface

## What is Consumer?

A **Consumer** is a **functional interface** in Java 8 that **accepts one input and does not return any result**.

It is mainly used when we want to **perform some operation on the input** like printing, updating, or storing data.

It belongs to the package:

```java
java.util.function.Consumer;
```

---

# Generic Form

```java
Consumer<T>
```

Where:

* **T** → Input type
* **Return type** → `void` (no return value)

---

# Abstract Method

The main method in Consumer is:

```java
void accept(T t)
```

* Takes **one input**
* **Performs an action**
* **Returns nothing**

---

# Basic Example

```java
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> c = name -> System.out.println(name);

        c.accept("Rajesh Kumar Nayak");
    }
}
```

### Output

```
Rajesh Kumar Nayak
```

Explanation
`accept()` receives the value and performs the action.

---

# Consumer with Integer

Example: Print square of a number.

```java
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        Consumer<Integer> c = n -> System.out.println(n * n);

        c.accept(5);
    }
}
```

Output

```
25
```

---

# Consumer with Collections

```java
import java.util.*;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rajesh","Amit","Ravi");

        Consumer<String> print = name -> System.out.println(name);

        names.forEach(print);
    }
}
```

Output

```
Rajesh
Amit
Ravi
```

---

# Consumer Default Method

Java 8 provides an important method:

| Method      | Purpose                                  |
| ----------- | ---------------------------------------- |
| `andThen()` | Perform another Consumer after the first |

---

# Example using `andThen()`

```java
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        Consumer<String> c1 = name -> System.out.println("Hello " + name);
        Consumer<String> c2 = name -> System.out.println("Welcome " + name);

        Consumer<String> result = c1.andThen(c2);

        result.accept("Rajesh");
    }
}
```

### Output

```
Hello Rajesh
Welcome Rajesh
```

Explanation:

1️⃣ First `c1` runs
2️⃣ Then `c2` runs

---

# Primitive Consumer Types

Java also provides specialized consumers for primitive types.

| Interface        | Input Type |
| ---------------- | ---------- |
| `IntConsumer`    | int        |
| `LongConsumer`   | long       |
| `DoubleConsumer` | double     |

Example:

```java
import java.util.function.IntConsumer;

public class Test {

    public static void main(String[] args) {

        IntConsumer c = n -> System.out.println(n * 2);

        c.accept(10);
    }
}
```

Output

```
20
```

---

# Predicate vs Function vs Consumer

| Interface | Input | Output  | Method     |
| --------- | ----- | ------- | ---------- |
| Predicate | 1     | boolean | `test()`   |
| Function  | 1     | result  | `apply()`  |
| Consumer  | 1     | void    | `accept()` |

Example meaning:

```
Predicate → check condition
Function → transform data
Consumer → perform action
```

---

# Real Interview Example

Print student names using Consumer.

```java
import java.util.*;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        List<String> students = Arrays.asList("Rajesh","Amit","Rahul");

        students.forEach(name -> System.out.println(name));
    }
}
```

---

# Summary

| Feature   | Description          |
| --------- | -------------------- |
| Interface | Consumer             |
| Package   | `java.util.function` |
| Method    | `accept()`           |
| Input     | One parameter        |
| Output    | No return value      |

---
