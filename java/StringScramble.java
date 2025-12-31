package java;

public class StringScramble {
  public static String scramble(String str, int[] indices) {
    Character[] result = new Character[str.length()];
    for (int i = 0; i < str.length(); i++) {
      result[indices[i]] = str.charAt(i);
    }
    StringBuilder sb = new StringBuilder();
    for (Character ch : result) {
      sb.append(ch);
    }
    return sb.toString();
  }
}