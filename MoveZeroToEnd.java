package com.example.baisc;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] arr = {3, 0, 4, 0, 0, 1, 12};

        int index = 0; // position for next non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                System.out.println("temp"+temp);
                arr[i] = arr[index];
                System.out.println("arr[i]"+arr[i] );                
                arr[index] = temp;
                System.out.println("arr[index]"+arr[index]);
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));
	}

}
