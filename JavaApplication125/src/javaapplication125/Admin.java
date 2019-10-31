
    
package javaapplication125;

import java.util.Arrays;


public class Admin {


    public static void sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++){
                if(arr[j]<arr[minIndex]) {
            minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        
        }
    }//end sort
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {3, -7, 9, -78, 0, 1};
        
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
}

