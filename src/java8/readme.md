
---

# Java 8 Functional Interfaces – Complete Notes

## 📌 Introduction

Java 8 introduced **Functional Interfaces** to support **Lambda Expressions** and **Functional Programming**.

A **Functional Interface** is an interface that contains **only one abstract method**.

---

## ✅ Common Functional Interfaces (java.util.function)

| Interface      | Input    | Output   | Use Case                     |
| -------------- | -------- | -------- | ---------------------------- |
| Predicate      | 1        | Boolean  | Condition check              |
| Function       | 1        | 1        | Transformation               |
| Consumer       | 1        | Void     | Perform action               |
| Supplier       | 0        | 1        | Provide value                |
| UnaryOperator  | 1        | 1 (same) | Modify same type             |
| BinaryOperator | 2 (same) | 1 (same) | Combine values               |
| BiPredicate    | 2        | Boolean  | Compare conditions           |
| BiFunction     | 2        | 1        | Transform two inputs         |
| BiConsumer     | 2        | Void     | Perform action on two inputs |

---

# 🔹 Predicate

## ✔ Definition

Used to **test a condition** and returns **true/false**.

```java
Predicate<Integer> isEven = x -> x % 2 == 0;
System.out.println(isEven.test(10)); // true
```

## ✔ Methods

* `test()`
* `and()`
* `or()`
* `negate()`

---

# 🔹 Function

## ✔ Definition

Takes input and returns a **different output**.

```java
Function<Integer, String> fun = x -> "Number: " + x;
System.out.println(fun.apply(5));
```

## ✔ Methods

* `apply()`
* `andThen()`
* `compose()`

---

# 🔹 Consumer

## ✔ Definition

Consumes input and **does not return anything**.

```java
Consumer<String> print = str -> System.out.println(str);
print.accept("Hello");
```

## ✔ Methods

* `accept()`
* `andThen()`

---

# 🔹 Supplier

## ✔ Definition

Provides a value without taking input.

```java
Supplier<Double> random = () -> Math.random();
System.out.println(random.get());
```

---

# 🔹 UnaryOperator

## ✔ Definition

Takes **one input** and returns **same type output**.

```java
UnaryOperator<Integer> square = x -> x * x;
System.out.println(square.apply(5)); // 25
```

✔ Special case of `Function<T, T>`

---

# 🔹 BinaryOperator

## ✔ Definition

Takes **two inputs (same type)** and returns **same type**.

```java
BinaryOperator<Integer> add = (a, b) -> a + b;
System.out.println(add.apply(10, 20)); // 30
```

✔ Special case of `BiFunction<T, T, T>`

---

# 🔹 BiPredicate

## ✔ Definition

Takes **two inputs** and returns **boolean**.

```java
BiPredicate<Integer, Integer> check = (a, b) -> a > b;
System.out.println(check.test(10, 5)); // true
```

---

# 🔹 BiFunction

## ✔ Definition

Takes **two inputs** and returns a result.

```java
BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
System.out.println(multiply.apply(2, 3)); // 6
```

---

# 🔹 BiConsumer

## ✔ Definition

Consumes **two inputs** and returns nothing.

```java
BiConsumer<String, Integer> print = (name, age) ->
        System.out.println(name + " " + age);

print.accept("Rajesh", 22);
```

---

# 🚀 Lambda Expression

## ✔ Syntax

```java
(parameters) -> expression
```

## ✔ Example

```java
(a, b) -> a + b
```

---

# 🔄 Stream API (Quick Use)

```java
List<Integer> list = Arrays.asList(1,2,3,4);

list.stream()
    .filter(x -> x % 2 == 0)
    .map(x -> x * 2)
    .forEach(System.out::println);
```

---

# 💡 Real-Time Use Cases

* Data filtering (Predicate)
* Data transformation (Function)
* Logging / printing (Consumer)
* Random data generation (Supplier)
* Mathematical operations (Unary/BinaryOperator)
* Stream processing

---

# 🔑 Key Points

* Functional Interface = **1 abstract method**
* Supports **Lambda Expressions**
* Improves **code readability & performance**
* Widely used in **Streams API**
* Available in **java.util.function package**

---

# 🧠 Interview Tips

* Predicate → Boolean return
* Function → Returns value
* Consumer → No return
* Supplier → No input
* UnaryOperator → Same input/output type
* BinaryOperator → Two inputs, same type

---

# 📌 Conclusion

Java 8 Functional Interfaces make code:

* ✔ Short
* ✔ Clean
* ✔ Readable
* ✔ Powerful (with Streams & Lambda)

---
Here’s an **Interview Questions + Answers section** you can directly append to your `README.md` 👇

---

# 🎯 Java 8 Functional Interfaces – Interview Questions & Answers

---

## ❓ 1. What is a Functional Interface?

**Answer:**
A Functional Interface is an interface that contains **only one abstract method**.
It can have multiple **default and static methods**.

👉 Example:

```java
@FunctionalInterface
interface Demo {
    void show();
}
```

---

## ❓ 2. What is the use of @FunctionalInterface annotation?

**Answer:**

* It ensures the interface has **only one abstract method**
* Gives **compile-time error** if violated
* Improves **code readability**

---

## ❓ 3. What is a Lambda Expression?

**Answer:**
A Lambda Expression is a **short way to implement a functional interface**.

👉 Syntax:

```java
(parameters) -> expression
```

👉 Example:

```java
(a, b) -> a + b
```

---

## ❓ 4. Difference between Function and Predicate?

| Feature  | Function       | Predicate          |
| -------- | -------------- | ------------------ |
| Return   | Any type       | Boolean            |
| Method   | apply()        | test()             |
| Use Case | Transformation | Condition checking |

---

## ❓ 5. Difference between Consumer and Supplier?

| Feature | Consumer    | Supplier      |
| ------- | ----------- | ------------- |
| Input   | Takes input | No input      |
| Output  | No return   | Returns value |
| Method  | accept()    | get()         |

---

## ❓ 6. What is UnaryOperator?

**Answer:**
A functional interface that takes **one input and returns the same type**.

👉 Example:

```java
UnaryOperator<Integer> square = x -> x * x;
```

---

## ❓ 7. What is BinaryOperator?

**Answer:**
A functional interface that takes **two inputs of same type and returns same type**.

👉 Example:

```java
BinaryOperator<Integer> add = (a, b) -> a + b;
```

---

## ❓ 8. Difference between Function and UnaryOperator?

| Feature     | Function<T, R> | UnaryOperator<T>         |
| ----------- | -------------- | ------------------------ |
| Input Type  | T              | T                        |
| Return Type | R              | T                        |
| Use Case    | General        | Same type transformation |

---

## ❓ 9. Difference between BiFunction and BinaryOperator?

| Feature | BiFunction<T, U, R> | BinaryOperator<T> |
| ------- | ------------------- | ----------------- |
| Inputs  | T, U                | T, T              |
| Return  | R                   | T                 |

---

## ❓ 10. What are default methods?

**Answer:**
Methods with implementation inside interface using `default` keyword.

👉 Example:

```java
default void show() {
    System.out.println("Hello");
}
```

---

## ❓ 11. What are static methods in interface?

**Answer:**
Methods defined using `static` keyword and accessed using interface name.

👉 Example:

```java
static void display() {
    System.out.println("Static method");
}
```

---

## ❓ 12. Can a functional interface have multiple methods?

**Answer:**
Yes, but only **one abstract method**.
It can have:

* Multiple **default methods**
* Multiple **static methods**

---

## ❓ 13. What is method reference?

**Answer:**
A **shorter form of lambda expression** using `::` operator.

👉 Example:

```java
System.out::println
```

---

## ❓ 14. What is Stream API?

**Answer:**
Used to **process collections of data** in a functional style.

👉 Example:

```java
list.stream()
    .filter(x -> x % 2 == 0)
    .forEach(System.out::println);
```

---

## ❓ 15. Difference between map() and filter()?

| Method   | Use Case                       |
| -------- | ------------------------------ |
| map()    | Transform data                 |
| filter() | Select data based on condition |

---

## ❓ 16. What is reduce()?

**Answer:**
Used to **combine elements into a single result**.

👉 Example:

```java
int sum = list.stream().reduce(0, (a, b) -> a + b);
```

---

## ❓ 17. What is the advantage of Lambda Expressions?

**Answer:**

* Less code
* Better readability
* Enables functional programming
* Works with Stream API

---

## ❓ 18. Can we use Lambda without Functional Interface?

**Answer:**
❌ No
Lambda works **only with functional interfaces**

---

## ❓ 19. What is BiPredicate?

**Answer:**
Takes **two inputs and returns boolean**

```java
BiPredicate<Integer, Integer> check = (a, b) -> a > b;
```

---

## ❓ 20. Real-time use of Functional Interfaces?

**Answer:**

* Filtering data (Predicate)
* Transforming data (Function)
* Logging (Consumer)
* Generating values (Supplier)
* Stream processing

---

# 🚀 Pro Tip for Interviews

👉 Remember this shortcut:

* **Predicate → Boolean**
* **Function → Return value**
* **Consumer → No return**
* **Supplier → No input**
* **UnaryOperator → 1 input (same type)**
* **BinaryOperator → 2 input (same type)**

---

----

---


Perfect 🔥 Let’s level up your Java 8 prep with **Tricky Coding Questions + MCQs + Real Interview Scenarios** — ready to add in your `README.md` 👇

---

# 🚀 Advanced Java 8 Interview Preparation

---

# 🔥 Tricky Coding Questions

---

## ❓ 1. Find Even Numbers Using Predicate

```java id="qv4z7s"
import java.util.*;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Predicate<Integer> isEven = x -> x % 2 == 0;

        list.stream()
            .filter(isEven)
            .forEach(System.out::println);
    }
}
```

✅ **Output:** 2 4 6

---

## ❓ 2. Find Sum Using BinaryOperator

```java id="knk55h"
import java.util.*;
import java.util.function.BinaryOperator;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        BinaryOperator<Integer> sum = (a, b) -> a + b;

        int result = list.stream().reduce(0, sum);

        System.out.println(result);
    }
}
```

✅ **Output:** 10

---

## ❓ 3. String Length Using Function

```java id="3i6a8y"
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<String, Integer> length = str -> str.length();

        System.out.println(length.apply("Java"));
    }
}
```

✅ **Output:** 4

---

## ❓ 4. Modify List Using UnaryOperator

```java id="k92x0r"
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        list.replaceAll(x -> x * 2);

        System.out.println(list);
    }
}
```

✅ **Output:** [2, 4, 6]

---

## ❓ 5. Supplier Random Value

```java id="ed9qfk"
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();

        System.out.println(random.get());
    }
}
```

---

# 🧠 MCQs (SHL Pattern)

---

## ❓ 1. Which functional interface returns boolean?

A. Function
B. Consumer
C. Predicate
D. Supplier

✅ **Answer:** C (Predicate)

---

## ❓ 2. Which method is used in Consumer?

A. apply()
B. test()
C. accept()
D. get()

✅ **Answer:** C (accept)

---

## ❓ 3. How many abstract methods are allowed in functional interface?

A. 0
B. 1
C. 2
D. Unlimited

✅ **Answer:** B (1)

---

## ❓ 4. What is output?

```java id="x7m4h0"
Predicate<Integer> p = x -> x > 5;
System.out.println(p.test(3));
```

A. true
B. false
C. error
D. none

✅ **Answer:** B (false)

---

## ❓ 5. Which interface does NOT take input?

A. Supplier
B. Consumer
C. Function
D. Predicate

✅ **Answer:** A (Supplier)

---

## ❓ 6. What is output?

```java id="z2c3jp"
UnaryOperator<Integer> op = x -> x * x;
System.out.println(op.apply(3));
```

A. 3
B. 6
C. 9
D. error

✅ **Answer:** C (9)

---

## ❓ 7. What is output?

```java id="8bjw7q"
BinaryOperator<Integer> op = (a, b) -> a + b;
System.out.println(op.apply(2, 3));
```

A. 5
B. 6
C. error
D. none

✅ **Answer:** A (5)

---

## ❓ 8. Which operator is used in Lambda?

A. ->
B. =>
C. ::
D. ==

✅ **Answer:** A (->)

---

# 🎯 Real Interview Scenarios

---

## 💼 Scenario 1: Filter Employees by Salary

👉 **Problem:** Filter employees with salary > 50,000

```java id="5r4a9w"
list.stream()
    .filter(emp -> emp.getSalary() > 50000)
    .forEach(System.out::println);
```

---

## 💼 Scenario 2: Convert Names to Uppercase

```java id="k7j0qv"
list.stream()
    .map(String::toUpperCase)
    .forEach(System.out::println);
```

---

## 💼 Scenario 3: Find Maximum Number

```java id="v2m6kz"
int max = list.stream()
              .reduce(Integer.MIN_VALUE, Integer::max);
```

---

## 💼 Scenario 4: Count Even Numbers

```java id="3umh5x"
long count = list.stream()
                 .filter(x -> x % 2 == 0)
                 .count();
```

---

## 💼 Scenario 5: Sort List

```java id="pt6k3n"
list.stream()
    .sorted()
    .forEach(System.out::println);
```

---

# 🔥 Bonus: Trick Interview Question

## ❓ What will happen?

```java id="0c9n5h"
List<Integer> list = Arrays.asList(1,2,3);

list.stream()
    .map(x -> x * 2);
```

👉 **Answer:** ❌ No output
✔ Because **terminal operation** (like `forEach`, `collect`) is missing

---

# 🚀 Final Interview Tips

* Always remember **functional interface types**
* Practice **Stream API**
* Focus on **Lambda syntax**
* Know **method references (::)**
* Practice **real problems**

---




