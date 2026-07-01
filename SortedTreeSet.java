/*
 * Name: Adam Archuleta
 * Date: June 29, 2026
 * Assignment: Sorted Binary Tree Set
 * Purpose: Implements the tree interface handling recursive ordered insertions without duplicate elements.
 */
public class SortedTreeSet implements SortedTreeSetInterface {
    private Person person;
    private SortedTreeSet left;
    private SortedTreeSet right;

    public SortedTreeSet() {
        this.person = null;
        this.left = null;
        this.right = null;
    }

    public SortedTreeSet(Person p) {
        this.person = p;
        this.left = null;
        this.right = null;
    }

    @Override
    public Person getPerson() { return this.person; }

    @Override
    public boolean hasLeft() { return this.left != null; }

    @Override
    public SortedTreeSet getLeft() { return this.left; }

    @Override
    public void setLeft(SortedTreeSet left) { this.left = left; }

    @Override
    public boolean hasRight() { return this.right != null; }

    @Override
    public SortedTreeSet getRight() { return this.right; }

    @Override
    public void setRight(SortedTreeSet right) { this.right = right; }

    @Override
    public void add(Person p) {
        if (this.person == null) {
            this.person = p;
            return;
        }

        int comparison = p.compareTo(this.person);

        if (comparison < 0) {
            if (!hasLeft()) {
                setLeft(new SortedTreeSet(p));
            } else {
                this.left.add(p);
            }
        } else if (comparison > 0) {
            if (!hasRight()) {
                setRight(new SortedTreeSet(p));
            } else {
                this.right.add(p);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        inorderTraversal(this, sb);
        return sb.toString();
    }

    private void inorderTraversal(SortedTreeSet node, StringBuilder sb) {
        if (node == null || node.getPerson() == null) return;
        
        inorderTraversal(node.getLeft(), sb);
        sb.append(node.getPerson().toString()).append("\n");
        inorderTraversal(node.getRight(), sb);
    }
}