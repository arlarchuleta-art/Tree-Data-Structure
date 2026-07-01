/*
 * Name: Adam Archuleta
 * Date: June 29, 2026
 * Assignment: Nintendo HR Binary Search Tree
 * Purpose: Data structure encapsulating a person's metrics and name comparison traits.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int height;
    private int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() { return name; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.getName());
    }

    @Override
    public String toString() {
        return String.format("%-10s\t%-5d\t%-5d", name, height, weight);
    }
}