# Nintendo HR Binary Search Tree Set
**Date:** July 3, 2026
**Developer:** Adam Archuleta

## Project Overview
This project upgrades the old sequential storage logic over into a custom Binary Search Tree (BST). The program parses employee data records from `hr.txt`, orders them alphabetically by name, and drops duplicate profiles instantly as data is added.

## Source Code Layout
The final program runs across these core files:
1. `Person.java` - Object model representing name, height, and weight metrics.
2. `PersonList.java` - Base interface defining index tracking and list constraints.
3. `SortedTreeSetInterface.java` - Blueprint mapping the node references for left and right positions.
4. `SortedTreeSet.java` - Custom binary tree implementing both interfaces to handle sorted insertions and balance properties.
5. `Main.java` - The file engine that streams text records, logs performance data, and prints structural tests.

---

## Completed Progress Milestones

### Milestone 2: Object Initialization
Integrated the base `Person` class. Used standard comparison logic so the tree nodes can determine proper alphabetical directions during data stream loops.

### Milestone 3: Binary Tree Core Architecture
Wrote the core recursive insertion paths. Smaller entries go to the left subtrees, larger entries go to the right subtrees, and matching duplicate records are filtered out on impact.

### Milestone 4: Multi-Interface & Extra Credit Modules
Expanded the core data tree to handle advanced extra credit specifications. Tracked nodes back to their parents, built height balance evaluation rules, created array mapping loops to balance lopsided trees, and implemented index lookup capability.

### Milestone 5: Output Verification & Testing Log
Compiled and tested the program files via local Command Prompt. The application successfully strips duplicate row data, handles metrics formatting, and outputs accurate balance checks.

### Verified Console Output Screen
```text
--- Tree Contents ---
Bowser  310             726
Luigi   158             83
Mario   155             90
Peach   183             60
Toad    41              7
Is tree balanced? true
Balanced tree successfully after balanceTree() call.
Testing get(0) index location: Bowser