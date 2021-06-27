package co.jsoftware;

public class Bubble_sort {
	static void Bubblesort(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - 1 - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}  
	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 12, 11, 21, 16 };
		System.out.println("Array before bubble sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
		Bubblesort(arr);
		System.out.println("Array after bubble sort");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j] + "");

		}
	}
}
