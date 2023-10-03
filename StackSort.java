import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        List<Integer> integerList = readIntegers();

        if (!integerList.isEmpty()) {
            // sort list
            sortList(integerList);
            addListToStack(integerStack, integerList);
            printStack(integerStack);
        } else {
            System.out.println("No integers entered.");
        }
    }

    /**
     * Reads a list of integers from user input and returns them as a List.
     *
     * @return A List containing user-inputted integers.
     */
    public static List<Integer> readIntegers() {
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers separated by hitting return for each line (enter a non-integer to finish):");

        while (true) {
            try {
                int num = scanner.nextInt();
                integerList.add(num);
            } catch (InputMismatchException e) {
                // Handle non-integer input
                System.out.println("You entered a non-integer, so the program will end.");
                scanner.next(); // Consume the invalid input
                break; // Exit the loop
            }
        }

        return integerList;
    }

    /**
     * Sorts a List of integers in ascending order.
     *
     * @param integerList The List to be sorted.
     */
    public static void sortList(List<Integer> integerList) {
        Collections.sort(integerList);
    }

    /**
     * Adds a List of integers to a Stack.
     *
     * @param integerStack The Stack to which the List will be added.
     * @param integerList The List of integers to be added to the Stack.
     */
    public static void addListToStack(Stack<Integer> integerStack, List<Integer> integerList) {
        for (Integer num : integerList) {
            integerStack.push(num);
        }
    }

    /**
     * Prints the elements of a Stack.
     *
     * @param integerStack The Stack to be printed.
     */
    public static void printStack(Stack<Integer> integerStack) {
        System.out.println("Stack of integers (from smallest to largest):");
        for (Integer num : integerStack) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
