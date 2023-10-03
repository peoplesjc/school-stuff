import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Module 4 assignment
 * A Java program that reads a list of user-inputted integers, saves them to a linked list,
 * sorts them from smallest to largest using Collections.sort(), and prints the sorted result.
 * @author: Jarrod Peoples
 */
public class LinkedListSort {

    public static void main(String[] args) {
        LinkedList<Integer> integerList = readIntegers();

        if (!integerList.isEmpty()) {
            sortLinkedList(integerList);
            printLinkedList(integerList);
        } else {
            System.out.println("No integers entered. S");
        }
    }

    /**
     * Reads a list of integers from user input and returns them as a LinkedList.
     *
     * @return A LinkedList containing user-inputted integers.
     */
    public static LinkedList<Integer> readIntegers() {
        LinkedList<Integer> integerList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers seperated but hitting return for each line (enter a non-integer to finish):");

        while (true) {
            try {
                int num = scanner.nextInt();
                integerList.add(num);
            } catch (InputMismatchException e) {
                // Handle non-integer input
                System.out.println("You entered a non integer so the program will end");
                scanner.next(); // Consume the invalid input
                break; // Exit the loop
            }
        }

        return integerList;
    }

    /**
     * Sorts a LinkedList of integers in ascending order.
     *
     * @param integerList The LinkedList to be sorted.
     */
    public static void sortLinkedList(LinkedList<Integer> integerList) {
        Collections.sort(integerList);
    }

    /**
     * Prints the elements of a LinkedList.
     *
     * @param integerList The LinkedList to be printed.
     */
    public static void printLinkedList(LinkedList<Integer> integerList) {
        System.out.println("Sorted list of integers:");
        for (Integer num : integerList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
