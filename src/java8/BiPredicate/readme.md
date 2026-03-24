

---

# Java 8 BiPredicate Functional Interface

## What is BiPredicate?

A **BiPredicate** is a functional interface introduced in **Java 8** that **takes two input arguments and returns a boolean value**.

It is mainly used to **test a condition on two parameters**.

It belongs to the package:

```java
java.util.function.BiPredicate;
```

Import statement:

```java
import java.util.function.BiPredicate;
```

---

# Functional Method

The **BiPredicate interface contains one abstract method**:

```java
boolean test(T t, U u);
```

### Parameters

| Parameter | Description           |
| --------- | --------------------- |
| T         | First input argument  |
| U         | Second input argument |

### Return Type

```
boolean
```

Returns **true or false** depending on the condition.

---

# Generic Form

```
BiPredicate<T, U>
```

Example:

```
BiPredicate<Integer, Integer>
BiPredicate<String, Integer>
BiPredicate<String, String>
```

---

# Simple Example

### Check if Sum of Two Numbers is Greater Than 50

```java
import java.util.function.BiPredicate;

public class Example1 {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> checkSum =
                (a, b) -> (a + b) > 50;

        System.out.println(checkSum.test(20, 40)); // true
        System.out.println(checkSum.test(10, 20)); // false
    }
}
```

---

# Example 2

### Check Username and Password

```java
import java.util.function.BiPredicate;

public class Example2 {

    public static void main(String[] args) {

        BiPredicate<String, String> loginCheck =
                (username, password) ->
                        username.equals("admin") &&
                        password.equals("1234");

        System.out.println(loginCheck.test("admin", "1234"));
    }
}
```

Output

```
true
```

---

# Default Methods in BiPredicate

Java provides **three useful default methods**.

| Method   | Description           |
| -------- | --------------------- |
| and()    | Logical AND operation |
| or()     | Logical OR operation  |
| negate() | Reverse the result    |

---

# 1. and() Method

Used to **combine two conditions using AND**.

```java
import java.util.function.BiPredicate;

public class AndExample {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> condition1 =
                (a, b) -> a > 10;

        BiPredicate<Integer, Integer> condition2 =
                (a, b) -> b > 10;

        BiPredicate<Integer, Integer> result =
                condition1.and(condition2);

        System.out.println(result.test(20, 30)); // true
        System.out.println(result.test(5, 30));  // false
    }
}
```

---

# 2. or() Method

Used to **combine conditions using OR**.

```java
import java.util.function.BiPredicate;

public class OrExample {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> condition1 =
                (a, b) -> a > 50;

        BiPredicate<Integer, Integer> condition2 =
                (a, b) -> b > 50;

        BiPredicate<Integer, Integer> result =
                condition1.or(condition2);

        System.out.println(result.test(60, 20)); // true
        System.out.println(result.test(10, 20)); // false
    }
}
```

---

# 3. negate() Method

Used to **reverse the result**.

```java
import java.util.function.BiPredicate;

public class NegateExample {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> condition =
                (a, b) -> a + b > 50;

        BiPredicate<Integer, Integer> result =
                condition.negate();

        System.out.println(result.test(30, 30)); // false
    }
}
```

---

# Real-world Example

### Validate Age and Salary

```java
import java.util.function.BiPredicate;

public class EmployeeValidation {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> employeeCheck =
                (age, salary) -> age > 21 && salary > 20000;

        System.out.println(employeeCheck.test(25, 30000));
    }
}
```

---

# Difference Between Predicate and BiPredicate

| Feature | Predicate  | BiPredicate    |
| ------- | ---------- | -------------- |
| Inputs  | 1 argument | 2 arguments    |
| Method  | test(T t)  | test(T t, U u) |
| Return  | boolean    | boolean        |

---

# When to Use BiPredicate

Use **BiPredicate** when:

* You need to **test a condition on two values**
* You want **clean functional programming**
* You want to **avoid writing separate methods**

Example use cases:

* Login validation
* Comparing two values
* Checking conditions on two objects
* Filtering data

---

# Summary

* **BiPredicate** is a functional interface in Java 8.
* It **accepts two parameters** and **returns boolean**.
* Abstract method: `test(T t, U u)`
* Default methods:

    * `and()`
    * `or()`
    * `negate()`

---

