package java;

import java.util.ArrayList;
public class FindOutlier {
  static int find(int[] integers) {
    ArrayList<Integer> odds = new ArrayList<>();
    ArrayList<Integer> evens = new ArrayList<>();
    for (int num : integers) {
      if (num % 2 == 0) {
        evens.add(num);
      } else {
        odds.add(num);
      }
    }
    return (evens.size() == 1) ? evens.get(0) : odds.get(0);
  }
}