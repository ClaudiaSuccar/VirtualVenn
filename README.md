# VirtualVenn
Like a Venn diagram, the program distinguishes similarities between two initialized String arrays.

1. The first and second arrays are initialized.
```java
String[] firstArray = {"Table", "Lamp", "Stove", "Sofa", "Desk"}; // Initialize and declare first array.
String[] secondArray = {"Chair", "Desk", "Fridge", "Lamp", "Bin"}; // Initialize and declare second array.
```

2. The two sets of arrays are printed to the console using for loops and indexing. \
\
_Example:_
```java
for(int i = 0; i < firstArray.length; i++) { // Outputs the first array.
			System.out.println(firstArray[i]);
		}
```

3. Find matching indexes between the two arrays using a nested for loop.
```java
for(int i = 0; i < firstArray.length; i++) { // Iterates through both the first array and second array using indexing.
  for(int j = 0; j < secondArray.length; j++) {
    if(firstArray[i] == secondArray[j]) { // The condition checks for a match between the two array indexes.
    System.out.println(secondArray[j] + " "); // Outputs the items in the second Array if they are also found in the first.
    } 
  }
}
```

4. The following is output to the console:
```bash
First array is: 
Table
Lamp
Stove
Sofa
Desk

Second array is: 
Chair
Desk
Fridge
Lamp
Bin

Similarities are: 
Lamp 
Desk
```

# What I Learned
- How to iterate through each index in an array.
- How to create a nested for loop that compares two different arrays.
