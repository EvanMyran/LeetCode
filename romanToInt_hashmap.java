import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        //BUILD THE HASHMAP VALUES
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0;
        for(int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            if(i + 1 < s.length()) {
                int next = map.get(s.charAt(i + 1));

                if(current >= next) {
                    total += current;

                } else {
                    total -= current;
                }

            } else {
                total += current;
            }
        }
        return total;

    }
}
