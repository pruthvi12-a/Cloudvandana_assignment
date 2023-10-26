import java.util.HashMap;

public class Roman {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Integer equivalent of " + romanNumeral + " is: " + integerEquivalent);
    }
}
