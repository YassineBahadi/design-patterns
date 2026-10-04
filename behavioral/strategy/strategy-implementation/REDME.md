# Strategy Pattern

## Description

This project demonstrates the **Strategy Design Pattern** in Java.

The example starts with a simple implementation where different algorithms are handled using `if/else` conditions. This approach becomes difficult to maintain when new strategies are added.

The Strategy Pattern solves this problem by extracting the parts of the algorithm that vary and encapsulating them into separate strategy classes.

## Problem

The initial implementation used conditional statements to select an algorithm:

```java
if (type == 1) {
    // Strategy 1
} else if (type == 2) {
    // Strategy 2
} else if (type == 3) {
    // Strategy 3
} else {
    // Default Strategy
}
```

This creates a strong dependency between the `Context` and all available strategies.

Every time a new strategy is added, the `Context` class must be modified.

## Solution

The Strategy Pattern separates the varying algorithms from the main algorithm.

A common `Strategy` interface is created:

```java
public interface Strategy {
    void operationStrategy();
}
```

Each concrete strategy implements this interface:

```text
Strategy
   │
   ├── StrategyImpl1
   ├── StrategyImpl2
   ├── StrategyImpl3
   └── DefaultStrategyImpl
```

The `Context` class depends only on the `Strategy` interface:

```java
public class Context {

    private Strategy strategy = new DefaultStrategyImpl();

    public void effectuerOperation() {
        System.out.println("********************");
        strategy.operationStrategy();
        System.out.println("======================");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
```

This allows the strategy to be changed at runtime without modifying the `Context`.

## Project Structure

```text
src/
└── main/
    └── java/
        └── com/
            └── yassine/
                ├── Main.java
                │
                ├── context/
                │   └── Context.java
                │
                └── strategy/
                    ├── Strategy.java
                    ├── DefaultStrategyImpl.java
                    ├── StrategyImpl1.java
                    ├── StrategyImpl2.java
                    └── StrategyImpl3.java
```

## Main Components

### Strategy

Defines the common contract for all strategies.

```java
public interface Strategy {
    void operationStrategy();
}
```

### Concrete Strategies

Each concrete strategy provides its own implementation of the algorithm.

* `StrategyImpl1`
* `StrategyImpl2`
* `StrategyImpl3`
* `DefaultStrategyImpl`

### Context

The `Context` uses a `Strategy` object without knowing which concrete implementation is being used.

The strategy can be changed using:

```java
context.setStrategy(strategy);
```

## Runtime Strategy Selection

The application also demonstrates dynamic strategy instantiation.

The user enters a strategy number:

```text
Enter strategy :
1
```

The application dynamically loads the corresponding class:

```java
Strategy strategy =
    (Strategy) Class
        .forName("com.yassine.strategy.StrategyImpl" + str)
        .getConstructor()
        .newInstance();
```

## Strategy Instance Cache

A `HashMap` is used to avoid creating the same strategy object multiple times:

```java
Map<String, Strategy> strategyMap = new HashMap<>();
```

Before creating a new object, the application checks whether the strategy already exists:

```java
strategy = strategyMap.get(str);

if (strategy == null) {
    strategy = (Strategy) Class
            .forName("com.yassine.strategy.StrategyImpl" + str)
            .getConstructor()
            .newInstance();

    strategyMap.put(str, strategy);
}
```

This allows previously created strategy instances to be reused.

## Example

```text
Enter strategy :
1

Creation d'un nouvel objet de StrategyImpl1

********************
+++++++++Strategy 1+++++++++++
======================

Enter strategy :
2

Creation d'un nouvel objet de StrategyImpl2

********************
&&&&& Strategy 2 &&&&&
======================

Enter strategy :
1

********************
+++++++++Strategy 1+++++++++++
======================
```

When `1` is selected for the second time, the existing `StrategyImpl1` instance is reused.

## Advantages

* Removes complex `if/else` logic from the `Context`.
* Encapsulates each algorithm independently.
* Allows strategies to be changed at runtime.
* Makes it easier to add new strategies.
* Reduces coupling between `Context` and concrete strategies.
* Promotes the **Open/Closed Principle**.

## Key Idea

The main idea of the Strategy Pattern is:

> Encapsulate a family of algorithms, make them interchangeable, and let the client choose the appropriate algorithm at runtime.

## Technologies

* Java
* Object-Oriented Programming
* Java Reflection API
* Collections (`HashMap`)
* Strategy Design Pattern
