
---

# 🚀 Java Stream API Notes

## 📌 What is Stream API?

The **Stream API (Java 8)** is used to process collections of data in a **functional and declarative way**.

👉 It allows operations like:

* Filtering
* Mapping
* Sorting
* Reducing

without modifying the original data.

---

## 🔑 Key Features

* Functional programming style
* Lazy evaluation
* Parallel processing support
* Improves readability & reduces boilerplate code

---

## 🧠 Stream vs Collection

| Feature      | Collection  | Stream              |
| ------------ | ----------- | ------------------- |
| Storage      | Stores data | Does not store data |
| Modification | Can modify  | Cannot modify       |
| Traversal    | External    | Internal            |
| Reusability  | Reusable    | Cannot be reused    |

---

## ⚙️ How to Create Stream

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

// Method 1
Stream<Integer> stream = list.stream();

// Method 2
Stream<Integer> parallelStream = list.parallelStream();
```

---

## 🔥 Types of Operations

### 1. Intermediate Operations (Lazy)

* Returns a new stream
* Does not execute until terminal operation is called

Examples:

```java
filter()
map()
sorted()
distinct()
limit()
skip()
```

---

### 2. Terminal Operations (Eager)

* Produces result
* Ends the stream

Examples:

```java
forEach()
collect()
count()
findFirst()
reduce()
```

---

## 🧪 Common Stream Methods

### 🔹 filter()

```java
list.stream()
    .filter(n -> n > 3)
    .forEach(System.out::println);
```

---

### 🔹 map()

```java
list.stream()
    .map(n -> n * 2)
    .forEach(System.out::println);
```

---

### 🔹 sorted()

```java
list.stream()
    .sorted()
    .forEach(System.out::println);
```

---

### 🔹 distinct()

```java
list.stream()
    .distinct()
    .forEach(System.out::println);
```

---

### 🔹 limit()

```java
list.stream()
    .limit(3)
    .forEach(System.out::println);
```

---

### 🔹 skip()

```java
list.stream()
    .skip(2)
    .forEach(System.out::println);
```

---

## 📦 Collecting Data

```java
List<Integer> result = list.stream()
        .filter(n -> n > 2)
        .collect(Collectors.toList());
```

---

## ➕ reduce()

Used to combine elements into a single result

```java
int sum = list.stream()
        .reduce(0, (a, b) -> a + b);
```

---

## 🔍 findFirst()

```java
Optional<Integer> first = list.stream()
        .findFirst();
```

---

## 🔝 max() & min()

```java
Optional<Integer> max = list.stream()
        .max(Integer::compare);
```

---

## ⚡ Parallel Stream

```java
list.parallelStream()
    .forEach(System.out::println);
```

✔ Faster for large datasets
❗ Be careful with shared resources

---

## ⚠️ Important Points

* Streams are **not reusable**
* Operations are **lazy**
* Does not change original data
* Use **collect()** to store result

---

## 💡 Real-World Example

```java
List<String> names = Arrays.asList("Raj", "Amit", "Ankit", "Raj");

List<String> result = names.stream()
        .filter(name -> name.startsWith("A"))
        .distinct()
        .sorted()
        .collect(Collectors.toList());

System.out.println(result);
```

---

## 🎯 Interview Questions

### 1. What is Stream API?

Stream API is used to process data in functional style.

### 2. Difference between map() and filter()?

* `filter()` → selects elements
* `map()` → transforms elements

### 3. What is lazy evaluation?

Execution happens only when terminal operation is called.

### 4. Can stream be reused?

❌ No

### 5. Difference between forEach() and collect()?

* `forEach()` → prints/consumes
* `collect()` → stores result

---

## 🧠 Summary

* Stream API simplifies data processing
* Supports functional programming
* Improves performance with parallel streams
* Widely used in modern Java applications

---

---

Here’s a **🔥 Amazon / TCS level Stream API + Java 8 Coding Sheet** for your **README.md** 👇

---

# 💼 Java Stream API – Interview Coding Problems (Amazon / TCS)

## 🟢 Basic Level

### 1. Find Even Numbers

```java
List<Integer> list = Arrays.asList(1,2,3,4,5,6);

list.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);
```

---

### 2. Convert List to Uppercase

```java
list.stream()
    .map(String::toUpperCase)
    .forEach(System.out::println);
```

---

### 3. Count Elements

```java
long count = list.stream().count();
```

---

### 4. Find First Element

```java
Optional<Integer> first = list.stream().findFirst();
```

---

### 5. Check List is Empty using Optional

```java
Optional<List<Integer>> opt = Optional.ofNullable(list);
System.out.println(opt.isPresent());
```

---

## 🟡 Medium Level

### 6. Remove Duplicates

```java
list.stream()
    .distinct()
    .forEach(System.out::println);
```

---

### 7. Sort List

```java
list.stream()
    .sorted()
    .forEach(System.out::println);
```

---

### 8. Find Max Element

```java
Optional<Integer> max = list.stream()
    .max(Integer::compareTo);
```

---

### 9. Sum of Elements

```java
int sum = list.stream()
    .reduce(0, Integer::sum);
```

---

### 10. Find Numbers Greater than 50

```java
list.stream()
    .filter(n -> n > 50)
    .forEach(System.out::println);
```

---

### 11. Convert List<Integer> to List<String>

```java
list.stream()
    .map(String::valueOf)
    .collect(Collectors.toList());
```

---

### 12. Group by Length of String

```java
Map<Integer, List<String>> map = list.stream()
    .collect(Collectors.groupingBy(String::length));
```

---

### 13. Count Frequency of Elements

```java
Map<Integer, Long> freq = list.stream()
    .collect(Collectors.groupingBy(
        n -> n, Collectors.counting()
    ));
```

---

## 🔴 Advanced Level (Amazon Level)

### 14. Find Second Highest Number

```java
int secondMax = list.stream()
    .distinct()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .findFirst()
    .get();
```

---

### 15. Find Duplicate Elements

```java
Set<Integer> set = new HashSet<>();

list.stream()
    .filter(n -> !set.add(n))
    .forEach(System.out::println);
```

---

### 16. Find First Non-Repeating Character

```java
String str = "aabbcde";

Character ch = str.chars()
    .mapToObj(c -> (char)c)
    .collect(Collectors.groupingBy(
        c -> c, LinkedHashMap::new, Collectors.counting()
    ))
    .entrySet()
    .stream()
    .filter(e -> e.getValue() == 1)
    .map(Map.Entry::getKey)
    .findFirst()
    .get();
```

---

### 17. Find Longest String

```java
String longest = list.stream()
    .max(Comparator.comparingInt(String::length))
    .get();
```

---

### 18. Flatten List of Lists

```java
listOfLists.stream()
    .flatMap(List::stream)
    .forEach(System.out::println);
```

---

### 19. Partition Even & Odd

```java
Map<Boolean, List<Integer>> result =
    list.stream()
        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
```

---

### 20. Find Top 3 Highest Numbers

```java
list.stream()
    .sorted(Comparator.reverseOrder())
    .limit(3)
    .forEach(System.out::println);
```

---

## 🧠 Tricky Interview Questions

### ❓ map() vs flatMap()

* `map()` → One-to-one transformation
* `flatMap()` → One-to-many flattening

---

### ❓ Difference between forEach() & peek()

* `forEach()` → Terminal
* `peek()` → Intermediate (used for debugging)

---

### ❓ Why use Streams?

* Cleaner code
* Less boilerplate
* Easy parallelism

---

### ❓ Can we reuse stream?

❌ No – once consumed, cannot be reused

---

## 🎯 Pro Tips (Important for Interviews)

* Prefer **method references** (`Integer::sum`)
* Use **Optional safely** (avoid `.get()` blindly)
* Know **Collectors**:

    * `groupingBy()`
    * `partitioningBy()`
    * `joining()`

---

## 🚀 Challenge Problems (Try Yourself)

1. Find kth largest element
2. Reverse each word using stream
3. Find common elements between two lists
4. Convert list to comma-separated string
5. Find palindrome strings in list

---

---


# 🎯 Real Interview Scenarios (Amazon Style)

### 🧠 Scenario 1: Log Processing

👉 Given logs, find most frequent error
✔️ Use `groupingBy + counting`

---

### 🧠 Scenario 2: E-commerce

👉 Find top 3 highest priced products
✔️ Use `sorted + limit`

---

### 🧠 Scenario 3: User Analytics

👉 Count active users per city
✔️ Use `groupingBy`

---

### 🧠 Scenario 4: Fraud Detection

👉 Detect duplicate transactions
✔️ Use `Set + filter`

---

### 🧠 Scenario 5: Chat App

👉 Find first non-repeating message
✔️ Use `LinkedHashMap`

---

# 📝 Mock Test (SHL Pattern)

## ⏱ Time: 20 mins

### Q1. Output?

```java
List<Integer> list = Arrays.asList(1,2,3,4);
list.stream().filter(n -> n>2).map(n -> n*2).forEach(System.out::print);
```

👉 Answer: `68`

---

### Q2. Which is terminal?

A. map
B. filter
C. collect
D. peek

👉 Answer: **C**

---

### Q3. Stream reusable?

👉 ❌ No

---

### Q4. What does distinct() do?

👉 Removes duplicates

---

### Q5. Output?

```java
Stream.of("a","b","c")
.map(String::toUpperCase)
.findFirst();
```

👉 `Optional[A]`

---

### Q6. Which is intermediate?

A. forEach
B. map
C. collect

👉 Answer: **B**

---

### Q7. What is reduce()?

👉 Combines elements into single value

---

### Q8. Output?

```java
List<Integer> l = Arrays.asList(1,2,3);
int sum = l.stream().reduce(0, Integer::sum);
System.out.println(sum);
```

👉 `6`

---

# 🚀 Final Tips (Amazon Crack Strategy)

* Practice **map, filter, reduce DAILY**
* Master:

    * `groupingBy()`
    * `flatMap()`
    * `Optional`
* Avoid `.get()` without checking
* Write **clean + optimized code**

---

