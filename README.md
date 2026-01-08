# MapDemo 🎨

A simple and beginner-friendly Java program that demonstrates how to use a **Map** to associate keys with values.

In this example, a person's name is associated with their favorite color using a `HashMap`.

---

## 📂 Project Structure
```
MapDemo/
│
├── MapDemo.java
└── README.md
```

---

## ✨ Features

- Uses a `HashMap` to store key-value pairs
- Associates a `String` (name) with a `Color`
- Iterates through the map using `entrySet()`
- Converts `Color` objects into readable color names
- Clean, readable, and beginner-friendly code

---

## 🧠 Concept Overview

A **Map** in Java stores data as **key-value pairs**.

In this project:
- **Key** → Person's name (`String`)
- **Value** → Favorite color (`Color`)

Each key is unique, and each key maps to exactly one value.

---

## 🧩 How the Program Works

1. A `HashMap<String, Color>` is created.
2. Names and favorite colors are added using `put()`.
3. The map is traversed using `entrySet()`.
4. For each entry:
   - The key (name) is retrieved
   - The value (color) is retrieved
   - The color is converted into a readable string
5. The result is printed to the console.

---

## ▶ Example Output
```
Juliet's favorite color is Blue
Romeo's favorite color is Green
Adam's favorite color is Red
Eve's favorite color is Blue
```

---

## 🎯 Learning Goals

This project is designed for beginners who want to practice:

- Using `Map` and `HashMap`
- Working with key-value data structures
- Iterating with `entrySet()`
- Using Java built-in classes (`Color`)
- Writing clean and readable Java code

---

## 🚀 How to Run

1. Make sure you have **Java 8 or higher** installed.
2. Compile the program:
```
javac MapDemo.java
```
3. Run the program:
```
java MapDemo
```
