# Creational Design Patterns Assignment

**Course Name**: Software Design Patterns  
---

## Task 1: Document Creation System

### Objective
The goal is to build a system that generates different types of documents (PDFs and Word files). The system should be flexible and allow the addition of new document types without changing the existing code.

### Requirements
1. Implement at least two document types: `PDFDocument` and `WordDocument`.
2. The system should allow easy addition of new document types (e.g., `ExcelDocument`) without modifying the existing code.
3. You need to apply an appropriate **Creational Design Pattern** to ensure flexibility and maintainability. The **Factory Method** is the most suitable design pattern for this task, as it decouples the client code from the specific classes of the documents being created.

### Solution Structure
- **Document Interface**: A unified interface for all document types.
- **PDFDocument Class**: Displays the message "PDF Document created."
- **WordDocument Class**: Displays the message "Word Document created."
- **DocumentFactory Class**: Responsible for creating the appropriate document type based on the input.

### How to Run
1. Clone the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Navigate to `Main.java` and run the program.
4. The console should display the appropriate document creation messages.

---

## Task 2: GUI Theme System

### Objective
You are tasked with building a GUI application that supports multiple themes (Light Theme and Dark Theme). The system should be designed in such a way that adding new themes (e.g., `BlueTheme`) can be done without modifying existing code.

### Requirements
1. Implement at least two themes: `LightTheme` and `DarkTheme`. Each theme should define specific buttons and checkboxes.
2. The system should allow the addition of new themes without changing the existing code.
3. The most appropriate design pattern for this task is the **Abstract Factory** pattern, which allows the creation of families of related objects (buttons, checkboxes) without specifying their concrete classes.

### Solution Structure
- **Button Interface**: A common interface for all buttons.
- **Checkbox Interface**: A common interface for all checkboxes.
- **LightButton Class**: A button for the light theme that displays "Light Button".
- **LightCheckbox Class**: A checkbox for the light theme that displays "Light Checkbox".
- **DarkButton Class**: A button for the dark theme that displays "Dark Button".
- **DarkCheckbox Class**: A checkbox for the dark theme that displays "Dark Checkbox".
- **ThemeFactory Interface**: An abstract factory for creating buttons and checkboxes.
- **LightThemeFactory Class**: A factory for creating light-themed components.
- **DarkThemeFactory Class**: A factory for creating dark-themed components.

### How to Run
1. Clone the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Navigate to `Main.java` and run the program.
4. The console should display the appropriate button and checkbox for each theme.

---

## Design Patterns Applied
1. **Factory Method Pattern**: Used in Task 1 to handle the creation of various document types while allowing the system to be easily extended with new document types.
2. **Abstract Factory Pattern**: Used in Task 2 to allow the creation of families of related objects (buttons, checkboxes) without depending on their concrete classes.

---

## How to Extend the System
- **For Task 1**: To add a new document type (e.g., `ExcelDocument`), create a new class that implements the `Document` interface and add its logic to the `DocumentFactory` class.
- **For Task 2**: To add a new theme (e.g., `BlueTheme`), create new `Button` and `Checkbox` implementations and create a new factory class that returns these components.

---
