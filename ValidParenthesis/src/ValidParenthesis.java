import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("{{}[][[[]]]}"));
    }
    public static boolean isValid(String s){
        final char L_PAREN    = '(';
        final char R_PAREN    = ')';
        final char L_BRACE    = '{';
        final char R_BRACE    = '}';
        final char L_BRACKET  = '[';
        final char R_BRACKET  = ']';

        if(s.length()%2==1) return false;
        else{
            Stack<Character> stackOfCharacters = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char currentCharacter = s.charAt(i);
                if(currentCharacter == L_PAREN || currentCharacter == L_BRACE || currentCharacter == L_BRACKET){
                    stackOfCharacters.push(currentCharacter);
                }
                else{
                    if (stackOfCharacters.isEmpty()) return false;
                    char lastStackCharacter = stackOfCharacters.pop();
                    if(currentCharacter == R_PAREN && lastStackCharacter != L_PAREN) return false;
                    if(currentCharacter == R_BRACE && lastStackCharacter != L_BRACE) return false;
                    if(currentCharacter == R_BRACKET && lastStackCharacter != L_BRACKET) return false;
                }
            }
            return stackOfCharacters.isEmpty();
        }
    }
}
