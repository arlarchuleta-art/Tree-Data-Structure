// Adam Archuleta
// July 2026
// Basic class to hold employee info.
// Citation: Base structure drafted with AI, adjusted manually to match assignment variables.

public class Person implements Comparable<Person> {
    private String name;
    private int height;
    private int weight;
    
    public Person(String n, int h, int w) { 
        name = n; 
        height = h; 
        weight = w; 
    }
    
    public String getName() { return name; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    
    @Override
    public String toString() { 
        return name + "\t" + height + "\t\t" + weight;
    }
    
    @Override
    public int compareTo(Person p) { 
        return this.name.compareToIgnoreCase(p.name); 
    }
}