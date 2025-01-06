# Kiểm thử đơn vị với Java
## Unit Testing with JUnit in Java

## Overview
This project demonstrates the usage of **JUnit 5** for unit testing in a simple Java application. It includes a `Calculator` class with basic arithmetic operations and corresponding unit tests written in JUnit.

---

## Code Description

### 1. **Calculator.java**
This class contains basic arithmetic methods: `add`, `subtract`, `multiply`, and `divide`.

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
```

### 2. **CalculatorTest.java**
Unit tests for the `Calculator` class.

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-4, calculator.subtract(-2, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }
}

````

## Running Tests

### 1. **Run with Maven**
Ensure you have Maven installed and configured. Use the following command to run the tests:
```bash
mvn test
```

### 2. **Run in IDE**
You can run the tests directly in an IDE like IntelliJ IDEA or Eclipse by right-clicking on the test file and selecting **Run as JUnit Test**.

---


### Sample Output
Below is the output from running the tests using Maven:
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running CalculatorTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.012 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
```

## Test Coverage Screenshot
![image](https://github.com/user-attachments/assets/5be8893b-2a7e-4fda-ae63-7289399b88d6)
---

## Dependencies

- **JUnit 5**: For unit testing.
  ```xml
  <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.10.0</version>
      <scope>test</scope>
  </dependency>
  ```

## Liên kết chia sẻ ChatGPT
##### https://chatgpt.com/share/677b4a57-46dc-8003-bbfb-4ad3491ae60c
---

## Author
[Xuân Trường]
