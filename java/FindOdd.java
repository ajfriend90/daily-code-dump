package java;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
      Map<Integer, Integer> frequencyMap = new HashMap<>();
      for (int num : a) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
      }
      for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        if (entry.getValue() % 2 == 1) {return entry.getKey();}
      }
      return 0;
    }
}