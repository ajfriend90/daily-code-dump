package java;

public class GenerateShape {
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            sb.append("+");
          }
          sb.append("\n");
        }
      sb.deleteCharAt(sb.length()-1);
      return sb.toString();
    }
}