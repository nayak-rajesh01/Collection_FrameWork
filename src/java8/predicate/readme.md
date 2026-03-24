
---

# Java 8 Predicate Functional Interface

## What is Predicate?

A **Predicate** is a **functional interface** in Java introduced in **Java 8**.
It is used to **test a condition and return a boolean value** (`true` or `false`).

It belongs to the package:

```java
java.util.function.Predicate
```

A predicate takes **one input argument** and returns **true or false**.

---

# Method in Predicate

The main abstract method is:

```java
boolean test(T t)
```

* `T` → Input parameter
* Returns → `true` or `false`

---

# Basic Example

```java
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> p = num -> num > 10;

        System.out.println(p.test(5));
        System.out.println(p.test(20));
    }
}
```

### Output

```
false
true
```

Explanation:

* If the number is **greater than 10**, it returns `true`
* Otherwise it returns `false`

---

# Predicate with String

Example: Check string length.

```java
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> checkLength = str -> str.length() > 5;

        System.out.println(checkLength.test("Java"));
        System.out.println(checkLength.test("Programming"));
    }
}
```

Output

```
false
true
```

---

# Predicate with Collections

Example: Filter even numbers.

```java
import java.util.*;
import java.util.function.Predicate;

public class PredicateListExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,20,25,30);

        Predicate<Integer> isEven = num -> num % 2 == 0;

        for(Integer num : list)
        {
            if(isEven.test(num))
            {
                System.out.println(num);
            }
        }
    }
}
```

Output

```
10
20
30
```

---

# Predicate Default Methods

Java 8 provides **three important default methods**.

| Method     | Purpose                |
| ---------- | ---------------------- |
| `and()`    | Combine two conditions |
| `or()`     | Either condition true  |
| `negate()` | Reverse condition      |

---

# Example using `and()`

```java
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> greaterThan10 = n -> n > 10;
        Predicate<Integer> lessThan50 = n -> n < 50;

        Predicate<Integer> result = greaterThan10.and(lessThan50);

        System.out.println(result.test(30));
    }
}
```

Output

```
true
```

---

# Example using `or()`

```java
Predicate<Integer> p1 = n -> n > 50;
Predicate<Integer> p2 = n -> n % 2 == 0;

System.out.println(p1.or(p2).test(20));
```

Output

```
true
```

---

# Example using `negate()`

```java
Predicate<Integer> p = n -> n > 10;

System.out.println(p.negate().test(5));
```

Output

```
true
```

---

# Real Interview Example

Check if a number is **even using Predicate**.

```java
Predicate<Integer> isEven = n -> n % 2 == 0;

System.out.println(isEven.test(8));
```

Output

```
true
```

---

# Summary

| Feature   | Description          |
| --------- | -------------------- |
| Interface | Predicate            |
| Package   | `java.util.function` |
| Method    | `test()`             |
| Input     | One parameter        |
| Output    | Boolean              |

---

💡 **Tip for you (Rajesh):**

Predicate is commonly used with **Stream API** like this:

```java
list.stream()
    .filter(n -> n > 10)
    .forEach(System.out::println);
```

---

In **Java 8**, the **`Predicate<T>` functional interface** can take **different types of input data** depending on the **generic type `T`** you specify.

---

# Predicate Input Data Types

The generic form of predicate is:

```java
Predicate<T>
```

* `T` → Type of input argument
* Returns → `boolean`

So **Predicate can accept any data type** such as:

* Integer
* String
* Double
* Custom Objects
* Collections

---

# 1️⃣ Predicate with Integer

```java
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        Predicate<Integer> p = n -> n > 10;

        System.out.println(p.test(15));
    }
}
```

Output

```
true
```

---

# 2️⃣ Predicate with String

```java
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        Predicate<String> p = s -> s.length() > 5;

        System.out.println(p.test("Java"));
    }
}
```

Output

```
false
```

---

# 3️⃣ Predicate with Double

```java
Predicate<Double> p = d -> d > 50.5;

System.out.println(p.test(60.3));
```

Output

```
true
```

---

# 4️⃣ Predicate with Custom Object

Example using a **Student class**.

```java
class Student {
    int marks;

    Student(int marks){
        this.marks = marks;
    }
}
```

Predicate Example

```java
Predicate<Student> p = s -> s.marks > 40;

Student s1 = new Student(50);

System.out.println(p.test(s1));
```

Output

```
true
```

---

# 5️⃣ Predicate with List Elements

```java
List<Integer> list = Arrays.asList(10,20,30,40);

Predicate<Integer> p = n -> n > 20;

list.stream()
    .filter(p)
    .forEach(System.out::println);
```

Output

```
30
40
```

---

---
# Primitive Predicate Types (Important)

Java also provides **special predicate interfaces for primitive types** to improve performance.

| Interface         | Input Type |
| ----------------- | ---------- |
| `IntPredicate`    | int        |
| `LongPredicate`   | long       |
| `DoublePredicate` | double     |

---

### Example

```java
import java.util.function.IntPredicate;

public class Test {

    public static void main(String[] args) {

        IntPredicate p = n -> n % 2 == 0;

        System.out.println(p.test(10));
    }
}
```

Output

```
true
```

---

# Summary

| Predicate Type    | Input           |
| ----------------- | --------------- |
| `Predicate<T>`    | Any Object Type |
| `IntPredicate`    | int             |
| `LongPredicate`   | long            |
| `DoublePredicate` | double          |

All predicates **return `boolean`**.

---
