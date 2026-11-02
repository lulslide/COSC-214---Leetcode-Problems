import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> values = new HashMap<>();

        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = values.get(s.charAt(i));

            if (i + 1 < s.length() && current < values.get(s.charAt(i + 1))) {
                total = total - current;
            } else {
                total = total + current;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        String roman = "IV";

        int result = romanToInt(roman);

        System.out.println("Roman Numeral: " + roman);
        System.out.println("Integer: " + result);
    }
}
