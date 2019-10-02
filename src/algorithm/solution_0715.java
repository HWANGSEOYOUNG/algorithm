package algorithm;

import java.util.Arrays;

public class solution_0715 {

    public static void main(String[] args) {

        //insert sort
//        int[] arr = {8,6,4,3,2,0,1,5,9,7};
//
//        for (int i = 1; i < arr.length ; i++){
//            int j = i;
//            while (j > 0 && arr[j-1] > arr[j]){
//                int temp = arr[j-1];
//                arr[j-1] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        // 선택정렬
        int[] arr = {8,6,4,3,2,0,1,5,9,7};
        int len = arr.length;
        for(int i = 0; i < len-1; i++){
            int minIdx = i;
            for (int j = i+1; j <len; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }

            if( i != minIdx){
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

        //reverse
//        int[] arr = {9,8,7,6,5,4,3,2,1,0};
//
//        int size = arr.length;
//        int j = size-1;
//        for (int i = 0; i < size/2 ; i++,j--){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        int a = arr.length/2-1;
//        int temp = 0;
//        for (int i  = 1; i <= a; i++){
//            temp = arr[a+i];
//            arr[a+i] = arr[a-i];
//            arr[a-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

    }
}
