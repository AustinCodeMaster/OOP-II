import java.util.Arrays; // Import Arrays utility class for array operations
import java.util.Collections; // Import Collections utility class for collection operations
import java.util.List; // Import List interface

public class ArraySortReverse {
    public static void main(String[] args) {
        // Initial array of pallet IDs
        String[] pallets = {"B14", "A11", "B12", "A13"}; // Declare and initialize a String array

        // Sort the array in ascending order
        System.out.println("Sorted ...."); // Print heading for sorted output
        Arrays.sort(pallets); // Sort the array in ascending (natural) order
        for (String pallet : pallets) { // Loop through each element in the sorted array
            System.out.println("-- " + pallet); // Print each pallet ID with a prefix
        }

        // Reverse the sorted array
        System.out.println("\nReversed ...."); // Print heading for reversed output
        List<String> palletList = Arrays.asList(pallets); // Convert array to a fixed-size List backed by the array
        Collections.reverse(palletList); // Reverse the order of elements in the List (and thus the array)
        for (String pallet : palletList) { // Loop through each element in the reversed list
            System.out.println("-- " + pallet); // Print each pallet ID with a prefix
        }
    }
}
