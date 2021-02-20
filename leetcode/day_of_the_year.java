class Solution {
    public int dayOfYear(String date) {
        Map<Integer, Integer> days = new HashMap<>();
        addDays(days);
        System.out.println(Integer.parseInt(date.substring(0, 4)));
        if (isLeapYear(Integer.parseInt(date.substring(0, 4)))) {
            days.put(2, 29);
        } else {
            days.put(2, 28);
        }
        int result = 0;
        for (int i = 1; i < Integer.parseInt(date.substring(5, 7)); i++) {
            result += days.get(i);
        }
        return result + Integer.parseInt(date.substring(8, 10));
    }
    
    public void addDays(Map<Integer, Integer> map) {
        map.put(1, 31);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
    }

    public boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}

// https://leetcode.com/problems/day-of-the-year/