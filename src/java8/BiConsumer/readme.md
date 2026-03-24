
---

# Java 8 BiConsumer Functional Interface

## What is BiConsumer?

A **BiConsumer** is a functional interface introduced in **Java 8** that **takes two input arguments and performs an operation but does not return any result**.

It is mainly used when we want to **consume or process two inputs together**.

It belongs to the package:

```java
java.util.function
```

Import statement:

```java
import java.util.function.BiConsumer;
```

---

# Functional Method

The **BiConsumer interface contains one abstract method**:

```java
void accept(T t, U u);
```

### Parameters

| Parameter | Description           |
| --------- | --------------------- |
| T         | First input argument  |
| U         | Second input argument |

### Return Type

```
void
```

It **does not return any value**, it only performs an operation.

---

# Generic Form

```
BiConsumer<T, U>
```

Where:

| Type | Meaning           |
| ---- | ----------------- |
| T    | First input type  |
| U    | Second input type |

Example:

```
BiConsumer<Integer, Integer>
BiConsumer<String, String>
BiConsumer<String, Integer>
```

---

# Simple Example

### Print Two Numbers

```java
import java.util.function.BiConsumer;

public class Example1 {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> printSum =
                (a, b) -> System.out.println(a + b);

        printSum.accept(10, 20);
    }
}
```

Output

```
30
```

---

# Example 2

### Print Name and Age

```java
import java.util.function.BiConsumer;

public class Example2 {

    public static void main(String[] args) {

        BiConsumer<String, Integer> personInfo =
                (name, age) -> System.out.println(name + " is " + age + " years old");

        personInfo.accept("Rajesh", 23);
    }
}
```

Output

```
Rajesh is 23 years old
```

---

# Default Method in BiConsumer

Java provides **one default method**.

| Method    | Description                                          |
| --------- | ---------------------------------------------------- |
| andThen() | Performs another operation after the first operation |

---

# andThen() Method

The **andThen() method allows chaining two BiConsumer operations**.

### Syntax

```java
biConsumer1.andThen(biConsumer2);
```

---

# Example of andThen()

```java
import java.util.function.BiConsumer;

public class AndThenExample {

    public static void main(String[] args) {

        BiConsumer<String, Integer> display =
                (name, age) -> System.out.println("Name: " + name + ", Age: " + age);

        BiConsumer<String, Integer> greeting =
                (name, age) -> System.out.println("Hello " + name);

        BiConsumer<String, Integer> result =
                display.andThen(greeting);

        result.accept("Rajesh", 23);
    }
}
```

Output

```
Name: Rajesh, Age: 23
Hello Rajesh
```

---

# Real-world Example

### Update Employee Salary

```java
import java.util.function.BiConsumer;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeExample {

    public static void main(String[] args) {

        BiConsumer<Employee, Double> increaseSalary =
                (emp, amount) -> emp.salary += amount;

        Employee e = new Employee("Rajesh", 30000);

        increaseSalary.accept(e, 5000);

        System.out.println(e.name + " New Salary: " + e.salary);
    }
}
```

Output

```
Rajesh New Salary: 35000
```

---

# Difference Between Consumer and BiConsumer

| Feature | Consumer    | BiConsumer       |
| ------- | ----------- | ---------------- |
| Inputs  | 1 argument  | 2 arguments      |
| Method  | accept(T t) | accept(T t, U u) |
| Return  | void        | void             |

---

# When to Use BiConsumer

Use **BiConsumer** when:

* You want to **process two values**
* You **do not need a return value**
* You want **clean functional programming code**

Common use cases:

* Printing two values
* Updating object fields
* Processing key-value pairs
* Working with collections like `Map`

Example with Map:

```java
map.forEach((key, value) -> System.out.println(key + " : " + value));
```

---

# Summary

* **BiConsumer** is a functional interface in **Java 8**.
* It **accepts two arguments** and **does not return any value**.
* Abstract method:

```
accept(T t, U u)
```

* Default method:

```
andThen()
```

---

