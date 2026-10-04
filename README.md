# Design Patterns

A collection of **Design Patterns implemented in Java**, with practical examples and explanations.

This repository is part of my learning journey in **Object-Oriented Programming, Software Engineering, and Design Patterns**.

The goal is to understand each pattern through a concrete implementation, identify the problem it solves, and understand when it should be used.

## Repository Structure

The patterns are organized into three main categories:

```text
Design-patterns/
│
├── creational/
│   ├── singleton/
│   ├── factory-method/
│   ├── abstract-factory/
│   ├── builder/
│   └── prototype/
│
├── structural/
│   ├── adapter/
│   ├── decorator/
│   ├── facade/
│   ├── proxy/
│   ├── composite/
│   ├── bridge/
│   └── flyweight/
│
├── behavioral/
│   ├── strategy/
│   ├── observer/
│   ├── command/
│   ├── state/
│   ├── template-method/
│   ├── iterator/
│   ├── mediator/
│   ├── chain-of-responsibility/
│   ├── memento/
│   └── visitor/
│
└── README.md
```

> The repository will be progressively completed as new patterns are studied and implemented.

## Design Pattern Categories

### Creational Patterns

Creational patterns focus on **object creation mechanisms**.

Examples:

* Singleton
* Factory Method
* Abstract Factory
* Builder
* Prototype

### Structural Patterns

Structural patterns focus on **how classes and objects are composed** to build larger structures.

Examples:

* Adapter
* Decorator
* Facade
* Proxy
* Composite
* Bridge
* Flyweight

### Behavioral Patterns

Behavioral patterns focus on **communication between objects and the assignment of responsibilities**.

Examples:

* Strategy
* Observer
* Command
* State
* Template Method
* Iterator
* Mediator
* Chain of Responsibility
* Memento
* Visitor

## Implemented Patterns

| Category   | Pattern        | Status    |
| ---------- | -------------- | --------- |
| Behavioral | Strategy       | Completed |
| Behavioral | Observer       | Planned   |
| Behavioral | Command        | Planned   |
| Behavioral | State          | Planned   |
| Structural | Adapter        | Planned   |
| Structural | Decorator      | Planned   |
| Structural | Facade         | Planned   |
| Creational | Singleton      | Planned   |
| Creational | Factory Method | Planned   |
| Creational | Builder        | Planned   |

The table will be updated as new patterns are implemented.

## Learning Approach

For each Design Pattern, the repository follows the same approach:

1. Identify the problem.
2. Implement a simple solution.
3. Identify what changes and what remains stable.
4. Apply the Design Pattern.
5. Implement concrete examples.
6. Test the pattern.
7. Document the solution.

## Current Pattern

### Strategy

The **Strategy Pattern** is currently implemented.

It demonstrates:

* Encapsulation of algorithms.
* Separation of changing behavior from the main algorithm.
* Interchangeable strategies.
* Runtime strategy selection.
* Dynamic instantiation using Java Reflection.
* Reuse of strategy instances using `HashMap`.

See the [`behavioral/strategy`](./behavioral/strategy/) directory for the complete implementation and explanation.

## Technologies

* Java
* Object-Oriented Programming
* Java Collections
* Java Reflection API
* Design Patterns

## Objective

The objective of this repository is to build a solid understanding of Design Patterns and their practical use in software development.

Rather than memorizing patterns, the focus is on understanding:

* What problem does the pattern solve?
* Why is the pattern useful?
* What are its trade-offs?
* When should it be used?
* How can it improve the design of an application?

## Author

**Yassine Bahadi**

Software Engineering Student — ENSET Mohammedia
