package java;

public class SentenceCalculator{
    public static int lettersToNumbers(String s){
        int score = 0;
        for (int i = 0; i < s.length(); i++) {
          if (Character.isUpperCase(s.charAt(i))) {
            score += (s.charAt(i) - 'A' + 1) * 2;
          }
          else if (Character.isLowerCase(s.charAt(i))) {
            score += s.charAt(i) - 'a' + 1;
          }
          else if (Character.isDigit(s.charAt(i))) {
            score += s.charAt(i) - '0';
          }
        }
        return score;
    }
}