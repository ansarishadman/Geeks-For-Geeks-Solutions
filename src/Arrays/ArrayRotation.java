
public class ArrayRotation {

	public static void main(String[] args) {
		ArrayRotation rotate = new ArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.leftRotate(arr, 2, arr.length);
		rotate.printArray(arr, arr.length);

	}

	void leftRotate(int arr[], int d, int n) {
		int temp;
		for (int i = 0; i < d; i++) {
			temp = arr[0];
			for (int j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[n - 1] = temp;
		}
	}

	void printArray(int arr[], int n) {
		for (int k = 0; k < n; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
