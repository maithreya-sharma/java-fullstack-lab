package com.maithreya.core.drills;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayDrillsTest {
  int[] nums = {1,2,3,4,5};
  int[] ints = {0, 1, 0, 2, 3};
  @Test
  void testSum9() {
    assertArrayEquals(new int[] {4, 5}, ArrayDrills.sum(nums, 9));
  }

  @Test
  void testSum6() {
    assertArrayEquals(new int[] {1, 5}, ArrayDrills.sum(nums, 6));
  }

  @Test
  void testSum100() {
    assertArrayEquals(new int[] {}, ArrayDrills.sum(nums, 100));
  }

  @Test
  void testMoveZeros() {
    assertArrayEquals(new int[] {1, 2, 3, 0, 0}, ArrayDrills.moveZeros(ints));
  }
}
