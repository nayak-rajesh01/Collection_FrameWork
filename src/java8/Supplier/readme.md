# ☕ Java 8 Supplier Functional Interface

The **Supplier Interface** is a functional interface introduced in **Java 8** that represents a **function which supplies a value but takes no input**.

It is mainly used when we want to **generate or provide data without receiving parameters**.

---

# 📦 Package

```java
java.util.function.Supplier;
```

---

# 📌 Generic Form

```java
Supplier<T>
```

Where:

- **T** → Return type
- **Input** → No input parameter

---

# ⚙️ Abstract Method

The main abstract method of the Supplier interface is:

```java
T get();
```

### Characteristics

- Takes **no arguments**
- Returns **a value of type T**

---

# 🧠 Basic Example

```java
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello Rajesh";

        System.out.println(supplier.get());

    }
}
```

### 📤 Output

```
Hello Rajesh
```

---

# 🎲 Supplier with Random Number

```java
import java.util.function.Supplier;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);

        System.out.println(randomNumber.get());

    }
}
```

### Example Output

```
57
```

Every time the program runs, it may generate a **different random number**.

---

# 📅 Supplier with Current Date

```java
import java.util.function.Supplier;
import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Supplier<LocalDate> today = () -> LocalDate.now();

        System.out.println(today.get());

    }
}
```

### Output

```
2026-03-18
```

---

# 👨‍🎓 Supplier with Object Creation

```java
import java.util.function.Supplier;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

}

public class Test {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> new Student("Rajesh");

        Student student = studentSupplier.get();

        System.out.println(student.name);

    }
}
```

### Output

```
Rajesh
```

---

# ⚡ Primitive Supplier Interfaces

Java provides specialized suppliers for primitive data types.

| Interface | Return Type |
|-----------|------------|
| IntSupplier | int |
| LongSupplier | long |
| DoubleSupplier | double |
| BooleanSupplier | boolean |

### Example

```java
import java.util.function.IntSupplier;

public class Test {

    public static void main(String[] args) {

        IntSupplier supplier = () -> 10;

        System.out.println(supplier.getAsInt());

    }
}
```

### Output

```
10
```

---

# 🔄 Functional Interfaces Comparison

| Interface | Input | Output | Method |
|----------|------|--------|--------|
| Predicate | 1 | boolean | `test()` |
| Function | 1 | result | `apply()` |
| Consumer | 1 | void | `accept()` |
| Supplier | 0 | result | `get()` |

### Simple Understanding

```
Predicate → Check condition
Function  → Transform data
Consumer  → Perform action
Supplier  → Generate data
```

---

# 💡 Real Interview Example

### Generate OTP using Supplier

```java
import java.util.function.Supplier;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        Supplier<Integer> otp = () -> 100000 + new Random().nextInt(900000);

        System.out.println("OTP: " + otp.get());

    }
}
```

### Example Output

```
OTP: 548273
```

---

# 📝 Summary

✔ Supplier is a **Functional Interface**  
✔ It **takes no input parameters**  
✔ It **returns a value**  
✔ The main method is **get()**  
✔ Commonly used for **generating or supplying data**

---

# 📚 Java 8 Functional Interfaces

Java 8 introduced several important functional interfaces:

- **Predicate** → Check condition
- **Function** → Transform data
- **Consumer** → Perform operation
- **Supplier** → Provide data

---

⭐ *Tip:* Supplier is commonly used in **lazy object creation, configuration loading, random value generation, and factory patterns.**
