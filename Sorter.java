

public class Sorter {
    public static void main(String[] args) {
        int[] array = {1,4,5,9,0,0,1,2,3};
        sort(array);
        for(int i = 0; i<array.length; i++)
        System.out.println(i);
    }


    ////----- Selescion sort ---////
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }
        // insertion sort implementation
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
    // sort array
    public static void sort (int array [])
    {
        insertionSort(array);
    }
}