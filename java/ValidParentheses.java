import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidParentheses{
    static boolean validParentheses(String target) {
        char[] targetArray = target.toCharArray();
        int roundL = 0;
        int squareL = 0;
        int curlyL = 0;
        int roundR = 0;
        int squareR = 0;
        int curlyR = 0;
        for (char ch: target.toCharArray()) {
            if (ch == '(') {
                roundL += 1;
            } else if (ch == '[') {
                squareL += 1;
            } else if (ch == '{') {
                curlyL += 1;
            } else if (ch == ')') {
                roundR += 1;
            } else if (ch == ']') {
                squareR += 1;
            } else if (ch == '}') {
                curlyR += 1;
            }
        }
        return ( ( roundL + roundR ) % 2 +( squareL + squareR ) % 2 + ( curlyL + curlyR ) % 2 )== 0 ? true : false;
    }
        // if ( (a=='(' && b==')') || 
        //     (a=='[' && ( b==']' || b == '(') ) || 
        //     (a=='{' && ( b=='}' || b == '[' || b == '(') ) ||
        //     (a==')' && ( b=='(' || b == '[' || b == '{') ) ) {
        //     return validParentheses(newList);
        // }


    static boolean validParentheses(List<Character> charList) {
        Character a,b = null;
        List<Character> newList = new ArrayList<Character>();
        for (int i = 0; i < charList.size(); i++) {
            if (i + 1 == charList.size()  ) {
                newList.add(charList.get(i));
                break;
            }

            a = charList.get(i);
            b = charList.get(i+1);
            
            if ( (a=='(' && b==')' ) || (a=='[' && b==']' ) || (a=='{' && b=='}' ) ) {
                i += 1;
                continue;
            }
            newList.add(a);
        }
        if (newList.size() == 0) return true;
        // if (newList.size() < 3) return false;
        if (newList.size() == charList.size()) return false;
        return validParentheses(newList);
    }

    public static void main(String[] args) {
        String target = "{[]}";
        
        char[] charArray = target.toCharArray();
        Character[] charObjectArray = target.chars().mapToObj(c -> (char)c).toArray(Character[]::new); 

        boolean result = false;
        if ( charArray.length % 2 == 1 ) {
            result = false;
        }
        List<Character> charList = new ArrayList<Character>(Arrays.asList(charObjectArray));
        result = validParentheses(charList);
        System.out.println(result);
    }
}
