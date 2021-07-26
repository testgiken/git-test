import java.util.Random;

public class Main {

    public static void main(String[] args) {
	 int [] arr = new int[100];
	 Random rand = new Random();
	 for (int i = 0; i < arr.length; i++) {
	     arr[i] = rand.nextInt(100);
     }
	 sort(arr);
	 printArr(arr);
    }

    public static void sort(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            for(int i = left; i < right; i++){
                if(arr[i] > arr[i + 1])
                    swap(arr, i, i + 1);
            }
            right--;
            for(int i = right; i > left; i--){
                if(arr[i] < arr[i - 1])
                    swap(arr, i, i - 1);
            }
            left++;
        }
    }

    public static void printArr(int [] arr){
        for(int item : arr)
            System.out.print(item + " ");
    }

    public static void foo () {
        
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
