package findTheDifference;

import java.util.HashMap;
import java.util.HashSet;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "abcdef";
        System.out.println("The difference is: " + findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> lettersOccurenceS = new HashMap<>();
        HashMap<Character, Integer> lettersOccurenceT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (lettersOccurenceS.containsKey(s.charAt(i))){
                lettersOccurenceS.replace(s.charAt(i), lettersOccurenceS.get(s.charAt(i))+1);
            }
            else{
                lettersOccurenceS.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (lettersOccurenceT.containsKey(t.charAt(i))){
                lettersOccurenceT.replace(t.charAt(i), lettersOccurenceT.get(t.charAt(i))+1);
            }
            else{
                lettersOccurenceT.put(t.charAt(i), 1);
            }
        }

        for (char key: lettersOccurenceT.keySet()
             ) {
            if (!lettersOccurenceS.keySet().contains(key)) return key;
            else{
                if (lettersOccurenceS.get(key)!=lettersOccurenceT.get(key)){
                    return key;
                }
            }
        }

        return "".charAt(0);
    }
}
