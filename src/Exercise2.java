public class Exercise2{
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args){
		int[] list = {1, 2, 3, 4};
		swap(list, 0, 3);
		System.out.print("The changed list is: ");
		for (int num : list)
			System.out.print(num + " ");
	}
}
