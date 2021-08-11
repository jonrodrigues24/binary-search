package edu.cnm.deepdive;

import java.util.Iterator;

public class Search {

  public static int linearSearch(int[] haystack, int needle) {

    int position = -1;

    for(int i = 0; i < haystack.length; i++) {
      if (haystack[i] == needle) {
        position = i;
        break;
      }
    }
    return position;
  }

  private static int binarySearch(int[] haystack, int needle, int start, int end) {
    int position = ~start;
    if (end > start) {
      int mid = (start + end) / 2;
      int value = haystack[mid];
      
      if (value == needle) {
        position = mid;
      } else if (value < needle) {
        position = binarySearch(haystack, needle, mid + 1, end);
      } else {
        position = binarySearch(haystack, needle, start, mid);
      }

    }
    return position;
  }

}
