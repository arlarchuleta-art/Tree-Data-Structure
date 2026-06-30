# Nintendo HR Binary Search Tree Project
**Date:** June 29, 2026  
**Developer:** Adam Archuleta  

## Project Overview
This project marks a shift from linear sequential structures (like doubly-linked lists) into nonlinear structures by implementing a custom **Binary Search Tree (BST)**. 

The application builds a self-sorting binary tree set designed to track employees for Nintendo's Human Resources department using the `hr.txt` dataset. It automatically handles alphabetization via recursive path positioning and performs duplicate suppression on the fly.

## Structural Strategy
To complete this program successfully, the implementation will deploy across 3 core elements:
1. `Person.java` - Blueprint data object tracking user metrics and implementing `Comparable`.
2. `SortedTreeSet.java` - The binary search tree container coordinating insertion paths without duplicate components.
3. `Main.java` - Core input file streaming engine and data layout parser.

---
*Status: Repository initialized. Development schedule ongoing.*

## Milestone 2 Update: Core Data Object Deployed
* **Component Added:** `Person.java`
* **Details:** Successfully integrated the core employee data model. Implemented Java's `Comparable` interface to allow the tree to sort individual records alphabetically by name on contact.

## Milestone 3 Update: Tree Logic Structure Deployed
* **Component Added:** `SortedTreeSet.java`
* **Details:** Completed the self-sorting Binary Search Tree logic. The structural paths now recursively guide smaller string elements to the left subtrees and larger string elements to the right subtrees while seamlessly dropping duplicate entries on impact.