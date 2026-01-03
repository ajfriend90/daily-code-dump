package java;

class Kata {
    static String AlphabetPosition(String text) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < text.length(); i++) {
        if (Character.isLetter(text.charAt(i))) {
          sb.append(Character.toLowerCase(text.charAt(i))-96);
          sb.append(" ");
        }
      }
      return sb.toString().trim();
    }
}