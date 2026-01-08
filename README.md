# BinarySearchDemo 🔎

A beginner-friendly Java project that demonstrates the **Binary Search** algorithm.

This project allows the user to search for a number inside a **sorted integer array** using Binary Search.  
The program generates a random array, sorts it, and lets the user search for values interactively.

---

## 📂 Project Structure
```
BinarySearchDemo/
│
├── BinarySearch.java
├── BinarySearchDemo.java
└── README.md
```

---

## ✨ Features

- Implements the **Binary Search** algorithm
- Searches for a value inside a **sorted integer array**
- Generates and sorts a random array for testing
- Interactive user input using `Scanner`
- Prints whether the value is found and its position
- Clean and beginner-friendly code

---

## 🧠 Algorithm Overview

**Binary Search** is a divide-and-conquer algorithm that works as follows:

1. Start with the entire sorted array
2. Find the middle element
3. If the middle element equals the target → return the index
4. If the target is smaller → search the left half
5. If the target is larger → search the right half
6. Repeat recursively until the element is found or the search space is empty

**Precondition:** The array **must be sorted** for Binary Search to work correctly.

---

## 🧩 How the Program Works

1. A random integer array is generated
2. The array is sorted in ascending order
3. The sorted array is printed to the console
4. The user is prompted to enter a number to search for
5. The `BinarySearch.search()` method is called
6. The program:
   - Displays the index if the value is found
   - Displays a message if the value is not found
7. The program continues until the user enters `-1` to quit

---

## ▶ Example Output
```
Sorted array:
[3, 6, 12, 12, 16, 30, 36, 38, 41, 47, 47, 49, 57, 59, 80, 85, 89, 93, 94, 97]
Enter number to search for (-1 to quit): 80
Found at position: 14
Enter number to search for (-1 to quit): 99
Value not found.
Enter number to search for (-1 to quit): -1
```

---

## 🎯 Learning Goals

This project is designed for beginners who want to practice:

- Java arrays
- Recursion
- Divide-and-conquer algorithms
- Method decomposition
- Working with multiple classes
- Understanding sorting and searching algorithms

---

## ⏱ Time and Space Complexity

| Complexity | Value |
|-----------|-------|
| Time      | O(log n) |
| Space     | O(log n) (due to recursion) |

---
## 🚀 How to Run

1. Make sure you have **Java 8 or higher** installed.  
2. Compile the files:
   ```
   javac BinarySearch.java BinarySearchDemo.java
   ```
3. Run the program:
   ```
   java BinarySearchDemo
   ```
