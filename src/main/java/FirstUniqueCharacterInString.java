import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {

        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : s.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }

        for( int i=0; i< s.length(); i++){
            if(charMap.get(s.charAt(i))== 1){
                return i;
            }
        }
    return -1;
    }
}
/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.
 */