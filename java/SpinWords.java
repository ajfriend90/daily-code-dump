package java;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      if (word.length() >= 5) {
        StringBuilder w = new StringBuilder(word);
        w.reverse();
        sb.append(w + " ");
      } else {
        sb.append(word + " ");
      }
    }
    String result = sb.toString().trim();
    return result;
  }
}