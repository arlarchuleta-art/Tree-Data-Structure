/*
 * Name: Adam Archuleta
 * Date: June 29, 2026
 * Assignment: Nintendo Human Resources Execution Engine
 * Purpose: Parses file rows into structural binary search trees and flushes cleanly alphabetized text outputs.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SortedTreeSet hrTree = new SortedTreeSet();

        try (Scanner fileScanner = new Scanner(new File("hr.txt"))) {
            if (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
            }

            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if (row.trim().isEmpty()) continue;

                String[] segments = row.split("\\s+");
                if (segments.length >= 3) {
                    String name = segments[0].trim();
                    int height = Integer.parseInt(segments[1].trim());
                    int weight = Integer.parseInt(segments[2].trim());

                    hrTree.add(new Person(name, height, weight));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Execution Error: The input file 'hr.txt' was not found.");
            return;
        }

        System.out.println("=========================================");
        System.out.println("   NINTENDO HR SORTED BINARY TREE SET   ");
        System.out.println("=========================================");
        System.out.printf("%-10s\t%-5s\t%-5s%n", "Name", "H(cm)", "W(kg)");
        System.out.println("-----------------------------------------");
        System.out.print(hrTree);
        System.out.println("=========================================");
    }
}