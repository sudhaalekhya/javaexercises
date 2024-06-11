package array;

public class ArraySumCalculator {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};  // Example array

        int sum = calculateSum(array);

        System.out.println("Sum of all elements in the array: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;	

	}

}
