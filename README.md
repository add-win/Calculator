# Calculator Application (Java Swing)

A simple GUI-based calculator built using **Java Swing** that performs basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features

* Addition (`+`)
* Subtraction (`-`)
* Multiplication (`*`)
* Division (`/`)
* Decimal number support (`.`)
* Clear button (`C`)
* User-friendly graphical interface using Swing

## Technologies Used

* Java
* Swing (GUI Framework)
* AWT Event Handling

## Project Structure

```text
Calculator.java
```

## How It Works

1. Enter the first number using the numeric buttons.
2. Select an arithmetic operator (`+`, `-`, `*`, `/`).
3. Enter the second number.
4. Click `=` to display the result.
5. Click `C` to clear the display and start a new calculation.

## Installation and Execution

### Prerequisites

* Java JDK 8 or higher installed
* Command Prompt / Terminal

### Compile

```bash
javac Calculator.java
```

### Run

```bash
java Calculator
```

## Code Highlights

### Event Handling

The calculator implements the `ActionListener` interface to handle button click events.

```java
public class Calculator implements ActionListener
```

### Arithmetic Operations

```java
switch(count)
{
    case 1 -> result = a + b;
    case 2 -> result = a - b;
    case 3 -> result = a * b;
    case 4 -> result = a / b;
}
```

## Supported Operations

| Operation      | Symbol |
| -------------- | ------ |
| Addition       | +      |
| Subtraction    | -      |
| Multiplication | *      |
| Division       | /      |

## Future Improvements

* Keyboard input support
* Percentage (%) operation
* Square root operation
* Backspace button
* Scientific calculator functions
* Improved UI design using layouts and custom styling
* Better error handling for invalid inputs and division by zero

## Author

**Addwin Alanolikkal**

B.Tech Computer Science and Engineering
Christ College of Engineering (Autonomous)
