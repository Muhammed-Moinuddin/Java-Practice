import java.util.*;
//By Muhammad Moinuddin (EB20102083)
public class Sorting {
    //time complexity = O(n^2)
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Bubble sort used: " + Arrays.toString(arr));
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection sort used: " + Arrays.toString(arr));
    }
    public static void main(String args[]){
        int arr[] = {4,6,1,9,5,3};
        int arr2[] = {2,4,10,1,6,5,3};
        bubbleSort(arr);
        selectionSort(arr2);
    }
}