package array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateProgram {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 1};  // Example array

        int[] result = removeDuplicates(array);

        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int value : array) {
            set.add(value);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }

        return result;	
	}

}
