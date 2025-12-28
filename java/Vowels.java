package java;
import java.util.ArrayList;

public class Vowels {

  public static int getCount(String str) {
    int count = 0;
    ArrayList<Character> vowels = new ArrayList<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    char[] charArray = str.toCharArray();
    for (char ch : charArray) {
      if (vowels.contains(ch)) {
        count++;
      }
    }
    return count;
  }
}