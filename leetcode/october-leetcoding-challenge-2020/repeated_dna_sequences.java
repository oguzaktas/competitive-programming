class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet(), repeated = new HashSet();
        for (int i = 0; i + 10 <= s.length(); i++) {
            if (!seen.add(s.substring(i, i + 10))) {
                repeated.add(s.substring(i, i + 10));
            }
        }
        return new ArrayList(repeated);
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3498/

/* Initial solution (time limit exceeded)
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> sequences = new ArrayList<String>();
        List<String> result = new ArrayList<String>();
        if (s.length() < 10) {
            return new ArrayList<String>();
        }
        int i = 0;
        while (i + 10 <= s.length()) {
            if (sequences.contains(s.substring(i, i + 10))) {
                if (!result.contains(s.substring(i, i + 10))) {
                    result.add(s.substring(i, i + 10));
                }
            }
            sequences.add(s.substring(i, i + 10));
            i++;
        }
        return result;
    }
}
*/
/* C++ solution (https://leetcode.com/problems/repeated-dna-sequences/discuss/53952/20-ms-solution-(C%2B%2B)-with-explanation);
vector<string> findRepeatedDnaSequences(string s) {
    if (s.size() <= 10)
        return vector<string>();

    vector<string> R;
    bitset<1<<20> S1;
    bitset<1<<20> S2;
    
    int val = 0;
    for (int i = 0; i < 10; i++) // Calc. the has value for the first string.
        val = (val << 2) | char2val(s[i]);
    S1.set(val);
    cout << val << " | ";
    
    int mask = (1 << 20) - 1;
    for (int i = 10; i < s.size(); i++) {
        // Calc the hash value for the string ending at position i.
        val = ((val << 2) & mask) | char2val(s[i]);  
        if (S2[val])
            continue;
        if (S1[val]) {
            R.push_back(s.substr(i - 10 + 1, 10));
            S2.set(val);
        }
        else
            S1.set(val);
    }
    return R;
}

int char2val(char c) {
    switch (c) {
        case 'A':
            return 0;
        case 'C':
            return 1;
        case 'G':
            return 2;
        case 'T':
            return 3;
    }
}
*/