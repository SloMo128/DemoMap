# Favorite Colors Map Demo 🎨
This Java program demonstrates how to use a Map (specifically a HashMap) to store and retrieve key–value pairs.
Each person’s name is associated with their favorite color, and the program prints all entries in the map.
This example is ideal for beginners learning how maps work in Java.

## 📌 Features
- Uses a HashMap to store key–value pairs
- Associates names (String) with colors (Color)
- Retrieves keys using keySet()
- Accesses values using get()
- Iterates through the map and prints all entries

## 🛠 How It Works
The program uses the following Java components:
- Map / HashMap to store name–color pairs
- Color class from java.awt to represent colors
- keySet() to obtain all keys in the map
- for-each loop to iterate over the keys
- get(key) to retrieve the value associated with each key

## Step-by-step behavior:
1) A HashMap is created to store favorite colors.
2) Several name–color pairs are added using put().
3) All keys (names) are retrieved using keySet().
4) The program loops through each key.
5) For each key, the corresponding color is retrieved and printed.

## ▶ Example Output
- Juliet: java.awt.Color[r=0,g=0,b=255]
- Romeo: java.awt.Color[r=0,g=255,b=0]
- Adam: java.awt.Color[r=255,g=0,b=0]
- Eve: java.awt.Color[r=0,g=0,b=255]

## 🎯 Learning Purpose
This project is intended for learning purposes, especially for beginners practicing:
- Map and HashMap usage
- Key–value data structures
- Iterating over collections
- Using keySet() and get()
- Understanding how maps differ from lists

## ✅ Notes
- HashMap does **not guarantee ordering** of elements.
- If you need ordered results, consider:
  - LinkedHashMap → preserves insertion order
  - TreeMap → sorts keys in natural order
