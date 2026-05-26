# java-core-mastery

> A structured self-study repository for mastering Java Core fundamentals, purpose-built as a prerequisite for Spring & Spring Boot backend development.

![Status](https://img.shields.io/badge/status-in%20progress-blue?style=flat-square)
![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/target-Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![IDE](https://img.shields.io/badge/IDE-VS%20Code-007ACC?style=flat-square&logo=visualstudiocode&logoColor=white)

---

## Motivation

This repository documents a deliberate, goal-oriented study path through Java Core — not an exhaustive language survey, but a targeted preparation for building production-grade backend services with Spring Boot. Topics are selected and prioritized based on their direct relevance to the Spring ecosystem: dependency injection, annotation-driven configuration, functional programming patterns, and exception handling contracts.

Prior background: Full-stack development with TypeScript / Node.js / .NET — meaning syntax fundamentals are reviewed at pace, while the focus time is allocated to Java-specific patterns and idioms that diverge meaningfully from the .NET world.

---

## Roadmap

The roadmap is structured into four sequential phases, with a final exclusion list for topics irrelevant to the stated goal.

### Phase 1 — Basics `fast-forward`

Topics covered at review pace, without in-depth exercises.

| Topic | Notes |
|---|---|
| Basic syntax | Variable declaration, control flow |
| Data types | Primitive vs reference, autoboxing |
| Variables & scopes | Block scope, field scope |
| Type casting | Widening, narrowing, explicit casting |
| Conditionals & loops | if/else, switch, for, while, do-while |
| Arrays | Single-dimensional, multi-dimensional |
| Strings & methods | Immutability, String pool, common APIs |
| Math operations | `java.lang.Math`, operator precedence |

> Checkpoint: able to write basic procedural Java programs without reference.

---

### Phase 2 — Object Oriented Programming `required`

Core OOP understanding applied through Java-specific constructs.

| Topic | Priority | Notes |
|---|---|---|
| Classes & objects | High | Constructor chaining, `this` keyword |
| Interfaces | High | Default methods (Java 8+), multiple implementation |
| Abstract classes | High | Template method pattern |
| Inheritance | High | Single inheritance, `super` keyword |
| Encapsulation | High | Getters/setters, access boundary design |
| Method overriding | High | `@Override`, covariant return types |
| Access specifiers | High | `public`, `protected`, package-private, `private` |
| **Pass by value / reference** | **Critical** | Fundamental difference from C# — objects passed by reference value |
| Static vs dynamic binding | High | Compile-time vs runtime polymorphism |
| Static & final keywords | Medium | Class-level state, immutable references |
| Packages | Medium | Naming convention, import system |
| Object lifecycle | Medium | GC eligibility, `finalize()` deprecation |

> ⚠️ **Pass by value / reference** is the most common conceptual trap when transitioning from C# to Java. Every object reference in Java is itself passed by value — misunderstanding this causes subtle, hard-to-debug errors in service-layer code.

> Checkpoint: able to model a domain with clean class hierarchies, apply SOLID principles at the class level, and articulate how Java's memory model handles object references.

---

### Phase 3 — Spring Prerequisites ⭐ `critical`

The highest-priority phase. These topics underpin virtually every Spring Boot feature.

| Topic | Priority | Why It Matters for Spring |
|---|---|---|
| Exception handling | **Critical** | `@ExceptionHandler`, `@ControllerAdvice`, `ResponseStatusException` |
| Checked vs unchecked exceptions | **Critical** | Spring wraps checked exceptions — understanding the contract prevents silent swallowing |
| Lambda expressions | **Critical** | Functional configuration, event listeners, bean callbacks |
| Functional interfaces | **Critical** | `Predicate`, `Supplier`, `Consumer`, `Function` — used throughout Spring internals |
| **Stream API** | **Critical** | Service-layer data transformation, Spring Data result mapping |
| Collections | **Critical** | `List`, `Map`, `Set` — the primary data structures across every Spring layer |
| Generic collections | **Critical** | `List<T>`, `Map<K,V>` — type-safe service and repository contracts |
| Annotations | **Critical** | Spring is annotation-driven — understanding how annotations work at the JVM level removes magic |
| Optionals | High | `Optional<T>` is the return type of Spring Data repository finders |
| Enums | Medium | Commonly used in entity status fields, Spring configuration enums |
| Wrapper classes | Medium | Autoboxing in generics, null-safety patterns |

> ⚠️ **Stream API** is absent from most beginner Java roadmaps but is non-negotiable for modern Spring Boot code. Every service layer that queries, filters, and maps data relies on it. Primary resource: [Baeldung — Java 8 Streams](https://www.baeldung.com/java-8-streams).

> Checkpoint: able to write a complete service class using lambda-based stream pipelines, handle exceptions with proper checked/unchecked distinctions, and explain how a custom annotation works at the JVM level.

---

### Phase 4 — Concurrent with Spring Boot `as needed`

Studied on-demand while building Spring Boot projects — not a prerequisite.

| Topic | Spring Context |
|---|---|
| Dependency injection (manual) | Foundation before `@Autowired`, `@Bean` |
| Concurrency / threads | Required for `@Async`, `CompletableFuture` |
| Java memory model | Required for thread-safe singleton beans |
| I/O & file operations | Required for file upload/download features |
| Date & time (`java.time`) | Required for `LocalDate`, `ZonedDateTime` in entities |
| Virtual threads (Java 21) | Spring Boot 3.2+ supports virtual thread executors |

---

### Excluded Topics

The following are valid Java topics but outside the scope of this repository's goal.

| Topic | Reason |
|---|---|
| Cryptography | Not part of application-layer Spring development |
| Networking (raw sockets) | Spring abstracts networking entirely |
| Java modules (JPMS) | Spring Boot's module system operates differently |
| `volatile` keyword | Advanced JVM concurrency — beyond current scope |
| Anonymous classes | Superseded by lambda expressions in modern Java |
| `TimerTask` | Spring `@Scheduled` is the production alternative |
| Record types | Syntactic sugar — not relevant at this learning stage |
| Regular expressions (deep) | Introduced as-needed; no dedicated study block |

---

## Repository Structure

```
java-core-mastery/
├── phase-1-basics/
│   ├── DataTypes.java
│   ├── Strings.java
│   ├── Loops.java
│   └── ...
├── phase-2-oop/
│   ├── PassByValueDemo.java
│   ├── InterfaceVsAbstract.java
│   ├── InheritanceExample.java
│   └── ...
├── phase-3-spring-prereqs/
│   ├── exceptions/
│   │   ├── CheckedVsUnchecked.java
│   │   └── CustomExceptionDemo.java
│   ├── functional/
│   │   ├── LambdaExpressions.java
│   │   ├── FunctionalInterfaces.java
│   │   └── StreamApiPractice.java
│   ├── collections/
│   │   ├── ListMapSetDemo.java
│   │   └── GenericCollections.java
│   └── annotations/
│       ├── CustomAnnotation.java
│       └── AnnotationProcessor.java
├── phase-4-concurrent/
│   └── ...
└── README.md
```

Each phase directory contains standalone `.java` files with inline comments explaining the concept being demonstrated. No external dependencies — plain Java, compile and run.

---

## Tools & Environment

| Tool | Purpose |
|---|---|
| Java 21 (LTS) | Runtime & language version |
| VS Code + Extension Pack for Java | Primary IDE |
| Maven | Build tool (introduced from Phase 4 onward) |
| Git | Version control |

---

## Progress

| Phase | Status | Completion |
|---|---|---|
| Phase 1 — Basics | `not started` | 0% |
| Phase 2 — OOP | `not started` | 0% |
| Phase 3 — Spring Prerequisites | `not started` | 0% |
| Phase 4 — Concurrent with Spring | `not started` | — |

---

## Next Step

After completing Phase 3, the natural continuation is:

- **[Spring Boot](https://spring.io/projects/spring-boot)** — REST API development, JPA/Hibernate, Spring Security
- **[Effective Java — Joshua Bloch](https://www.oreilly.com/library/view/effective-java-3rd/9780134686097/)** — recommended reading to move from using Java to understanding it

---

## Author

**Mai Trung Hậu** — Co-Founder at [MST Software](https://github.com/MST-Software) · Full-stack Web Developer  
*Specializing in TypeScript / React / Next.js / .NET · Currently expanding into Java / Spring Boot backend*

---

*This repository is maintained as a personal engineering study log. Code samples prioritize clarity over brevity.*