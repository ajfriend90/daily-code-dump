package java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// My first attempt, not understanding really how to use the regex symbols
public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
      Pattern frontJunk = Pattern.compile("[\\d+]+_");
      Matcher frontMatcher = frontJunk.matcher(dirtyFileName);
      String cleanFileName = frontMatcher.replaceAll("");
      Pattern backJunk = Pattern.compile("\\.\\w+$");
      Matcher backMatcher = backJunk.matcher(cleanFileName);
      cleanFileName = backMatcher.replaceAll("");
      return cleanFileName;
    }
}

// Cleaned up version after looking it up more
/* public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
      return dirtyFileName.replaceAll("^\\d+_|\\.[^.]+$", "");
    }
} */