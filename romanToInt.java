class Solution {
    Map<String, Integer> romanMap  = new HashMap<String, Integer>(){{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};
    // 1249 = MCCXLIX
    public int romanToInt(String s) {
        int totalSum = 0;
        int currentNumber = 0;
        int lastNumber = 0;
        for (int i=0; i<s.length(); i++) {
            String charac = Character.toString(s.charAt (i));
            currentNumber = romanMap.get(charac);
            if (lastNumber < currentNumber) {
                totalSum = totalSum-lastNumber + (currentNumber-lastNumber);
            } else {
                totalSum+=currentNumber;
            }
            lastNumber = romanMap.get(charac);
        }
        return totalSum;
    }
}