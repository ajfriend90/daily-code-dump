package java;
// Implement a function that squares each digit of a given integer and concatenates the results.

public class SquareDigit {

  public int squareDigits(int n) {
    StringBuilder result = new StringBuilder();
    for (char digitChar : String.valueOf(n).toCharArray()) {
      int digit = Character.getNumericValue(digitChar);
      int squared = digit * digit;
      result.append(squared);
    }
    return Integer.parseInt(result.toString());
  }
}