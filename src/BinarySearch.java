
public class BinarySearch {

	public static int binarySearch(int[] A, int target) {
		int lowerBound = 0;
		int upperBound = A.length - 1;
		int middle;

		while (lowerBound <= upperBound) {
			middle = (lowerBound + upperBound) / 2;

			if (A[middle] == target)
				return middle;
			else {
				if (A[middle] < target)
					lowerBound = middle + 1;
				else
					upperBound = middle - 1;
			}
		}
		return -1; // Not found
	}

	public static int rBinarySearch(int[] A, int target) {
		return rBinarySearch(A, target, 0, A.length - 1);
	}

	public static int rBinarySearch(int[] A, int target, int lowerBound, int upperBound) {
		if (lowerBound > upperBound) {
			return -1;
		}
		int middle = (lowerBound + upperBound) / 2;
		if (A[middle] == target) {
			return middle;
		} else {
			if (A[middle] < target)
				return rBinarySearch(A, target, middle + 1, upperBound);
			else
				return rBinarySearch(A, target, lowerBound, middle - 1);
		}
	}

	public static void main(String[] args) {
		int[] array = { 3, 10, 20, 53, 70, 99 };
		System.out.println(binarySearch(array, 53));
		System.out.println(binarySearch(array, 55));
		
		System.out.println(rBinarySearch(array, 53));
		System.out.println(rBinarySearch(array, 55));
	}

}
