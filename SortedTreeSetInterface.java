// Adam Archuleta
// July 2026
// Required interface for binary tree structure.

public interface SortedTreeSetInterface {
    public Person getPerson();
    public boolean hasLeft();
    public void setLeft(SortedTreeSet left);
    public SortedTreeSet getLeft();
    public boolean hasRight();
    public void setRight(SortedTreeSet right);
    public SortedTreeSet getRight();
    public void add(Person p);
}