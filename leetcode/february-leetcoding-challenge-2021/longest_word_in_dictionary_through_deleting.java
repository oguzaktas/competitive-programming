class Solution {
    public String findLongestWord(String s, List<String> d) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < d.size(); i++) {
            int k = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (k >= d.get(i).length()) {
                    break;
                }
                if (d.get(i).charAt(k) == s.charAt(j)) {
                    k++;
                    sb.append(s.charAt(j));
                } else {
                    continue;
                }
            }
            if (sb.toString().equals(d.get(i))) {
                list.add(d.get(i));
            }
        }
        Collections.sort(list, new LengthFirstComparator());
        if (list.isEmpty()) {
            return new String();
        } else {
            return list.get(0);
        }
    }
}

class LengthFirstComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {             
        if (o1.length() != o2.length()) {
            return o2.length() - o1.length();
        }
        return o1.compareTo(o2);
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3649/