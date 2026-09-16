# Java Interview Practice & Automation/SDET Coding Repository

This project is a Java-based interview preparation and automation practice repository organized under the `coding` package structure. It includes Java programs for common interview questions, data-structure/collection programs, OOP and exception practice, Java 8 streams, and Selenium-based automation examples.

The repository is intended for:
- Java interview preparation
- Automation/SDET practice
- Selenium + TestNG framework learning
- API / JSON / utility problem solving in Java

## Project Goal

The main objective is to cover the interview question list in a structured way while keeping the classes organized under meaningful package names like:

- `coding.basic_programs`
- `coding.number_programs`
- `coding.string_programs`
- `coding.array_programs`
- `coding.collection_programs`
- `coding.java8_programs`
- `coding.oop_programs`
- `coding.exception_handling`
- `coding.multithreading`
- `coding.automation_programs`
- `coding.api_programs`
- `coding.selenium_programs`
- `coding.framework`

## Repository Structure

```text
src/
├── coding/
│   ├── api_programs/
│   │   └── API-related Java examples and request utility classes
│   ├── array_programs/
│   │   └── Array-based coding questions and patterns
│   ├── automation_programs/
│   │   └── File handling, JSON, config, random data generation, etc.
│   ├── basic_programs/
│   │   └── Beginner Java programs like hello world, factorial, prime, etc.
│   ├── collection_programs/
│   │   └── ArrayList, HashMap, Set, List, Map logic, duplicates, sorting
│   ├── exception_handling/
│   │   └── try-catch, custom exceptions, throws/throw examples
│   ├── framework/
│   │   ├── BaseTest.java
│   │   ├── BrowserFactory.java
│   │   ├── ConfigReader.java
│   │   ├── DriverManager.java
│   │   └── RetryUtils.java
│   ├── java8_programs/
│   │   └── Stream API, lambda, sorting, filtering, map operations
│   ├── multithreading/
│   │   └── Thread, Runnable, Lambda, synchronization, counters
│   ├── number_programs/
│   │   └── Numbers, Armstrong, perfect, strong, GCD, LCM, binary conversion
│   ├── oop_programs/
│   │   └── Encapsulation, inheritance, abstraction, polymorphism, singleton
│   ├── selenium_programs/
│   │   └── Selenium test classes and reusable browser automation examples
│   ├── string_programs/
│   │   └── String reversal, palindrome, anagram, duplicates, frequency
│   └── ...
├── log4j2.xml
├── pom.xml
├── testng.xml
└── README.md
```

## Important Packages

### 1) basic_programs
This package covers beginner-level Java programs, such as:
- Print Hello World
- Add two numbers
- Even/odd check
- Positive/negative/zero check
- Factorial
- Fibonacci series
- Prime number
- Palindrome check
- Reverse number
- Largest/smallest number

### 2) number_programs
This package mostly contains number-based interview programs, such as:
- Armstrong numbers
- Perfect numbers
- Strong numbers
- GCD and LCM
- Sum of numbers
- Decimal to binary conversion
- Digit checks and operations

### 3) string_programs
This is one of the most important packages for interviews and automation roles. It includes:
- Reverse a string
- Palindrome string
- Character count
- Vowel/consonant count
- Duplicate characters
- Unique characters
- Anagram check
- Word reverse
- Longest/shortest word
- Remove spaces and special characters

### 4) array_programs
This covers array-based logic and patterns commonly asked in coding interviews:
- Largest/smallest element
- Second largest/smallest
- Sum and average
- Reverse and sorting
- Duplicate removal
- Missing number
- Union/intersection
- Zero movement
- Pair sum problem
- Maximum subarray sum
- Longest consecutive sequence

### 5) collection_programs
This package focuses on Java Collection Framework usage:
- ArrayList operations
- HashMap frequency logic
- Set/List conversions
- Duplicate detection
- Sorting collections
- Find max/min values in collections

### 6) java8_programs
This package is very useful for modern Java and SDET/automation interviews:
- Streams API
- Filter operations
- Map and reduce usage
- Duplicate removal using streams
- Sorting using lambda/streams
- Uppercase conversion
- Count, find max/min, second highest value

### 7) oop_programs
This contains object-oriented programming questions and examples:
- Encapsulation
- Inheritance
- Method overloading
- Method overriding
- Abstraction using abstract class
- Interface implementation
- Runtime polymorphism
- Immutable class
- Singleton design pattern

### 8) exception_handling
This focuses on exception handling patterns:
- try/catch
- multiple catch blocks
- nested try-catch
- finally
- custom exception
- invalid age / invalid login examples
- throw and throws

### 9) multithreading
This covers multithreading interview topics:
- Thread class
- Runnable interface
- Lambda thread creation
- Two-thread number printing
- Sleep and join
- Synchronization
- Thread-safe counter
- Race condition examples

### 10) automation_programs
This package contains practical automation-related utility tasks, such as:
- Excel reading
- CSV processing
- JSON parsing and validation
- Comparison of JSON responses
- Random email/phone generation
- Properties file reading
- Reusable config readers

### 11) api_programs
This package contains examples for API-related Java coding tasks:
- GET/POST/PUT/DELETE requests
- Query parameters
- Path parameters
- Headers
- JSON parsing
- Token extraction and reuse
- Response validation
- Reusable API utility classes

### 12) selenium_programs
This package contains tests and examples for browser automation using Selenium + TestNG:
- Browser launch
- Element interaction
- Navigation and waits
- Reusable methods
- Screenshot utilities
- Automation test structure

### 13) framework
This package contains reusable framework utilities used by Selenium tests:
- `BaseTest` – common setup/teardown logic
- `BrowserFactory` – browser creation logic
- `DriverManager` – central WebDriver management
- `ConfigReader` – reading config values
- `RetryUtils` – retry handling for flaky automation elements

## Tech Stack

The project uses:
- Java 17
- Maven
- TestNG
- Selenium
- WebDriverManager
- Log4j2
- Rest Assured
- Jackson
- JSON-simple
- Cucumber (included in dependencies)

## Prerequisites

Before running the project, ensure you have:
- JDK 17 installed
- Maven installed and available in PATH
- Chrome browser installed for the Selenium tests
- A working macOS/Windows/Linux environment with GUI browser support

## How to Run

### 1) Compile/build the project
```bash
mvn clean test
```

### 2) Run only Selenium tests
```bash
mvn -Dtest=BrowserLaunchTest,ElementInteractionTest,NavigationAndWaitTest,ReusableSeleniumMethodsTest test
```

### 3) Run the TestNG XML suite
```bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
```

### 4) Run a single Java class from IDE
Open any class in `src/coding/...` using IntelliJ or Eclipse and run it as a normal Java program. For Selenium-related classes, use the project’s TestNG structure where applicable.

## Logging

This project uses Log4j2 for cleaner console logging during Selenium execution. The logging configuration is defined in:

```text
src/log4j2.xml
```

This keeps important automation logs visible while reducing noisy framework-level messages.

## Notes

- The project is designed for interview preparation and practice, not only for production-ready application logic.
- Many classes are focused on specific coding-question patterns rather than enterprise architecture.
- Selenium tests are configured to run in normal browser mode, not headless mode, as requested.
- Browser processes may appear in the Dock on macOS because Chrome is a real GUI application.

## Recommended Study Order

If you are preparing for interviews, use this order:
1. Basic Java programs
2. Number programs
3. String programs
4. Array programs
5. Collection programs
6. Java 8 streams
7. OOP concepts
8. Exception handling
9. Multithreading
10. Selenium + automation utility logic
11. API testing exercises

## Summary

This repository combines:
- Core Java interview practice
- Collection and string problem solving
- OOP/exception/multithreading concepts
- Java 8 stream-based questions
- Selenium automation examples
- API/JSON utility tasks

It is a strong practice base for Java interview preparation and Automation/SDET role readiness.
