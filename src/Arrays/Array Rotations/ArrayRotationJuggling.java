
public class ArrayRotationJuggling {

	public static void main(String[] args) {
		ArrayRotationJuggling rotate = new ArrayRotationJuggling();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int n = arr.length;
		int gcdVal = rotate.gcd(3, n);
		rotate.leftRotate(arr, 3, n, gcdVal);
		rotate.printArray(arr, n);

	}

	void leftRotate(int arr[], int d, int n, int gcd) {
		// handle d >= n
		try() {
		d = d % n;
		int temp;
		for (int i = 0; i < gcd; i++) {
			int k = 0;
			temp = arr[i];
			for (int j = 0; j < n - 1; j = j + gcd) {
				arr[j] = arr[j + gcd];
				k = j;
			}
			arr[k + gcd] = temp;
		}
		} catch(e) {
			System.out.println(e);
		}
	}

	void printArray(int arr[], int n) {
		for (int k = 0; k < n; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	int gcd(int d, int n) {
		if (n == 0) {
			return d;
		} else {
			return gcd(n, d % n);
		}
	}

}
