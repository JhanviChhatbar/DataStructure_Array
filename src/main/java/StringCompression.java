import java.util.ArrayList;
import java.util.List;

public class StringCompression {

    public int compress(char[] chars) {

      int w =0;
      int n = chars.length;
      int i = 0;

      while (i < n){
          char current = chars[i];
          int start = i;

          while (i < n && current == chars[i]){
              i++;
          }

          int count = i - start;

          chars[w++] = current;

          if(count > 1){
              String s = String.valueOf(count);
              for(char c : s.toCharArray()){
                  chars[w++] = c;
              }
          }
      }
        return w;
    }
}
