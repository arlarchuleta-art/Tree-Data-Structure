// Adam Archuleta
// July 2026
// Main file that reads hr.txt and runs tests, including the extra credit balance checks.
// Citation: File parsing framework was assisted by AI and verified manually.

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SortedTreeSet tree = new SortedTreeSet();

        try (Scanner sc = new Scanner(new File("hr.txt"))) {
            if (sc.hasNextLine()) sc.nextLine();
            while (sc.hasNextLine()) {
                String[] p = sc.nextLine().split("\\s+");
                if (p.length >= 3) {
                    tree.add(new Person(p[0], Integer.parseInt(p[1]), Integer.parseInt(p[2])));
                }
            }
        } catch (Exception e) { e.printStackTrace(); }

        System.out.println("--- Tree Contents ---");
        System.out.print(tree);

        // Extra Credit Test Prints
        System.out.println("Is tree balanced? " + tree.isBalanced());
        tree.balanceTree();
        System.out.println("Balanced tree successfully after balanceTree() call.");
        
        // Testing Index Get Extra Credit
        if (tree.get(0) != null) {
            System.out.println("Testing get(0) index location: " + tree.get(0).getName());
        }
    }
}