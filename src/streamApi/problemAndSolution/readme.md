Here’s your **🔥 COMPLETE Amazon-Level Java 8 + Stream API Prep Sheet (50+ Questions + Scenarios + Mock Test)** — perfect for **README.md / Interview Prep** 👇

---

# 💼 Amazon Java 8 Coding Sheet (50+ Questions)

## 🟢 Basic (1–15)

### 1. Find even numbers

```java
list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
```

### 2. Find odd numbers

```java
list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
```

### 3. Count elements

```java
long count = list.stream().count();
```

### 4. Convert to uppercase

```java
list.stream().map(String::toUpperCase).toList();
```

### 5. Sort ascending

```java
list.stream().sorted().toList();
```

### 6. Sort descending

```java
list.stream().sorted(Comparator.reverseOrder()).toList();
```

### 7. Remove duplicates

```java
list.stream().distinct().toList();
```

### 8. Find max

```java
list.stream().max(Integer::compareTo).get();
```

### 9. Find min

```java
list.stream().min(Integer::compareTo).get();
```

### 10. Sum of list

```java
list.stream().reduce(0, Integer::sum);
```

### 11. Average

```java
list.stream().mapToInt(Integer::intValue).average();
```

### 12. Find first element

```java
list.stream().findFirst();
```

### 13. Limit elements

```java
list.stream().limit(3).toList();
```

### 14. Skip elements

```java
list.stream().skip(2).toList();
```

### 15. Check if any match

```java
list.stream().anyMatch(n -> n > 10);
```

---

## 🟡 Medium (16–35)

### 16. All match condition

```java
list.stream().allMatch(n -> n > 0);
```

### 17. None match

```java
list.stream().noneMatch(n -> n < 0);
```

### 18. Find second highest

```java
list.stream().distinct()
    .sorted(Comparator.reverseOrder())
    .skip(1).findFirst().get();
```

### 19. Find duplicates

```java
Set<Integer> set = new HashSet<>();
list.stream().filter(n -> !set.add(n)).toList();
```

### 20. Frequency of elements

```java
list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
```

### 21. Group by string length

```java
list.stream().collect(Collectors.groupingBy(String::length));
```

### 22. Partition even/odd

```java
list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
```

### 23. Convert list to map

```java
list.stream().collect(Collectors.toMap(x -> x, x -> x*x));
```

### 24. Join strings

```java
list.stream().collect(Collectors.joining(", "));
```

### 25. Flatten list

```java
listOfLists.stream().flatMap(List::stream).toList();
```

### 26. Find top 3 numbers

```java
list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
```

### 27. Filter strings starting with A

```java
list.stream().filter(s -> s.startsWith("A")).toList();
```

### 28. Convert int → string

```java
list.stream().map(String::valueOf).toList();
```

### 29. Find longest string

```java
list.stream().max(Comparator.comparingInt(String::length)).get();
```

### 30. Find shortest string

```java
list.stream().min(Comparator.comparingInt(String::length)).get();
```

### 31. Reverse list

```java
Collections.reverse(list);
```

### 32. Find common elements

```java
list1.stream().filter(list2::contains).toList();
```

### 33. Remove null values

```java
list.stream().filter(Objects::nonNull).toList();
```

### 34. Count words

```java
Arrays.stream(str.split(" ")).count();
```

### 35. Find palindrome strings

```java
list.stream()
    .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
    .toList();
```

---

## 🔴 Advanced (36–55)

### 36. First non-repeating char

```java
str.chars()
.mapToObj(c -> (char)c)
.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
.entrySet().stream()
.filter(e -> e.getValue() == 1)
.map(Map.Entry::getKey)
.findFirst().get();
```

---

### 37. Most frequent element

```java
list.stream()
.collect(Collectors.groupingBy(n -> n, Collectors.counting()))
.entrySet().stream()
.max(Map.Entry.comparingByValue())
.get().getKey();
```

---

### 38. Sort map by value

```java
map.entrySet().stream()
.sorted(Map.Entry.comparingByValue())
.toList();
```

---

### 39. Check anagram

```java
char[] a = str1.toCharArray();
char[] b = str2.toCharArray();
Arrays.sort(a); Arrays.sort(b);
Arrays.equals(a, b);
```

---

### 40. Merge two lists

```java
Stream.concat(list1.stream(), list2.stream()).toList();
```

---

### 41. Find kth largest

```java
list.stream().sorted(Comparator.reverseOrder()).skip(k-1).findFirst();
```

---

### 42. Sum of squares

```java
list.stream().map(n -> n*n).reduce(0, Integer::sum);
```

---

### 43. Remove duplicates from string

```java
str.chars().distinct().forEach(c -> System.out.print((char)c));
```

---

### 44. Convert list to set

```java
new HashSet<>(list);
```

---

### 45. Find all substrings (important logic)

👉 Use nested loops (not pure stream)

---

### 46. Check prime numbers

```java
list.stream().filter(n ->
    IntStream.rangeClosed(2, n/2).allMatch(i -> n % i != 0)
).toList();
```

---

### 47. Sum of even numbers

```java
list.stream().filter(n -> n%2==0).reduce(0,Integer::sum);
```

---

### 48. Find duplicate chars in string

```java
str.chars().mapToObj(c -> (char)c)
.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
.entrySet().stream()
.filter(e -> e.getValue() > 1)
.toList();
```

---

### 49. Reverse each word

```java
Arrays.stream(str.split(" "))
.map(w -> new StringBuilder(w).reverse().toString())
.toList();
```

---

### 50. Find max occurring word

```java
Arrays.stream(str.split(" "))
.collect(Collectors.groupingBy(w -> w, Collectors.counting()))
.entrySet().stream()
.max(Map.Entry.comparingByValue());
```

---
