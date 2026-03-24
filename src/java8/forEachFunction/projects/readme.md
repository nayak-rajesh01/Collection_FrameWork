Perfect—this is a **serious interview prep sheet** 🔥
Here are **50 Amazon-level Java 8 coding questions** (Streams + Lambda + forEach + Functional Interfaces).

---

# 🚀 FULL AMAZON JAVA 8 CODING SHEET (50 QUESTIONS)

---

# 🔹 EASY LEVEL (1–15)

### 1. Print all elements using `forEach`

### 2. Print even numbers from list

### 3. Print odd numbers

### 4. Find sum of all elements

### 5. Find average of list

### 6. Count total elements using stream

### 7. Convert list of strings to uppercase

### 8. Convert list of strings to lowercase

### 9. Filter elements greater than 50

### 10. Find first element in list

### 11. Check if list is empty using Optional

### 12. Find max element

### 13. Find min element

### 14. Remove duplicates (`distinct`)

### 15. Sort list in ascending order

---

# 🔹 MEDIUM LEVEL (16–35)

### 16. Sort list in descending order

### 17. Find second largest element

### 18. Find second smallest element

### 19. Check if any number is even

### 20. Check if all numbers are positive

### 21. Check if none are negative

### 22. Count numbers starting with digit '1'

### 23. Find square of each number

### 24. Find cube of each number

### 25. Filter numbers divisible by 3 and 5

### 26. Convert list to Set

### 27. Convert list to Map (key=value)

### 28. Join list of strings into single string

### 29. Find length of each string

### 30. Find strings with length > 5

### 31. Group numbers by even/odd

### 32. Partition numbers using Predicate

### 33. Find duplicate elements

### 34. Count frequency of elements

### 35. Remove null values from list

---

# 🔹 HARD LEVEL (36–50)

### 36. Find longest string in list

### 37. Find shortest string

### 38. Flatten list of lists

### 39. Merge two lists and remove duplicates

### 40. Find top 3 maximum numbers

### 41. Find kth largest element

### 42. Reverse a list using streams

### 43. Find common elements between two lists

### 44. Find non-repeated elements

### 45. Find first non-repeating character in string

### 46. Sort map by value

### 47. Convert list of objects to map

### 48. Group strings by length

### 49. Find anagram groups

### 50. Find sum of squares of even numbers

---

# 💻 MUST-KNOW SOLUTIONS (IMPORTANT FOR AMAZON)

---

## ✅ 1. Second Largest Element

```java
int secondLargest = list.stream()
    .distinct()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .findFirst()
    .get();
```

---

## ✅ 2. Frequency Count

```java
Map<Integer, Long> freq = list.stream()
    .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
```

---

## ✅ 3. Find Duplicates

```java
Set<Integer> set = new HashSet<>();

List<Integer> duplicates = list.stream()
    .filter(n -> !set.add(n))
    .toList();
```

---

## ✅ 4. Flatten List

```java
List<Integer> flatList = listOfLists.stream()
    .flatMap(List::stream)
    .toList();
```

---

## ✅ 5. Group By Even/Odd

```java
Map<String, List<Integer>> result = list.stream()
    .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
```

---

## ✅ 6. First Non-Repeating Character

```java
Character ch = str.chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
    .entrySet().stream()
    .filter(e -> e.getValue() == 1)
    .map(Map.Entry::getKey)
    .findFirst()
    .get();
```

---

## ✅ 7. Anagram Groups

```java
Map<String, List<String>> map = list.stream()
    .collect(Collectors.groupingBy(
        s -> s.chars()
              .sorted()
              .mapToObj(c -> String.valueOf((char)c))
              .collect(Collectors.joining())
    ));
```

---

## ✅ 8. Top 3 Maximum Numbers

```java
List<Integer> top3 = list.stream()
    .sorted(Comparator.reverseOrder())
    .limit(3)
    .toList();
```

---

## ✅ 9. Sort Map by Value

```java
map.entrySet().stream()
    .sorted(Map.Entry.comparingByValue())
    .forEach(System.out::println);
```

---

## ✅ 10. Sum of Squares of Even Numbers

```java
int sum = list.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * n)
    .reduce(0, Integer::sum);
```

---

# 🎯 AMAZON INTERVIEW TIPS

### 💡 What they expect:

* Clean Stream usage
* Avoid unnecessary loops
* Proper use of `Optional`
* Edge case handling

---

### ⚠️ Common Mistakes:

❌ Using `forEach` for everything
❌ Not using `distinct()`
❌ Ignoring null values
❌ Using `.get()` without checking Optional

---

# 🔥 FINAL STRATEGY

👉 In interview:

1. Start with **problem understanding**
2. Say: *“I’ll solve using Java 8 Streams”*
3. Write clean pipeline:

```java
stream → filter → map → collect
```

---

