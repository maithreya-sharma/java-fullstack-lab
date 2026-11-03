package com.maithreya.core.drills;

import java.util.Arrays;

public class ArrayDrills {
  public static int[] sum(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          return new int[] {arr[i], arr[j]};
        }
      }
    }
    return new int[]{};
  }

  public static int[] moveZeros(int[] arr) {
    int pos = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int tmp = arr[pos];
        arr[pos] = arr[i];
        arr[i] = tmp;
        pos++;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    System.out.println(Arrays.toString(sum(nums, 9)));
    System.out.println(Arrays.toString(sum(nums, 6)));
    System.out.println(Arrays.toString(sum(nums, 100)));
    int[] ints = {0, 1, 0, 2, 3};
    System.out.println(Arrays.toString(moveZeros(ints)));
  }
}
