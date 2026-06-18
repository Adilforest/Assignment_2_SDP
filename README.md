# Software Design Patterns — Assignment 2 (AITU)

![Java](https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white)

## Overview

Assignment 2 for the *Software Design Patterns* course at Astana IT University.
The assignment covers two independent tasks, each demonstrating a creational
design pattern through a small, self-contained Java program.

- **Task 1** — a document-creation system that produces PDF or Word documents
  without the caller knowing the concrete class.
- **Task 2** — a GUI theme system that creates themed UI components (buttons and
  checkboxes) as a coordinated family, without coupling client code to any
  specific theme implementation.

## Patterns / Concepts Implemented

- **Factory Method** (`documents` package) — `DocumentFactory.createDocument(String)`
  decides at runtime which concrete `Document` implementation (`PDFDocument` or
  `WordDocument`) to instantiate. Client code depends only on the `Document`
  interface.

- **Abstract Factory** (`themes` package) — `ThemeFactory` is an abstract factory
  interface with two concrete factories (`LightThemeFactory`, `DarkThemeFactory`).
  Each factory creates a matched pair of `Button` and `Checkbox` objects,
  ensuring UI components always belong to the same theme.

- **Interface-based polymorphism** — `Document`, `Button`, and `Checkbox` are
  defined as Java interfaces; concrete classes implement them. Calling code
  programs to the interface, making it straightforward to add new document types
  or themes without touching existing code.

## Project Structure

```
src/
├── Main.java                  # IntelliJ default stub (not used)
│
├── documents/
│   ├── Document.java          # Product interface
│   ├── PDFDocument.java       # Concrete product
│   ├── WordDocument.java      # Concrete product
│   ├── DocumentFactory.java   # Factory Method creator
│   └── Main.java              # Entry point for Task 1
│
└── themes/
    ├── Button.java            # Abstract product
    ├── Checkbox.java          # Abstract product
    ├── ThemeFactory.java      # Abstract Factory interface
    ├── LightButton.java       # Concrete product (light)
    ├── LightCheckbox.java     # Concrete product (light)
    ├── LightThemeFactory.java # Concrete factory (light)
    ├── DarkButton.java        # Concrete product (dark)
    ├── DarkCheckbox.java      # Concrete product (dark)
    ├── DarkThemeFactory.java  # Concrete factory (dark)
    └── Main.java              # Entry point for Task 2
```

## How to Run

### Via IntelliJ IDEA (recommended)

1. Open the project root in IntelliJ IDEA.
2. To run Task 1, open `src/documents/Main.java` and click **Run**.
3. To run Task 2, open `src/themes/Main.java` and click **Run**.

### Via command line

```bash
# Task 1 — Document Creation
javac -d out src/documents/*.java
java -cp out documents.Main

# Task 2 — GUI Theme System
javac -d out src/themes/*.java
java -cp out themes.Main
```

Expected output for Task 1:
```
PDF Document created.
Word Document created.
```

Expected output for Task 2:
```
Light Button
Light Checkbox
Dark Button
Dark Checkbox
```

---

Adil Ormanov — [GitHub](https://github.com/Adilforest)
