class Solution {
    public String removeDuplicateLetters(String s) {
        if (s == null || s.length() == 1) {
            return s;
        }
        Map<Character, ArrayList<Integer>> counts = new HashMap<Character, ArrayList<Integer>>();
        ArrayList<Character> keys = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!counts.containsKey(s.charAt(i))) {
                counts.put(s.charAt(i), new ArrayList<Integer>());
                keys.add(s.charAt(i));
            }
            counts.get(s.charAt(i)).add(i);
        }
        Collections.sort(keys);
        StringBuilder sb = new StringBuilder();
        while (!counts.isEmpty()) {
            boolean found = true;
            for (int i = 0; i < keys.size(); i++) {
                int index = counts.get(keys.get(i)).get(0);
                for (int j = 0; j < keys.size(); j++) {
                    ArrayList<Integer> count = counts.get(keys.get(j));
                    if (count.get(count.size() - 1) < index) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    sb.append(keys.get(i));
                    counts.remove(keys.get(i));
                    keys.remove(i);
                    for (int j = 0; j < keys.size(); j++) {
                        ArrayList<Integer> count = counts.get(keys.get(j));
                        while (count.get(0) < index) {
                            count.remove(0);
                        }
                    }
                    break;
                }
                found = true;
            }
        }
        return sb.toString();
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3491/
/* Java solution using stack;
class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Stack<Character> st = new Stack<Character>();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                continue;
            }
            while(!st.isEmpty() && map.get(st.peek()) > 1 && st.peek() > s.charAt(i)){
                char c = st.pop();
                map.put(c, map.get(c) - 1);
                set.remove(c);
            }
            
            st.push(s.charAt(i));
            set.add(s.charAt(i));
        }
        String res = "";
       
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
    }
}
*/