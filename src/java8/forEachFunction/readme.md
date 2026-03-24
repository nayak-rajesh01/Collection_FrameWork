

---

# 🔁 forEach() in Java 8

## 📌 Introduction

`forEach()` is a **default method** introduced in Java 8 in the **Iterable interface**.
It is used to **iterate over collections** like List, Set, Map in a simple and functional way.

It uses **Lambda Expressions** and **Functional Interfaces**.

---

## 📦 Method Syntax

```java
void forEach(Consumer<? super T> action)
```

* Takes a **Consumer Functional Interface**
* Performs the given action on each element

---

## 🧠 Functional Interface Used

### Consumer<T>

```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```

* Takes input → returns nothing
* Used for printing, modifying, etc.

---

## ✅ Example 1: Basic forEach with Lambda

```java
import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        list.forEach(n -> System.out.println(n));
    }
}
```

---

## ✅ Example 2: Using Method Reference

```java
list.forEach(System.out::println);
```

✔ Cleaner and shorter than lambda

---

## ✅ Example 3: forEach with Custom Logic

```java
list.forEach(n -> {
    if (n % 2 == 0) {
        System.out.println(n + " is even");
    }
});
```

---

## ✅ Example 4: forEach with Map

```java
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");

        map.forEach((key, value) -> 
            System.out.println(key + " : " + value)
        );
    }
}
```

---

## 🔄 Difference: forEach vs Traditional Loop

| Feature      | forEach()      | for loop   |
| ------------ | -------------- | ---------- |
| Style        | Functional     | Imperative |
| Code Length  | Short          | Longer     |
| Readability  | High           | Medium     |
| Parallel Use | Easy (Streams) | Difficult  |

---

## ⚠️ Important Points

* Cannot use `break` or `continue`
* Cannot modify collection structure inside loop (may throw exception)
* Best for **read-only operations**

---

## 🚀 forEach with Streams

```java
list.stream()
    .filter(n -> n > 20)
    .forEach(System.out::println);
```

---

## 🎯 Real Use Cases

* Printing data
* Logging
* Applying operations to each element
* Processing collections in pipelines

---

## ❓ Interview Questions

### 1. What is forEach() in Java 8?

👉 A default method in Iterable used to iterate collections using lambda expressions.

---

### 2. Which functional interface is used?

👉 `Consumer<T>`

---

### 3. Can we break from forEach loop?

👉 ❌ No

---

### 4. Difference between forEach() and stream().forEach()?

👉

* `collection.forEach()` → simple iteration
* `stream().forEach()` → supports filtering, mapping, etc.

---

### 5. What is method reference in forEach?

👉 Short form of lambda
Example:

```java
System.out::println
```

---

## 🧾 Summary

* `forEach()` simplifies iteration
* Uses **lambda + Consumer**
* Makes code **clean and readable**
* Widely used in **Streams API**

---


-----

====================================================================================
Great—this is exactly how you level up 🔥
Here’s a **complete practice pack on `forEach()` (Java 8)**: tricky questions + MCQs + real interview problems.

---

# 🔥 1. Tricky Coding Questions (forEach)

## 🧩 Q1: Output Prediction

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4);

list.forEach(n -> {
    n = n * 2;
});

list.forEach(System.out::println);
```

👉 **Output?**
❌ Many think: `2 4 6 8`
✅ **Actual:** `1 2 3 4`

✔ Reason: `n` is a copy, original list is unchanged.

---

## 🧩 Q2: Modify List Inside forEach

```java
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

list.forEach(n -> {
    if (n == 2) {
        list.add(4);
    }
});
```

👉 **What happens?**
❌ Compile error? ❌ No
❌ Infinite loop? ❌ No
✅ **Throws:** `ConcurrentModificationException`

---

## 🧩 Q3: Break Statement

```java
list.forEach(n -> {
    if (n == 3) break;
    System.out.println(n);
});
```

👉 **Result?**
❌ Compilation Error

✔ Reason: `break` not allowed in lambda.

---

## 🧩 Q4: Return in forEach

```java
list.forEach(n -> {
    if (n == 3) return;
    System.out.println(n);
});
```

👉 **Output?**

```
1
2
4
```

✔ `return` → skips current iteration (like continue)

---

## 🧩 Q5: Stream vs forEach

```java
list.stream()
    .filter(n -> n > 2)
    .forEach(System.out::println);
```

👉 Output?

```
3
4
```

---

## 🧩 Q6: Order Issue

```java
list.parallelStream().forEach(System.out::println);
```

👉 Output?
❌ Not guaranteed order

✔ Use:

```java
forEachOrdered()
```

---

# 🧠 2. MCQs (SHL Pattern)

## ✅ Q1

Which interface is used in `forEach()`?

A. Predicate
B. Function
C. Consumer
D. Supplier

👉 **Answer: C (Consumer)**

---

## ✅ Q2

What is the return type of `forEach()`?

A. int
B. void
C. boolean
D. List

👉 **Answer: B (void)**

---

## ✅ Q3

Which is valid syntax?

A. `list.forEach(n -> n * 2);`
B. `list.forEach(System.out.println);`
C. `list.forEach(System.out::println);`
D. `list.forEach(() -> {});`

👉 **Answer: C**

---

## ✅ Q4

Can we use `break` in forEach?

A. Yes
B. No

👉 **Answer: B**

---

## ✅ Q5

What happens if you modify a collection inside forEach?

A. Works fine
B. Compile error
C. Runtime exception
D. Ignored

👉 **Answer: C (ConcurrentModificationException)**

---

## ✅ Q6

Which method guarantees order in parallel stream?

A. forEach()
B. ordered()
C. forEachOrdered()
D. streamOrdered()

👉 **Answer: C**

---

## ✅ Q7

What will this print?

```java
List<String> list = Arrays.asList("A", "B");
list.forEach(System.out::print);
```

👉 Output:

```
AB
```

---

# 💼 3. Real Interview Coding Problems

## 🚀 Problem 1: Print Even Numbers

```java
List<Integer> list = Arrays.asList(1,2,3,4,5,6);

list.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);
```

---

## 🚀 Problem 2: Sum Using forEach

```java
List<Integer> list = Arrays.asList(1,2,3,4);

AtomicInteger sum = new AtomicInteger(0);

list.forEach(n -> sum.addAndGet(n));

System.out.println(sum);
```

---

## 🚀 Problem 3: Count Strings Starting with 'A'

```java
List<String> list = Arrays.asList("Apple", "Banana", "Avocado");

long count = list.stream()
    .filter(s -> s.startsWith("A"))
    .count();

System.out.println(count);
```

---

## 🚀 Problem 4: Convert List to Uppercase

```java
List<String> list = Arrays.asList("java", "python");

list.replaceAll(String::toUpperCase);

list.forEach(System.out::println);
```

---

## 🚀 Problem 5: Print Map Data

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "Java");
map.put(2, "Python");

map.forEach((k,v) -> System.out.println(k + " -> " + v));
```

---

## 🚀 Problem 6: Find Max Using forEach

```java
List<Integer> list = Arrays.asList(10, 50, 30);

AtomicInteger max = new AtomicInteger(Integer.MIN_VALUE);

list.forEach(n -> {
    if (n > max.get()) {
        max.set(n);
    }
});

System.out.println(max);
```

---

# ⚡ Bonus: Interview Trap Question

👉 **Which is better?**

```java
list.forEach(...)
```

vs

```java
list.stream().forEach(...)
```

✅ Answer:

* `list.forEach()` → faster, simple iteration
* `stream().forEach()` → powerful (filter, map, etc.)

---

# 🎯 Final Tip

👉 In interviews:

* Use `forEach()` for **simple iteration**
* Use **Streams + forEach** for **data processing**

---


# 20 coding questions (Amazon / TCS / Infosys level)
Perfect—this is the level that actually gets you hired 🔥
Here are **20 real interview-level coding questions (Amazon / TCS / Infosys)** focused on **Java 8 + forEach + Streams**.

---

# 🚀 20 Coding Questions (Java 8 + forEach)

---

## 🔹 EASY (1–7)

### 1. Print all elements using forEach

👉 Input: `[1,2,3,4]`
👉 Output: `1 2 3 4`

---

### 2. Print even numbers

👉 Input: `[1,2,3,4,5,6]`
👉 Output: `2 4 6`

---

### 3. Count elements in list

👉 Without using `size()` (use stream)

---

### 4. Convert all strings to uppercase

👉 Input: `["java","python"]`
👉 Output: `["JAVA","PYTHON"]`

---

### 5. Find sum of elements

👉 Input: `[1,2,3,4]`
👉 Output: `10`

---

### 6. Print elements greater than 10

👉 Input: `[5,12,7,20]`
👉 Output: `12 20`

---

### 7. Remove duplicates

👉 Input: `[1,2,2,3,3,4]`
👉 Output: `[1,2,3,4]`

---

# 🔹 MEDIUM (8–15)

### 8. Find maximum element

👉 Input: `[10,50,30]`
👉 Output: `50`

---

### 9. Find minimum element

👉 Input: `[10,50,30]`
👉 Output: `10`

---

### 10. Sort list using streams

👉 Ascending & Descending

---

### 11. Find second largest number

👉 Input: `[10,20,30,40]`
👉 Output: `30`

---

### 12. Count strings starting with "A"

👉 Input: `["Apple","Banana","Avocado"]`
👉 Output: `2`

---

### 13. Find first element

👉 Using stream

---

### 14. Check if any number is even

👉 Output: true/false

---

### 15. Group numbers by even/odd

👉 Output: `{even:[2,4], odd:[1,3]}`

---

# 🔹 HARD (16–20)

### 16. Frequency of each element

👉 Input: `[1,2,2,3,3,3]`
👉 Output: `{1=1, 2=2, 3=3}`

---

### 17. Find duplicate elements

👉 Input: `[1,2,2,3,3,4]`
👉 Output: `[2,3]`

---

### 18. Flatten list of lists

```java
[[1,2],[3,4],[5]]
```

👉 Output: `[1,2,3,4,5]`

---

### 19. Find longest string

👉 Input: `["Java","SpringBoot","API"]`
👉 Output: `"SpringBoot"`

---

### 20. Partition numbers using predicate

👉 Output: `{true:[even], false:[odd]}`

---

# 💻 BONUS: FULL SOLUTION CODE (Top 5 Important)

---

## ✅ 1. Sum of Elements

```java
int sum = list.stream()
              .mapToInt(Integer::intValue)
              .sum();
```

---

## ✅ 2. Remove Duplicates

```java
List<Integer> unique = list.stream()
                           .distinct()
                           .toList();
```

---

## ✅ 3. Second Largest Number

```java
int secondLargest = list.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .get();
```

---

## ✅ 4. Frequency Count

```java
Map<Integer, Long> freq = list.stream()
    .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
```

---

## ✅ 5. Find Duplicates

```java
Set<Integer> seen = new HashSet<>();

List<Integer> duplicates = list.stream()
    .filter(n -> !seen.add(n))
    .toList();
```

---

# 🎯 Interview Strategy

👉 If interviewer says:

* **“Use Java 8”** → use Streams
* **“Optimize”** → use `mapToInt()`, `distinct()`
* **“Readable code”** → method references

---

# ⚡ Pro Tips (VERY IMPORTANT)

✔ Prefer:

```java
stream().filter().map().forEach()
```

❌ Avoid:

```java
forEach + complex logic
```

✔ Use `forEach` only for:

* Printing
* Logging
* Final operation

---




