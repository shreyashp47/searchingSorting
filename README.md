
---

# **Kotlin Array Sorting and Searching**

This project demonstrates sorting and searching techniques in Kotlin, including **Bubble Sort**, **Linear Search**, and **Binary Search**. The code provides a simple implementation of these algorithms and can be used for learning or reference.

---

## **Features**
- **Bubble Sort**: Sorts an unsorted array in ascending order.
- **Linear Search**: Searches for an element in an array by iterating through it.
- **Binary Search**: Searches for an element in a sorted array using the divide-and-conquer technique.

---

## **Getting Started**

### **Prerequisites**
- Kotlin 1.5 or higher
- A Kotlin IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Kotlin Playground](https://play.kotlinlang.org/).

---

## **How to Run**
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repository-name.git
   ```
2. Open the project in your Kotlin IDE.
3. Run the `main()` function.

---

## **Code Overview**

### **1. Bubble Sort**
Sorts the array in ascending order using a nested loop:
```kotlin
fun bubbleSort(arr: IntArray): IntArray
```

### **2. Linear Search**
Searches for a target value in the array:
```kotlin
fun linearSearch(arr: IntArray, search: Int): Boolean
```

### **3. Binary Search**
Searches for a target value in a sorted array:
```kotlin
fun binarySearch(arr: IntArray, search: Int): Boolean
```

---

## **Usage**
1. Define an unsorted array in `main()`.
2. Call `bubbleSort()` to sort the array.
3. Use `linearSearch()` to search for an element in the unsorted array.
4. Use `binarySearch()` to search for an element in the sorted array.

---

## **Example**
### **Input**
Unsorted Array:
```
[4, 23, 7, 3, 2, 78, 9, 6543, 22, 5, 576, 36, 865, 4634, 534, 5634]
Search Targets: 9 (exists), 432 (does not exist)
```

### **Output**
```
Unsorted Array:
4 23 7 3 2 78 9 6543 22 5 576 36 865 4634 534 5634 

bubbleSort: Sorted Array:
2 3 4 5 7 9 22 23 36 78 534 576 865 4634 5634 6543 

Linear Search:
  9 true
  432 false

Binary Search:
  9 true
  432 false
```

---

## **Contributing**
Contributions are welcome! Please fork this repository and submit a pull request.


---

## **Author**
**Shreyash Pattewar**

---
