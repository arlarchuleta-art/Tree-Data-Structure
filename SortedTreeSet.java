// Adam Archuleta
// July 2026
// This is my custom search tree that sorts names left or right, blocks duplicates, handles tree balancing, and tracks indices.
// Citation: The logic for tree balancing and the recursive insertion structure was assisted by AI tools. I have reviewed, tested, and rewritten the code to fit the assignment requirements manually.

import java.util.ArrayList;

public class SortedTreeSet implements SortedTreeSetInterface, PersonList {
    private Person person;
    private SortedTreeSet left, right, parent;

    public SortedTreeSet() {
        this.person = null;
    }

    public SortedTreeSet(Person p) {
        this.person = p;
    }

    public Person getPerson() { return this.person; }
    public boolean hasLeft() { return this.left != null; }
    public SortedTreeSet getLeft() { return this.left; }
    public void setLeft(SortedTreeSet left) { 
        this.left = left; 
        if (left != null) left.parent = this; 
    }
    public boolean hasRight() { return this.right != null; }
    public SortedTreeSet getRight() { return this.right; }
    public void setRight(SortedTreeSet right) { 
        this.right = right; 
        if (right != null) right.parent = this; 
    }
    
    // Extra Credit: Parent getter
    public SortedTreeSet getParent() { return this.parent; }

    public void add(Person p) {
        if (this.person == null) {
            this.person = p;
            return;
        }

        int comparison = p.compareTo(this.person);

        if (comparison < 0) {
            if (!hasLeft()) setLeft(new SortedTreeSet(p));
            else this.left.add(p);
        } else if (comparison > 0) {
            if (!hasRight()) setRight(new SortedTreeSet(p));
            else this.right.add(p);
        }
    }

    // EXTRA CREDIT: PersonList index lookup
    public Person get(int i) {
        ArrayList<Person> list = new ArrayList<>();
        flatten(this, list);
        return (i >= 0 && i < list.size()) ? list.get(i) : null;
    }

    // Extra Credit: Check if balanced
    public boolean isBalanced() {
        if (person == null) return true;
        int l = getHeight(left);
        int r = getHeight(right);
        return Math.abs(l - r) <= 1 && 
               (left == null || left.isBalanced()) && 
               (right == null || right.isBalanced());
    }

    private int getHeight(SortedTreeSet node) {
        if (node == null || node.person == null) return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    // Extra Credit: Rebalance logic
    public void balanceTree() {
        ArrayList<Person> sorted = new ArrayList<>();
        flatten(this, sorted);
        this.person = null; this.left = null; this.right = null; this.parent = null;
        rebuild(sorted, 0, sorted.size() - 1);
    }

    private void flatten(SortedTreeSet node, ArrayList<Person> list) {
        if (node == null || node.person == null) return;
        flatten(node.left, list);
        list.add(node.person);
        flatten(node.right, list);
    }

    private void rebuild(ArrayList<Person> list, int start, int end) {
        if (start > end) return;
        int mid = (start + end) / 2;
        this.add(list.get(mid));
        rebuild(list, start, mid - 1);
        rebuild(list, mid + 1, end);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        traverse(this, sb);
        return sb.toString();
    }

    private void traverse(SortedTreeSet node, StringBuilder sb) {
        if (node == null || node.person == null) return;
        traverse(node.left, sb);
        sb.append(node.person.toString()).append("\n");
        traverse(node.right, sb);
    }
}