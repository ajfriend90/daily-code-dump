package java;

public class BackspacesInString {
  public String cleanString(String s) {
    StringBuilder sb = new StringBuilder();
    if (s == "") {return "";}
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '#') {
        if (sb.length() > 0) {
          sb.deleteCharAt(sb.length()-1);
        }
      } else {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }
}