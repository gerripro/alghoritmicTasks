class Solution {
    Map<Character, Integer> romanMap  = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    // 1249 = MCCXLIX
    public int romanToInt(String s) {
        int len = s.length();
        int totalSum = 0;
        int currentNumber = 0;
        int lastNumber = 0;
        for (int i=0; i<len; i++) {
            currentNumber = romanMap.get(s.charAt (i));
            if (lastNumber < currentNumber) {
                totalSum = totalSum-lastNumber + (currentNumber-lastNumber);
            } else {
                totalSum+=currentNumber;
            }
            lastNumber = romanMap.get(s.charAt (i));
        }
        return totalSum;
    }
}