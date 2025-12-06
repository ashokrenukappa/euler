# Project Euler Solutions

A collection of Java solutions for [Project Euler](https://projecteuler.net/) mathematical and computational problems.

## Overview

Project Euler is a series of challenging mathematical/computer programming problems that require more than just mathematical insights to solve. This repository contains well-documented, efficient Java implementations for problems 1-13.

## Problems Solved

| # | Problem | Solution | Answer |
|---|---------|----------|--------|
| 1 | [Multiples of 3 or 5](https://projecteuler.net/problem=1) | `SumOfMultiplesOf3N5` | 233168 |
| 2 | [Even Fibonacci Numbers](https://projecteuler.net/problem=2) | `SumOfEvenFibonacciNumbers` | 4613732 |
| 3 | [Largest Prime Factor](https://projecteuler.net/problem=3) | `LargestPrimeFactor` | 6857 |
| 4 | [Largest Palindrome Product](https://projecteuler.net/problem=4) | `LargestPalindromeProduct` | 906609 |
| 5 | [Smallest Multiple](https://projecteuler.net/problem=5) | `SmallestMultiple` | 232792560 |
| 6 | [Sum Square Difference](https://projecteuler.net/problem=6) | `SumSquareDifference` | 25164150 |
| 7 | [10001st Prime](https://projecteuler.net/problem=7) | `NthPrime` | 104743 |
| 8 | [Largest Product in a Series](https://projecteuler.net/problem=8) | `LargestProductSeries` | 23514624000 |
| 9 | [Special Pythagorean Triplet](https://projecteuler.net/problem=9) | `PythagoreanTriplet` | 31875000 |
| 10 | [Summation of Primes](https://projecteuler.net/problem=10) | `PrimeSummation` | 142913828922 |
| 11 | [Largest Product in a Grid](https://projecteuler.net/problem=11) | `LargestProductInAGrid` | 70600674 |
| 12 | [Highly Divisible Triangular Number](https://projecteuler.net/problem=12) | `HighlyDivisibleTriangularNumber` | 76576500 |
| 13 | [Large Sum](https://projecteuler.net/problem=13) | `Problem13` | 5537376230 |

## Project Structure

```
euler/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       ├── aaak/euler/
│   │   │       │   ├── problem/
│   │   │       │   │   ├── one/          # Problem 1
│   │   │       │   │   ├── two/          # Problem 2
│   │   │       │   │   ├── three/        # Problem 3
│   │   │       │   │   ├── ...           # Problems 4-11
│   │   │       │   │   └── twelve/       # Problem 12
│   │   │       │   └── util/             # Utility classes
│   │   │       │       ├── SafeNumberParser.java
│   │   │       │       ├── StringUtil.java
│   │   │       │       └── TimeUtil.java
│   │   │       └── aakash/euler/
│   │   │           ├── solutions/        # Alternative solutions (8-13)
│   │   │           └── utils/
│   │   │               ├── MathUtils.java
│   │   │               └── FileUtils.java
│   │   └── resources/
│   │       ├── euler_11.txt              # Grid data for Problem 11
│   │       └── euler_13.txt              # Number data for Problem 13
│   └── test/
│       └── java/                         # JUnit tests
├── build.gradle
└── README.md
```

## Requirements

- **Java:** 8 or higher (compiled with Java 8 compatibility)
- **Gradle:** 8.14.3 (included via wrapper)

## Building and Running

### Using Gradle Wrapper

```bash
# Build the project
./gradlew build

# Compile only
./gradlew compileJava

# Run tests
./gradlew test
```

### Running Individual Solutions

```bash
# Using Gradle
./gradlew run -PmainClass=com.aaak.euler.problem.one.SumOfMultiplesOf3N5

# Or compile and run directly with Java
javac -d out src/main/java/com/aaak/euler/problem/one/SumOfMultiplesOf3N5.java
java -cp out com.aaak.euler.problem.one.SumOfMultiplesOf3N5
```

## Utility Classes

### MathUtils
- `isPrime(long n)` - Check if a number is prime
- `countDivisors(long n)` - Count divisors efficiently using O(sqrt(n))

### StringUtil
- `reverse(String input)` - Reverse a string
- `isPalindrome(String s)` - Check if a string is a palindrome

### SafeNumberParser
- `parseInt(String s, int defaultValue)` - Safe integer parsing with default
- `parseLong(String s, long defaultValue)` - Safe long parsing with default
- `getIntAt(String[] args, int index, int defaultValue)` - Get argument with default

### TimeUtil
- `friendlyTime(long timeInMillis)` - Format time as "X h, Y m, Z s"

## Algorithm Highlights

- **Problem 10:** Sieve of Eratosthenes for efficient prime generation
- **Problem 12:** O(sqrt(n)) divisor counting using paired factors
- **Problem 13:** BigInteger for handling 50-digit numbers

## Contributing

1. Each solution should be in its own package: `com.aaak.euler.problem.<name>`
2. Class names should be descriptive (e.g., `LargestPalindromeProduct`)
3. Include a documentation comment explaining the problem and approach
4. Solutions should run in under 1 minute (Project Euler guideline)
5. Leverage existing utility classes when possible

## License

This project is for educational purposes. Problem statements are copyright of [Project Euler](https://projecteuler.net/).
